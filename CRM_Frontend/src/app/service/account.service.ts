import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { User } from '../model/user';
import {CandidateBack} from "../model/candidate-back";

@Injectable({
  providedIn: 'root'
})
export class AccountService
{
  constructor(private httpClient: HttpClient,private router:Router) { }

  getUserById(userId:number):Observable<User>
  {
    return this.httpClient.get<User>('http://localhost:8080/getUserById/'+ userId)
  }

  getAllUser():Observable<User[]>{
    return this.httpClient.get<User[]>('http://localhost:8080/getAllUsers')
  }

  updateUser(user:User):Observable<User>
  {
    return this.httpClient.post<User>('http://localhost:8080/updateUser',  JSON.stringify(user)); // TODO 415 error
  }


}
