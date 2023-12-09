import { NgModule } from '@angular/core';

import { BrowserModule } from '@angular/platform-browser';
import { NgParticlesModule } from 'ng-particles';
import { NgConfettiModule } from 'ng-confetti';
import { NgFireworksModule } from 'ng-fireworks';
import { ModalModule } from 'ngx-bootstrap/modal';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { LogInView } from './view/logIn/logInView';
import { AccountListView } from './view/accountList/accountListView';
import { AccountDetailView } from './view/accountDetail/accountDetailView';
import { CandidateListView } from './view/candidateList/candidateListView';
import { CandidateDetailView } from './view/candidateDetail/candidateDetailView';
import { HomePageView } from './view/homePage/homePageView';
import { TestComponent } from './view/test/test.component';
import { HeaderComponent } from './view/nav/header/header.component';
import { FooterComponent } from './view/nav/footer/footer.component';
import { MessageViewComponent } from './view/popView/message-view/message-view.component';
import { ConfirmViewComponent } from './view/popView/confirm-view/confirm-view.component';
import { HTTP_INTERCEPTORS, HttpClientModule } from '@angular/common/http';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';
import {StringCutOffPipe} from "./tools/string-cut-off-pipe";
import { AddNewUser } from './view/popView/addNewUser/addNewUser';
import { HttpInterceptorService } from './service/http-interceptor.service';
import { AddCandidateComponent } from './view/add-candidate/add-candidate.component';

@NgModule({
    declarations: [
        AppComponent,
        LogInView,
        AccountListView,
        AccountDetailView,
        CandidateListView,
        CandidateDetailView,
        HomePageView,
        TestComponent,
        HeaderComponent,
        FooterComponent,
        MessageViewComponent,
        ConfirmViewComponent,
        AddNewUser,
        StringCutOffPipe,
        AddNewUser,
        AddCandidateComponent
    ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterOutlet,
    FormsModule,
    ModalModule.forRoot(),
    NgbModule,
    NgParticlesModule,
    NgConfettiModule,
    NgFireworksModule,
  ],
  providers: [{
    provide: HTTP_INTERCEPTORS,
    useClass: HttpInterceptorService,
    multi: true}],
  bootstrap: [AppComponent]
})
export class AppModule { }
