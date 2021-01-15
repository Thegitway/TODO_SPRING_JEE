import { MdcSnackbar } from '@angular-mdc/web';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  userInfos;

  constructor(private httpClient: HttpClient, private router: Router, private snackbar: MdcSnackbar, private auth: AuthService) {
    this.loginForm = new FormGroup({
      adresseMail: new FormControl('mail@exemple.com', Validators.email || Validators.required),
      motDePasse: new FormControl('', Validators.required),
    });
  }

  ngOnInit(): void {
    if (this.auth.isConnected()) {
      this.router.navigate(['/']);
    }
  }

  login(): void {
    const loginData = this.loginForm.value;

    this.httpClient.post('http://localhost:8080/login', loginData)
      .subscribe(
        data => {
          localStorage.setItem('userInfos', JSON.stringify(data));
          this.router.navigate(['/']);
        },
        err => {
          const snackbarRef = this.snackbar.open('Impossible de se connecter au serveur.');
        }
      );
  }
}
