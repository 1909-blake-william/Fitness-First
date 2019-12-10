import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TimerService {

  constructor() { }
  timeLeft: number = 90;
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
}
