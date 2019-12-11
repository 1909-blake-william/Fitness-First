import { Injectable, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable, ReplaySubject, Subject } from 'rxjs';
import { Exercise } from '../app/models/exercise';
import { User } from '../app/models/user';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthService implements OnInit{
 
  private currentUserStream = new ReplaySubject<User>(1);
  $currentUser = this.currentUserStream.asObservable();

  private loginErrorStream = new Subject<string>();
  $loginError = this.loginErrorStream.asObservable();
  
  constructor(private http:HttpClient, private router:Router) { 
    const endpointUrl = 'localhost:8080/FitnessFirst/auth/session-user';
    this.http.get<User>(endpointUrl, {
      withCredentials: true
    }).subscribe(
      data => {
        if (data === null) {
          console.log('not currently logged in');
          this.router.navigateByUrl('/login');
        } else {
          console.log('logged in');
          console.log(data);
          this.currentUserStream.next(data);
        }
      },
      err => {
        console.log('not currently logged in');
      }
    );
  }
  ngOnInit(){
  
  }
    public postUser(credentials) {
      const endpointUrl = 'localhost:8080/FitnessFirst/auth/login';
      /**/
  
      this.http.post<User>(endpointUrl, credentials, {
        withCredentials: true
      }).subscribe(data => {
        console.log('Logged in at Auth Service');
        this.router.navigateByUrl('/login');
        this.currentUserStream.next(data);
      },
      err => {
        console.log(err);
        this.loginErrorStream.next('Login failed');
      }
    );
    }
}
