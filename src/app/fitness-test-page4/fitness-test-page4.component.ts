import { Component, OnInit, SystemJsNgModuleLoader } from '@angular/core';

@Component({
  selector: 'app-fitness-test-page4',
  templateUrl: './fitness-test-page4.component.html',
  styleUrls: ['./fitness-test-page4.component.scss']
})
export class FitnessTestPage4Component implements OnInit {

  timeLeft: number = 90;
  interval;
  constructor(){
  
  }
  
    ngOnInit() {
  
    }
    displayFinishButton(){

    }
    startTimer(){
      this.interval = setInterval(() => {
          if(this.timeLeft > 0) {
            this.timeLeft--;
          } else {
            this.timeLeft = 0;
            if (this.timeLeft === 0){
                this.displayFinishButton();
            }
  
          }
      },1000)
    }
  
    pauseTimer() {
      clearInterval(this.interval);
    }

    
}
