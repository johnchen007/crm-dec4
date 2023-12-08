import { Component } from '@angular/core';
import {MenuData} from "../../data/menuData";
import { BsModalService, BsModalRef } from 'ngx-bootstrap/modal';
import {ConfirmViewComponent} from "../popView/confirm-view/confirm-view.component";
import {AddNewUser} from "../popView/addNewUser/addNewUser";
import { User } from 'src/app/model/user';
import { AccountService } from 'src/app/service/account.service';
@Component({
  selector: 'app-account-list',
  templateUrl: './accountListView.html',
  styleUrls: ['./accountListView.css']
})
export class AccountListView
{
  menuData:MenuData = new MenuData();
  currentRole:string = 'Role';
  currentStatus:string = 'Status';
  accountList:User[] = [];
  userRole:string = 'admin';

  constructor(private modalService: BsModalService, private accountService:AccountService )
  {
  }
  ngOnInit()
  {
    this.getAllAccount();
  }
  getAllAccount(){
    this.accountService.getAllUser().subscribe(data => {
      this.accountList = data;
      console.log(this.accountList);
    })
  }
  filterSetRole(role:string)
  {
    if(role == 'All Accounts')
    {
      this.currentRole = 'Role'
    }
    else if(role == 'Super Admin')
    {
      this.currentRole = 'SuperAdmin'
    }
    else if(role == 'Admin Only')
    {
      this.currentRole = 'Admin'
    }
    else if(role == 'User Only')
    {
      this.currentRole = 'User'
    }
    else if(role == 'Recruiter Manager')
    {
      this.currentRole = 'rAdmin'
    }
    else if(role == 'Training Manager')
    {
      this.currentRole = 'tAdmin'
    }
    else if(role == 'BD Manager')
    {
      this.currentRole = 'bdAdmin'
    }
    else if(role == 'Business Developer')
    {
      this.currentRole = 'BD'
    }
    else
    {
      this.currentRole = role;
    }
  }

  filterSetStatus(status:string)
  {
    if(status == 'All Status')
    {
      this.currentStatus = 'Status';
    }
    else
    {
      this.currentStatus = status;
    }
  }

  showAddNewAccountView()
  {
    this.modalService.show(AddNewUser, {class: 'modal-md popBox-h'});
  }

  showAccountDetail(userId:number)
  {
    window.location.href = this.userRole + "/check/user/detail/" +userId;
  }
}
