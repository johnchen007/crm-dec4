import { Component } from '@angular/core';

@Component({
  selector: 'app-candidate-list',
  templateUrl: './candidateListView.html',
  styleUrls: ['./candidateListView.css']
})
export class CandidateListView
{
  userRole:string = 'admin';

  showCandidateDetail(candidateId:string)
  {
    window.location.href = this.userRole + "/check/candidate/detail/" + candidateId;
  }

}
