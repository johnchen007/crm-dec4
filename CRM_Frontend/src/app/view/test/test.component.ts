import { Component } from '@angular/core';
import { BsModalService, BsModalRef } from 'ngx-bootstrap/modal';
import {ConfirmViewComponent} from "../popView/confirm-view/confirm-view.component";

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent
{
  //bsModalRef: BsModalRef;

  constructor(private modalService: BsModalService)
  {
  }

  openPopWindow()
  {
    this.modalService.show(ConfirmViewComponent, {class: 'modal-lg popBox'});
  }

}
