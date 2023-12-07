import { Component } from '@angular/core';
import {BsModalRef, BsModalService} from 'ngx-bootstrap/modal';

@Component({
  selector: 'app-confirm-view',
  templateUrl: './confirm-view.component.html',
  styleUrls: ['./confirm-view.component.css']
})
export class ConfirmViewComponent
{
  message:string = 'reply message';
  error:string = 'error';
  url:string = '';

  constructor(public bsModalRef: BsModalRef)
  {
  }
}
