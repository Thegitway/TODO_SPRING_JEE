import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './home/home.component';
import { ListeFormComponent } from './liste-form/liste-form.component';
import { TacheFormComponent } from './tache-form/tache-form.component';
import { TachesComponent } from './taches/taches.component';
import { MdcButtonModule, MdcDrawerModule, MdcFormFieldModule, MdcIconModule, MdcListModule, MdcSnackbarModule, MdcTextFieldModule } from '@angular-mdc/web';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    ListeFormComponent,
    TacheFormComponent,
    TachesComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    ReactiveFormsModule,
    MdcButtonModule,
    MdcTextFieldModule,
    MdcFormFieldModule,
    MdcSnackbarModule,
    MdcDrawerModule,
    MdcListModule,
    MdcIconModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
