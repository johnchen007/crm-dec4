import { Component } from '@angular/core';
import {User} from "../../model/user";

@Component({
  selector: 'app-account-detail-view',
  templateUrl: './accountDetailView.html',
  styleUrls: ['./accountDetailView.css']
})
export class AccountDetailView
{

  currentUser:User = new User();
  currentStatus:string = "accountInfo";

  /*
  accountInfo;
  phoneNumber;
  emailId;
  resetPassword;
  mailAddress
   */

  changeStatus( status:string )
  {
    this.currentStatus = status;
  }

}
