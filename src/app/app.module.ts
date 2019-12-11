import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LogInComponent } from './log-in/log-in.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
//import {Observable} from 'rxjs';
import { FitnessTestComponent } from './fitness-test/fitness-test.component';
import { UserProfileComponent } from './user-profile/user-profile.component';
import { NavbarComponent } from './navbar/navbar.component';
import { TimerService } from './timer.service';
import { FitnessTestPage2Component } from './fitness-test-page2/fitness-test-page2.component';
import { FitnessTestPage3Component } from './fitness-test-page3/fitness-test-page3.component';
import { FitnessTestPage4Component } from './fitness-test-page4/fitness-test-page4.component';
import { WorkoutComponent } from './workout/workout.component';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './register/register.component';

@NgModule({
  declarations: [
    AppComponent,
    LogInComponent,
    FitnessTestComponent,
    UserProfileComponent,
    NavbarComponent,
    FitnessTestPage2Component,
    FitnessTestPage3Component,
    FitnessTestPage4Component,
    WorkoutComponent,
    HomeComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [TimerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
