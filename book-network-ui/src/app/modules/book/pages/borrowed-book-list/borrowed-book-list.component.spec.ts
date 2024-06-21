import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BrrowedBookListComponent } from './borrowed-book-list.component';

describe('BrrowedBookListComponent', () => {
  let component: BrrowedBookListComponent;
  let fixture: ComponentFixture<BrrowedBookListComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BrrowedBookListComponent]
    });
    fixture = TestBed.createComponent(BrrowedBookListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
