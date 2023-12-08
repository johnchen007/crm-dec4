import {Component, OnInit} from '@angular/core';
import {User} from "../../model/user";
import {UserService} from "../../service/user-service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-account-detail-view',
  templateUrl: './accountDetailView.html',
  styleUrls: ['./accountDetailView.css']
})
export class AccountDetailView implements OnInit
{

  userId:number = -1;
  currentUser:User = new User();
  currentStatus:string = "accountInfo";

  constructor(private router:ActivatedRoute, private userService:UserService)
  {
    // @ts-ignore
    let user:User = JSON.parse( window.sessionStorage.getItem('SNVA_CRM_USER') );
    user.password = 'test';
    userService.getUserById(this.userId, user).subscribe(data=>
      {
        console.log("[User start]");
        console.log(data);
        console.log("[User end]");
        this.currentUser = data;
      },
      error =>
      {
        console.log(error);
      }
    )
  }

  changeStatus( status:string )
  {
    this.currentStatus = status;
  }

  ngOnInit(): void
  {
    this.userId = this.router.snapshot.params['id'];
  }
}
