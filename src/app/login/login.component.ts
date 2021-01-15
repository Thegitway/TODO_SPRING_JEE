import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  userInfos;

  constructor(private httpClient: HttpClient) {
    this.loginForm = new FormGroup({
      adresseMail: new FormControl('mail@exemple.com', Validators.email || Validators.required),
      motDePasse: new FormControl('', Validators.required),
    });
  }

  ngOnInit(): void {
  }

  login(): void {
    const loginData = this.loginForm.value;

    this.httpClient.post('http://localhost:8080/login', loginData)
      .subscribe(
        data => {
          localStorage.setItem('userInfos', JSON.stringify(data));
        }
      );
  }
}
