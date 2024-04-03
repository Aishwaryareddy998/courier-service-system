import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-loginpage',
  templateUrl: './loginpage.component.html',
  styleUrls: ['./loginpage.component.css']
})
export class LoginpageComponent implements OnInit {

  constructor() { }
  login() {
    // Code to handle login
    console.log('Logging in...');
    // Redirect to home page or perform other actions
  }

  signUp() {
    // Code to handle sign up
    console.log('Signing up...');
    // Redirect to sign up page or perform other actions
  }


  ngOnInit(): void {
  }

}

