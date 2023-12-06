import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

  fullName!:String;

  constructor(){}

  ngOnInit() {
    sessionStorage.getItem("");//full name will come form here
    this.fullName="The Fullname of the user goes here"}

  logout(){
    sessionStorage.setItem('isLoggedIn', 'false');
    sessionStorage.removeItem('token');
  }
}
