import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CandidateBack } from 'src/app/model/candidate-back';
import { NextCand } from 'src/app/model/next-cand';
import { CandidateService } from 'src/app/service/candidate-service';

@Component({
  selector: 'app-add-candidate',
  templateUrl: './add-candidate.component.html',
  styleUrls: ['./add-candidate.component.css']
})
export class AddCandidateComponent {
  pageStatus:string = "recruiter";
  candidateId:NextCand=new NextCand();
   // @ts-ignore
  user:User = JSON.parse( window.sessionStorage.getItem('SNVA_CRM_USER') );
  constructor(private router:ActivatedRoute,private candidateService:CandidateService,private route:Router) {}

  candidate:CandidateBack = new CandidateBack();
  // Method to handle file selection for resume and otherFile inputs
  ngOnInit(): void
  {
   this.candidateService.setNextCandidateId().subscribe(data=>{
    console.log(data);
    this.candidate.candidateId=data.candidateId;
    this.candidate.recruiterName=this.user.firstName;
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
