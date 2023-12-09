import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Candidate } from 'src/app/model/candidate';
import { CandidateService } from 'src/app/service/candidate-service';

@Component({
  selector: 'app-candidate-list',
  templateUrl: './candidateListView.html',
  styleUrls: ['./candidateListView.css']
})
export class CandidateListView
{

  userRole:string = 'admin';
  allCandidate:Candidate[] | undefined;
  constructor(private candidateService:CandidateService,private router:Router){}
  ngOnInit(){
    this.candidateService.getAllCandidates().subscribe(data=>{
      this.allCandidate=data;
      console.log(this.allCandidate);
    })
  }
  showCandidateDetail(candidateId:string)
  {
    // window.location.href = this.userRole + "/check/candidate/detail/" + candidateId;
    this.router.navigate([`${this.userRole}/check/candidate/detail/${candidateId}`])
  }
  showAddNewAccountView() {

    this.router.navigate([`${this.userRole}/add/candidate/`])
    }
}
