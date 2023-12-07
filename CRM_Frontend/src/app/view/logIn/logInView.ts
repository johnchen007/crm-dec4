import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from 'src/app/service/authentication.service';
import { User } from 'src/app/model/user';
@Component({
  selector: 'app-log-in',
  templateUrl: './logInView.html',
  styleUrls: ['./logInView.css']
})
export class LogInView {
  user:User = new User();
  loginError:boolean = false;
  constructor(private app: AuthenticationService, private http: HttpClient, private router: Router) {}
  logIn()
  {
    console.log(this.user);
    this.app.authenticate(this.user).subscribe(data=>{
      console.log(data);
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
      this.router.navigate(['user-landing'])
    }
    if(role==='ADMIN'){
      console.log("Admin")
      this.router.navigate(['admin'])
    }
    if(role==='SU'){
      console.log("SU")
      this.router.navigate(['superAdmin/homepage'])
    }
  }
  resetPassword()
  {
    
  }
}