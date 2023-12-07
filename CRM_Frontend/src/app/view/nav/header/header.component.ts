import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

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
