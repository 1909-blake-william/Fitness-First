import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FitnessTestPage4Component } from './fitness-test-page4.component';

describe('FitnessTestPage4Component', () => {
  let component: FitnessTestPage4Component;
  let fixture: ComponentFixture<FitnessTestPage4Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FitnessTestPage4Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FitnessTestPage4Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
