import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FitnessTestPage3Component } from './fitness-test-page3.component';

describe('FitnessTestPage3Component', () => {
  let component: FitnessTestPage3Component;
  let fixture: ComponentFixture<FitnessTestPage3Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FitnessTestPage3Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FitnessTestPage3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
