

import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';
import { ITourist } from './modal/iTourist'


@Injectable({
  providedIn: 'root'
})
export class TouristserviceService {

  private serverUrl:string = `http://localhost:8081`;  
  constructor(private httpClient:HttpClient) { }

   //error handling
   public handleError(error: HttpErrorResponse) {
    let errorMessage: string = ``;
    if (error.error instanceof ErrorEvent) {
      //client error
      errorMessage = `Error : ${error.error.message}`;
    }
    else {
      //server error
      errorMessage = `status : ${error.status}`;
    }
    return throwError(() => errorMessage);
  }

  //get all tourists
  public getAllTourists():Observable<ITourist[]>{
    let dataUrl:string = `http://localhost:8081/tourists/tourists`;
    return this.httpClient.get<ITourist[]>(dataUrl).pipe(catchError(this.handleError));
  }
 
  //create tourist
  public createTourist(Dgroup: ITourist): Observable<ITourist> {
    let dataUrl: string = `${this.serverUrl}/tourists/save`;
    return this.httpClient.post<ITourist>(dataUrl, Dgroup).pipe(catchError(this.handleError));
  }

  
   

}
