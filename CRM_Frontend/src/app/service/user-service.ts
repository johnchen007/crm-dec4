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

  // TODO Not Working
  getUserById(userId:number, requestUser:User):Observable<User>
  {
    /*
    const headers = new HttpHeaders(requestUser ?
      {
        authorization : this.createBasicAuthToken(requestUser.username,requestUser.password)
      } : {});
    */
    return this.httpClient.get<User>('http://localhost:8080/getUserById/'+ userId)
  }

  createBasicAuthToken(username: String, password: String)
  {
    return 'Basic ' + window.btoa(username + ":" + password)
  }

}
