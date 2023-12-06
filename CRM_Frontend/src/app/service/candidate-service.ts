import {Injectable} from "@angular/core";
import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import {observable, Observable} from "rxjs";
import { Candidate } from "../model/candidate";
import { CandidateDetail } from "../model/candidate-detail";

@Injectable({
  providedIn: 'root'
})
export class CandidateService
{
  private baseURL = ""; // TODO
  constructor(private httpClient:HttpClient)
  { }


}
