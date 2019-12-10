import { Component, OnInit, Renderer, AfterViewInit, ViewChild, ViewContainerRef, ComponentFactoryResolver} from '@angular/core';
import {AfterContentInit} from '@angular/core';
import { FitnessTestComponent } from '../fitness-test/fitness-test.component';
@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.scss']
})

export class UserProfileComponent implements OnInit/*, AfterContentInit*/ {
  
  
//@ViewChild('quizButton') quizButton;
//@ViewChild('container', {read: ViewContainerRef, static: false}) container;
  //constructor(private renderer : Renderer) { }
  constructor(private resolver: ComponentFactoryResolver){}
  ngOnInit(){
    
  }
  /*ngAfterViewInit(){
    this.renderer.destroyView();
    this.quizButton.nativeElement
    this.renderer.createElement(<p>);
    this.renderer.createText("What are your goals?");
    this.renderer.createElement(</p>);


    this.renderer.createElement(button);
    this.renderer.createElement(button);
    this.renderer.createElement(button);
  }*/
  /*ngAfterContentInit(){
    const fitnessTest = this.resolver.resolveComponentFactory(FitnessTestComponent);
    const fitnessReference = this.container.createComponent(fitnessTest);
    //const fitnessRef = this.container
    fitnessReference.instance.postOptions();
  }*/

  /*ngAfterViewInit(){
    this.renderer.destroyView();
    this.quizButton.nativeElement
    this.renderer.createElement(<p>);
    this.renderer.createText("What are your goals?");
    this.renderer.createElement(</p>);


    this.renderer.createElement(button);
    this.renderer.createElement(button);
    this.renderer.createElement(button);
  }*/
}

