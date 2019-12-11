import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-fitness-test-page3',
  templateUrl: './fitness-test-page3.component.html',
  styleUrls: ['./fitness-test-page3.component.scss']
})
export class FitnessTestPage3Component implements OnInit {

  timeLeft: number = 90;
interval;
pushPoints: number;
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

  addPoints(pushUps){
    if (pushUps === 10){
      this.pushPoints = 10;
    } else if (pushUps === 20){
      this.pushPoints = 20;
    } else if (pushUps === 40){
      this.pushPoints = 40;
    } else {
      this.pushPoints = 0;
    }
  }
}
