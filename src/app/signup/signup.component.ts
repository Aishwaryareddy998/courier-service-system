import { Component, OnInit } from '@angular/core';
import { FormControl,FormBuilder,Validator,FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  title = 'Registration';
    //fname(textbox)
    fname=new FormControl('',[Validators.required,Validators.minLength(5)]);
  
    //lname(textbox)
    lname=new FormControl('',[Validators.required,Validators.minLength(5)]);
    
    //emailid(email)
    emailid=new FormControl('',[Validators.required,Validators.minLength(12),
      Validators.maxLength(60),Validators.pattern('^[a-zA-Z0-9.@]+$')]);
    
    mobileno=new FormControl('',[Validators.required,Validators.minLength(10),Validators.maxLength(10),Validators.pattern('^[0-9]+$')]);
    membertype=new FormControl('',Validators.required);


    //to get builder ref
    constructor(private builder:FormBuilder){}
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  
    //create ref for formgroup
    registrationForm:FormGroup=this.builder.group(
      {
      fname:this.fname,
      lname:this.lname,
      emailid:this.emailid,
      mobileno:this.mobileno,
      membertype:this.membertype
    })
    registrationFormData:any
    confirmationMessage:boolean=false
    onSubmitRegistrationForm():void{
      console.log(this.registrationForm)
      this.registrationFormData=this.registrationForm.value
      this.confirmationMessage=true
    }
  
  
  }

