import { Component } from '@angular/core';

@Component({
  selector: 'app-recruiter-header',
  templateUrl: './recruiter-header.component.html',
  styleUrls: ['./recruiter-header.component.css']
})
export class RecruiterHeaderComponent {

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
