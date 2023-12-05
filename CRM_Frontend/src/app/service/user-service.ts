import {Injectable} from "@angular/core";
import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import {observable, Observable} from "rxjs";
import { User } from "../model/user";
import { UserDetail } from "../model/user-detail";


@Injectable({
  providedIn: 'root'
})
export class UserService
{
  private baseURL = ""; // TODO

  constructor(private httpClient:HttpClient)
  { }

  login(emailId:string, password:string):Observable<User>
  {
    // TODO
    // This is an example, please change the following code.
    const info = {
      emailId: emailId,
      password: password
    }
    const params = new HttpParams({
      fromObject: info
    });
    return this.httpClient.post<User>(this.baseURL + '', params);
  }

}
