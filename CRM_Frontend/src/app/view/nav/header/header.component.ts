import {Component, Input} from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent
{

  @Input() title:any;
  @Input() userName: any;
  @Input() userRole: any;

  fullName:string = "User Name";
  logout()
  {

  }
}
