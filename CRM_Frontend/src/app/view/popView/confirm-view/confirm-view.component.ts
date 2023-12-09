import { Component } from '@angular/core';
import {BsModalRef, BsModalService} from 'ngx-bootstrap/modal';
import {Router} from "@angular/router";

@Component({
  selector: 'app-confirm-view',
  templateUrl: './confirm-view.component.html',
  styleUrls: ['./confirm-view.component.css']
})
export class ConfirmViewComponent
{
  message:string = 'reply message';
  error:string = '';

  constructor(public bsModalRef: BsModalRef,private modalService: BsModalService, private router: Router)
  {
    setTimeout( function () {bsModalRef.hide();}, 3000);
  }

}
