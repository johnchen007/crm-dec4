import {Component, Input} from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent
{

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
    window.location.href = this.userRole + "/check/user/detail/" + this.userID;
  }
}
