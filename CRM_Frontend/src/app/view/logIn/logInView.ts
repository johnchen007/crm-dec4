import { Component } from '@angular/core';
import {User} from "../../model/user";
import {AuthenticationService} from "../../service/authentication.service";
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
  selector: 'app-log-in',
  templateUrl: './logInView.html',
  styleUrls: ['./logInView.css']
})
export class LogInView
{
  user:User = new User();
  loginError:boolean = false;
  constructor(private app: AuthenticationService, private http: HttpClient, private router: Router) {}
  logIn()
  {
    //console.log(this.user);
    this.app.authenticate(this.user).subscribe(data=>{
        console.log("[User start]");
        console.log(data);
        console.log("[User end]");
        window.sessionStorage.setItem("SNVA_CRM_USER", JSON.stringify(data));
        this.app.registerSuccessfulLogin(this.user);
        this.redirectUser(data.role);
      },
      error => {
        console.log(error);
        this.loginError=true;
        //this.router.navigate(['login'])
      })
  }
  redirectUser(role:string)
  {
    if(role==='USER'){
      console.log("User")
      window.location.href = 'user/homepage';
    }
    if(role==='ADMIN'){
      console.log("Admin")
      window.location.href = 'admin/homepage';
    }
    if(role==='SU'){
      console.log("SU")
      //window.location.href = 'superAdmin/homepage';
      this.router.navigate(["superAdmin/homepage"]);
    }
  }
  resetPassword()
  {

  }
}
