import { TestBed } from '@angular/core/testing';

import { TouristserviceService } from './touristservice.service';

describe('TouristserviceService', () => {
  let service: TouristserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TouristserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
