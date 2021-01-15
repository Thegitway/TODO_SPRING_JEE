import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  userInfos;
  listes;

  constructor(private httpClient: HttpClient) { }

  ngOnInit(): void {
    this.userInfos = JSON.parse(localStorage.getItem('userInfos'));
    this.httpClient.get('http://localhost:8080/userlists/' + this.userInfos.utilisateurID)
    .subscribe(
      data => {
        this.listes = data;
      }
    );
  }
}
