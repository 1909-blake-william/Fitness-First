import { Component, OnInit, Renderer, AfterViewInit, ViewChild, ViewContainerRef, ComponentFactoryResolver, Input} from '@angular/core';
import {AfterContentInit} from '@angular/core';

@Component({
  selector: 'app-fitness-test',
  templateUrl: './fitness-test.component.html',
  styleUrls: ['./fitness-test.component.scss']
})
export class FitnessTestComponent implements OnInit/*, AfterContentInit */{
//@ViewChild('startExercise') exerciseButton: FitnessTestComponent;
//@Input() postOptions: String;
  //constructor(private renderer : Renderer) { }
  //constructor(private resolver: ComponentFactoryResolver){}
timeLeft: number = 90;
interval;
squatPoints: number;
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

  addPoints(squats){
    if (squats === 10){
      this.squatPoints = 10;
    } else if (squats === 20){
      this.squatPoints = 20;
    } else if (squats === 40){
      this.squatPoints = 40;
    } else {
      this.squatPoints = 0;
    }
  }

  /*ngAfterViewInit(){
    this.exerciseButton.nativeElement = 

  }*/
  /*ngAfterContentInit(){
    const fitnessTest = this.resolver.resolveComponentFactory(FitnessTestComponent);
    this.container.createComponent(fitnessTest);
    //const fitnessRef = this.container
    fitnessTest.instance.
  }*/
}
