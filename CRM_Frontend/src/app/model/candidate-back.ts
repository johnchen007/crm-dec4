import { CandidateDetail } from "./candidate-detail";

export class CandidateBack {
    candidateId:string="";
    email:string="";
    firstName:string="";
    lastName:string="";
    middleName:string="";
    phoneNumber:string="";
    recruiterName:string="";
    ssn:string="";
    visaStatus:string="";
    workExperience:string="";
    details:CandidateDetail=new CandidateDetail();
}
