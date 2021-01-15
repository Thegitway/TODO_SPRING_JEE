import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-taches',
  templateUrl: './taches.component.html',
  styleUrls: ['./taches.component.scss']
})
export class TachesComponent implements OnInit {
  listeID;

  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.params
    .subscribe(
      data => {
        this.listeID = data.id;
      }
    );
  }

}
