import { Component } from '@angular/core';
import { Candidate } from 'src/app/model/candidate';
@Component({
  selector: 'app-candidate-form',
  templateUrl: './candidate-form.component.html',
  styleUrls: ['./candidate-form.component.css']
})
export class CandidateFormComponent {
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
}
