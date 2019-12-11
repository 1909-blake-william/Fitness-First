import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LogInComponent } from './log-in/log-in.component';
import { FitnessTestComponent } from './fitness-test/fitness-test.component';
import { FitnessTestPage2Component } from './fitness-test-page2/fitness-test-page2.component';
import { FitnessTestPage3Component } from './fitness-test-page3/fitness-test-page3.component';
import { FitnessTestPage4Component } from './fitness-test-page4/fitness-test-page4.component';
import { UserProfileComponent } from './user-profile/user-profile.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [
{path: 'home',component: UserProfileComponent},
{path: 'login',component: LogInComponent}, 
{path: 'fitnessTest',component: FitnessTestComponent},
{path: 'fitnessTestPage2',component: FitnessTestPage2Component},
{path: 'fitnessTestPage3',component: FitnessTestPage3Component},
{path: 'fitnessTestPage4',component: FitnessTestPage4Component},
{path: 'profile', component: UserProfileComponent},
{path: 'register', component: RegisterComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
