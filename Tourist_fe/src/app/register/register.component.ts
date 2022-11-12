
import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { ITourist } from '../modal/iTourist'
import { TouristserviceService } from '../touristservice.service';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  public tourist:ITourist={} as ITourist;
  public errorMessage:string | null = null;
  constructor(private service:TouristserviceService,private router:Router) { }

  ngOnInit(): void {
  }
  saveTourist(){
    this.service.createTourist(this.tourist).subscribe({
      next:(data)=>{
        alert("Tourist Added Success...");
        this.router.navigate(['/home']);
      }
    })
  }
 
}
