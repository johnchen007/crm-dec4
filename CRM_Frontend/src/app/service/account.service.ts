import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { User } from '../model/user';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  constructor(private httpClient: HttpClient,private router:Router) { }
  getAllUser():Observable<User[]>{
    return this.httpClient.get<User[]>('http://localhost:8080/getAllUsers')
  }
}
