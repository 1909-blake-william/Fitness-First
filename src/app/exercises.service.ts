import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Exercise } from '../app/models/exercise';
import {} from '../app/models/user';
import { Employee } from './models/employee';
@Injectable({
  providedIn: 'root'
})

@Injectable()
export class ExercisesService {

  constructor(private http:HttpClient) { }
  
  
  public getExercises() : Observable <Employee[]>{
    //const endpointUrl = 'https://wger.de/api/v2/exercise/?language=2';
    const endpointUrl = '/assets/data/employees.json';
    //return this.http.get<Exercise[]>(endpointUrl);
    return this.http.get<Employee[]>(endpointUrl)
     
  }
}
