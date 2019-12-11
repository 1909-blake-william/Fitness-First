import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { User } from '../models/user';
import { Observable } from 'rxjs';
import { publishLast } from 'rxjs/operators';

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

  ngOnInit() {
  }

 postUser(){
  this.users$ = this.authService.postUser(this.credentials);

}
}
