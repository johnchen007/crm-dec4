import { Injectable } from '@angular/core';
import { User } from '../model/user';
import { Router } from '@angular/router';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable, map } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class UserService
{
  private baseURL = ""; // TODO

  constructor(private httpClient:HttpClient)
  { }

  getUserById(userId:number):Observable<User>
  {
    return this.httpClient.get<User>('http://localhost:8080/getUserById/'+ userId)
  }


}
