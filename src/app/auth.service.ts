import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor() { }

  isConnected(): boolean {
    const userInfos = localStorage.getItem('userInfos');

    return userInfos != null;
  }
}
