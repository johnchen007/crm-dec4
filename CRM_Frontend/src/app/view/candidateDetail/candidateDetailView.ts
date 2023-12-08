import { Component } from '@angular/core';
import {Candidate} from "../../model/candidate";

@Component({
  selector: 'app-candidate-detail-view',
  templateUrl: './candidateDetailView.html',
  styleUrls: ['./candidateDetailView.css']
})
export class CandidateDetailView {

  pageStatus:string = "recruiter";

  candidate:Candidate = new Candidate();
  // Method to handle file selection for resume and otherFile inputs
  onFileSelected(event: any, field: string) {
    const selectedFile = event.target.files[0];

    // Depending on the field parameter, assign the selected file to the corresponding property
    if (field === 'resume') {
      this.candidate.resume = selectedFile;
    } else if (field === 'otherFile') {
      this.candidate.otherFile = selectedFile;
    }
  }
  onSubmit(){
  }


  chanegStatus(s:string)
  {
    this.pageStatus = s;
  }


}
