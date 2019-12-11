import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TimerService {

  constructor() { }
  timeLeft: number = 90;
  points: number = 0;
  interval;
  
  startTimer(){
    this.interval = setInterval(() => {
        if(this.timeLeft > 0) {
          this.timeLeft--;
        } else {
          this.timeLeft = 0;

        }
    },1000)
  }

  pauseTimer() {
    clearInterval(this.interval);
  }

  addPoints(exercise){
    if (exercise === 10){
      this.points = 10;
    } else if (exercise === 20){
      this.points = 20;
    } else if (exercise === 40){
      this.points = 40;
    } else {
      this.points = 0;
    }
  }
}
