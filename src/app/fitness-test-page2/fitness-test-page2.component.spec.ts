import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FitnessTestPage2Component } from './fitness-test-page2.component';

describe('FitnessTestPage2Component', () => {
  let component: FitnessTestPage2Component;
  let fixture: ComponentFixture<FitnessTestPage2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FitnessTestPage2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FitnessTestPage2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
