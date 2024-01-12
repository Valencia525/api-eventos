import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AsistentesformComponent } from './asistentesform.component';

describe('AsistentesformComponent', () => {
  let component: AsistentesformComponent;
  let fixture: ComponentFixture<AsistentesformComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AsistentesformComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AsistentesformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
