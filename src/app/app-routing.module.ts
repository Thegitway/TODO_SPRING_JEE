import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuthGuardService } from './auth-guard.service';
import { HomeComponent } from './home/home.component';
import { ListeFormComponent } from './liste-form/liste-form.component';
import { LoginComponent } from './login/login.component';
import { TacheFormComponent } from './tache-form/tache-form.component';
import { TachesComponent } from './taches/taches.component';

const routes: Routes = [
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: '',
    component: HomeComponent,
    canActivate: [AuthGuardService],
    children: [
      {
        path: 'taches/:id',
        component: TachesComponent
      },
      {
        path: 'creer_tache',
        component: TacheFormComponent
      },
      {
        path: 'creer_liste',
        component: ListeFormComponent
      }
    ]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
