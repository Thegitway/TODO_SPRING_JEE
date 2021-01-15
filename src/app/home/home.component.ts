import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  userInfos;

  constructor() { }

  ngOnInit(): void {
  }

  actualiser(): void {
    this.userInfos = JSON.parse(localStorage.getItem('userInfos'));
  }
}
