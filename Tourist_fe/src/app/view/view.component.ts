import { Component, OnInit } from '@angular/core';
import { ITourist } from '../modal/iTourist';
import { TouristserviceService } from '../touristservice.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {
  tourist:ITourist[]=[];
  tourist1:ITourist[]=[];
  
  public errorMessage:string|null = null;
  constructor(private service:TouristserviceService) { }
  fname!: string;
  ngOnInit(): void {
    
    this.service.getAllTourists().subscribe(data=>{
    
    console.log(data);
      this.setdetails(data)

    }

    )
   
  }
  setdetails(data:any){
    data.sort((a: { fname: string; }, b: { fname: any; }) => {
      return b.fname.localeCompare(a.fname);
  });
  this.tourist=data
    console.log(data)
  }

}
