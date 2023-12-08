import { Injectable } from "@angular/core";
import { AuthenticationService } from "./authentication.service";
import {
  HttpInterceptor,
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpHeaders,
} from "@angular/common/http";
import { Observable } from "rxjs";
@Injectable({
  providedIn: "root",
})
export class HttpInterceptorService {
  constructor(private auth: AuthenticationService) {}
  intercept(
    req: HttpRequest<any>,
    next: HttpHandler
  ): Observable<HttpEvent<any>> {
    console.log("intercepted");
    if (this.auth.authenticated && req.url.indexOf("basicauth") === -1) {
      console.log("authenticated");
      const authReq = req.clone({
        headers: new HttpHeaders({
          Authorization: `${this.auth.getAuthenticatedUser()}`,
        }),
      });
      return next.handle(authReq);
    } else {
      return next.handle(req);
    }
  }
}
