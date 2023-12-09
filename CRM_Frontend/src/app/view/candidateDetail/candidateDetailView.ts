import { Component } from '@angular/core';
import {Candidate} from "../../model/candidate";
import { ActivatedRoute, Route, Router } from '@angular/router';
import { CandidateService } from 'src/app/service/candidate-service';
import { CandidateBack } from 'src/app/model/candidate-back';
import { User } from 'src/app/model/user';

@Component({
  selector: 'app-candidate-detail-view',
  templateUrl: './candidateDetailView.html',
  styleUrls: ['./candidateDetailView.css']
})
export class CandidateDetailView {


  pageStatus:string = "recruiter";
  candidateId:string="";
   // @ts-ignore
  user:User = JSON.parse( window.sessionStorage.getItem('SNVA_CRM_USER') );
  constructor(private router:ActivatedRoute,private candidateService:CandidateService,private route:Router) {}

  candidate:CandidateBack = new CandidateBack();
  // Method to handle file selection for resume and otherFile inputs
  ngOnInit(): void
  {
    this.candidateId = this.router.snapshot.params['id'];
    console.log(this.candidateId);
    this.candidateService.getCandidate(this.candidateId).subscribe(data=>{
      this.candidate=data;
      console.log(this.candidate);
      console.log(this.candidate.details)  
    })
    
  }

  save(candidate:CandidateBack) {
    console.log(candidate);
    this.candidateService.saveCandidate(candidate).subscribe(data=>{
      console.log(data);
      this.route.navigate([`/${this.user.role}/manage/candidate`])
    })
    }
  onFileSelected(event: any, field: string) {
    const selectedFile = event.target.files[0];

    // Depending on the field parameter, assign the selected file to the corresponding property
    // if (field === 'resume') {
    //   this.candidate.resume = selectedFile;
    // } else if (field === 'otherFile') {
    //   this.candidate.otherFile = selectedFile;
    // }
  }
  onSubmit(){
  }


  chanegStatus(s:string)
  {
    this.pageStatus = s;
  }


}
