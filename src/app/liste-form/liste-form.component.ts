import { MdcSnackbar } from '@angular-mdc/web';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-liste-form',
  templateUrl: './liste-form.component.html',
  styleUrls: ['./liste-form.component.scss']
})
export class ListeFormComponent implements OnInit {
  listeForm: FormGroup;

  constructor(private router: Router, private httpClient: HttpClient, private snackbar: MdcSnackbar) {
    this.listeForm = new FormGroup({
      nom: new FormControl(),
      arrierePlan: new FormControl(),
      icone: new FormControl(),
    });
   }

  ngOnInit(): void {
  }

  creerListe(): void {
    const utilisateurID = JSON.parse(localStorage.userInfos).utilisateurID;
    this.httpClient.post('http://localhost:8080/userlists/' + utilisateurID, this.listeForm.value)
    .subscribe(
      data => {
        console.log(data);
        this.snackbar.open('Liste cree');
        this.router.navigate(['/']);
      },
      () => {
        this.snackbar.open('Une erreur est survenue pendant la creation de la liste');
      }
    )
  }
}
