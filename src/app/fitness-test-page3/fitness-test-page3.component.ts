import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-fitness-test-page3',
  templateUrl: './fitness-test-page3.component.html',
  styleUrls: ['./fitness-test-page3.component.scss']
})
export class FitnessTestPage3Component implements OnInit {

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
