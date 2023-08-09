import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from './user'

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private loginUrl: string;

  constructor(private http: HttpClient) {
    this.loginUrl = 'http://localhost:8080/login';
  }

  public login(user: User) {
    //this.http.get(this.loginUrl, )
    return this.http.post<User>(this.loginUrl, user);
  }
}
