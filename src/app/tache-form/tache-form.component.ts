import { MdcSnackbar } from '@angular-mdc/web';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-tache-form',
  templateUrl: './tache-form.component.html',
  styleUrls: ['./tache-form.component.scss']
})
export class TacheFormComponent implements OnInit {
  tacheForm: FormGroup;

  constructor(private router: Router, private httpClient: HttpClient, private snackbar: MdcSnackbar) { 
    this.tacheForm = new FormGroup({
      description: new FormControl(),
      dateRappel: new FormControl(),
    });
  }

  ngOnInit(): void {
  }

  creerTache(): void {}
}
