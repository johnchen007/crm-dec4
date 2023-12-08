import {Injectable} from "@angular/core";
import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import {observable, Observable} from "rxjs";
import { Candidate } from "../model/candidate";
import { CandidateDetail } from "../model/candidate-detail";
import { CandidateBack } from "../model/candidate-back";

@Injectable({
  providedIn: 'root'
})
export class CandidateService
{
  private baseURL = "http://localhost:8080/Candidates"; // TODO
  constructor(private http:HttpClient)
  { }

  getAllCandidates(){
    return this.http.get<Candidate[]>(this.baseURL+"/all")
    }
    getCandidate(id:string){
      return this.http.get<CandidateBack>(`${this.baseURL}/${id}`)
    }


}
