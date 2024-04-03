import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Courier1Component } from './courier1.component';

describe('Courier1Component', () => {
  let component: Courier1Component;
  let fixture: ComponentFixture<Courier1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Courier1Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Courier1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
