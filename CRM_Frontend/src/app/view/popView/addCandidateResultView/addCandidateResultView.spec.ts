import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddCandidateResultView } from './addCandidateResultView';

describe('AddCandidateResultViewComponent', () => {
  let component: AddCandidateResultView;
  let fixture: ComponentFixture<AddCandidateResultView>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddCandidateResultView]
    });
    fixture = TestBed.createComponent(AddCandidateResultView);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
