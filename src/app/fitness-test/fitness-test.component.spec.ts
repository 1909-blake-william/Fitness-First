import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FitnessTestComponent } from './fitness-test.component';

describe('FitnessTestComponent', () => {
  let component: FitnessTestComponent;
  let fixture: ComponentFixture<FitnessTestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FitnessTestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FitnessTestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
