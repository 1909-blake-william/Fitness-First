import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Exercise } from '../app/models/exercise';
import {} from '../app/models/user';
import { post } from 'selenium-webdriver/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http:HttpClient) { }
    /*public postExercises() : Observable <User[]>{
      const endpointUrl = '';
  
      return this.http.post<User[]>(endpointUrl);
    }*/
}
