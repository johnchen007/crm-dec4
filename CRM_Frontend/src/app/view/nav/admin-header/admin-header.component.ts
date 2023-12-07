import { Component } from '@angular/core';

@Component({
  selector: 'app-admin-header',
  templateUrl: './admin-header.component.html',
  styleUrls: ['./admin-header.component.css']
})
export class AdminHeaderComponent {

  fullName:string = "User Name";
  itemImageUrl!:String;
  constructor(){}

  ngOnInit() {
    sessionStorage.getItem(""); //full name will come form here
    //this.fullName="The Fullname of the user goes here";
    this.itemImageUrl = '../assets/logo.jpg';
  }

  logout(){
    sessionStorage.setItem('isLoggedIn', 'false');
    sessionStorage.removeItem('token');
  }

}
