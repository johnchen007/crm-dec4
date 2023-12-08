import {Component, Input} from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent
{
  constructor(private router:Router){}
  @Input() title:any;

  @Input() userID:any;
  @Input() userName: any;
  @Input() userRole: any;

  fullName:string = "User Name";
  logout()
  {
    window.sessionStorage.removeItem("SNVA_CRM_USER");
    window.location.href = "login";
  }

  myAccount()
  {
    //window.location.href = this.userRole + "/check/user/detail/" + this.userID;
    this.router.navigate(["superAdmin/check/user/detail/1"]);
  }
  accountlist()
  {
    this.router.navigate(["superAdmin/manage/user"]);
  }
  accountCandidatelist(){
    this.router.navigate(["superAdmin/manage/candidate"]);
  }
}
