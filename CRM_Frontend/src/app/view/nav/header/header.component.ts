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

  logout()
  {
    window.sessionStorage.removeItem("SNVA_CRM_USER");
    window.location.href = "login";
  }
  setUserId(userId:number)
  {
    this.userID = userId;
  }
  myAccount()
  {
<<<<<<< HEAD
    //window.location.href = this.userRole + "/check/user/detail/" + this.userID;
    this.router.navigate(["superAdmin/check/user/detail/" + this.userID]);
=======
    this.router.navigate([this.userRole + "/check/user/detail/myAccount"]);
>>>>>>> origin/main
  }
  accountlist()
  {
    this.router.navigate([this.userRole + "/manage/user"]);
  }

  candidatelist()
  {
    this.router.navigate([this.userRole + "/manage/candidate"]);
  }

  goDashboard()
  {
    this.router.navigate([this.userRole + "/homepage"]);
  }

  showAddNewUser()
  {

  }
}
