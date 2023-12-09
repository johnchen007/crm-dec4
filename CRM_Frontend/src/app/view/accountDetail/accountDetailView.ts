import {Component, OnInit} from '@angular/core';
import {User} from "../../model/user";
import {ActivatedRoute} from "@angular/router";
import {AccountService} from "../../service/account.service";

@Component({
  selector: 'app-account-detail-view',
  templateUrl: './accountDetailView.html',
  styleUrls: ['./accountDetailView.css']
})
export class AccountDetailView implements OnInit
{

  userId:any = 1;
  currentUser:User = new User();
  currentStatus:string = "accountInfo";

  constructor(private router:ActivatedRoute, private accountService:AccountService)
  {
    if(this.userId == 'myAccount')
    {
      // @ts-ignore
      this.currentUser =  JSON.parse( window.sessionStorage.getItem('SNVA_CRM_USER') );
    }
    else
    {
      accountService.getUserById(this.userId).subscribe(data=>
        {
          this.currentUser = data;
        },
        error =>
        {
          console.log(error);
        }
      )
    }
  }
  changeStatus( status:string )
  {
    this.currentStatus = status;
  }

  ngOnInit(): void
  {
    this.userId = this.router.snapshot.params['id'];
  }

  updatePhone():void
  {
    let newPhone = (document.getElementById('newPhone') as HTMLInputElement).value;
    this.currentUser.phone = newPhone;
    this.accountService.updateUser(this.currentUser).subscribe(
      data =>
      {
        console.log(data);
      },
      error =>
      {
        console.log(error);
      }
    );
  }
}
