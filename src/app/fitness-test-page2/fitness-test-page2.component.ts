import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-fitness-test-page2',
  templateUrl: './fitness-test-page2.component.html',
  styleUrls: ['./fitness-test-page2.component.scss']
})
export class FitnessTestPage2Component implements OnInit {

  timeLeft: number = 90;
  interval;
  constructor(){
  
  }
  
    ngOnInit() {
  
    }
  
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
