import { Component } from '@angular/core';
/*import {Exercise} from './models/exercise';
import {ExercisesService} from './exercises.service';*/

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'FitnessFirst';
  //exercises = new Array<Exercise>();
  constructor(){
    
  }

  /*constructor(exerciseService:ExercisesService){
    exerciseService.getExercises().subscribe(response=>{
      this.exercises = response.map(item =>{

        return new Exercise(
          item.exerciseId,
          item.exerciseName,
          item.muscle,
          item.exerciseType,
          item.description,
          item.difficulty
          
        );
      });
    });
  }*/

}
