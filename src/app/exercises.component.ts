import { Component, OnInit } from '@angular/core';
import { ExercisesService } from './exercises.service';


@Component({
    selector: 'app-root',
    templateUrl: './exercises.html',
    styleUrls: ['./app.component.scss']
  })

  export class ExercisesComponent implements OnInit{
    title = 'Exercises';
    //exercises = new Array<Exercise>();
    constructor(private exerciseService : ExercisesService){
      
    }
    public employees = [];
    ngOnInit(){
        this.exerciseService.getExercises()
        .subscribe(data => this.employees = data);
    }
}