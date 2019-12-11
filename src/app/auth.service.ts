import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable, ReplaySubject, Subject } from 'rxjs';
import { Exercise } from '../app/models/exercise';
import { User } from '../app/models/user';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private currentUserStream = new ReplaySubject<User>(1);
  $currentUser = this.currentUserStream.asObservable();

  private loginErrorStream = new Subject<string>();
  $loginError = this.loginErrorStream.asObservable();
  
  constructor(private http:HttpClient, private router:Router) { }
  
    public postUser(credentials) : Observable <User>{
      const endpointUrl = 'localhost:8080/auth/login';
      const headers = new Headers();
      headers.append('Content-Type', 'application/json; charset=utf-8');
      headers.append('X-Requested-With','XMLHttpRequest');
      /**/
  
      return this.http.post<User>(endpointUrl, JSON.stringify({credentials}), headers);
    }
}
