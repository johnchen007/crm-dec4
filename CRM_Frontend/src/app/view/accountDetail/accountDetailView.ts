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

  userId:any = 1;
  currentUser:User = new User();
  currentStatus:string = "accountInfo";

  constructor(private router:ActivatedRoute, private userService:UserService)
  {
    if(this.userId == 'myAccount')
    {
      // @ts-ignore
      this.currentUser =  JSON.parse( window.sessionStorage.getItem('SNVA_CRM_USER') );
    }
    else
    {
      userService.getUserById(this.userId).subscribe(data=>
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
}
