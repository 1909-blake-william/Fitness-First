import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { User } from '../models/user';
import { Observable, Subscription } from 'rxjs';
//import { publishLast } from 'rxjs/operators';

@Component({
  selector: 'app-log-in',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.scss']
})
export class LogInComponent implements OnInit {

  constructor(private authService: AuthService) { }
  credentials = {
    username: '',
    password: ''
  };
  users$: Observable<User>;
  errorMessage = '';
  errorMessageSubscription: Subscription;

  ngOnInit() {
    // logout when user clicks logout
    // every time the subject publishes new content
    // it will invoke the subscriber method
    this.errorMessageSubscription = this.authService.$loginError.subscribe(errorMessage => {
      this.errorMessage = errorMessage;
    });
  }

 postUser(){
  this.authService.postUser(this.credentials);

}
}
