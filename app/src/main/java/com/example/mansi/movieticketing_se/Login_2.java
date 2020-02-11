package com.example.mansi.movieticketing_se;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_2 extends AppCompatActivity {
    EditText etName,etEmailAddress,etPhone,etUsername,etPassword;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_2);

        etName= (EditText) findViewById(R.id.etname);
        etPhone= (EditText) findViewById(R.id.etPhone);
        etUsername= (EditText) findViewById(R.id.etusername);
        etPassword= (EditText) findViewById(R.id.etpassword);
        etEmailAddress= (EditText) findViewById(R.id.etemail);
        btnSubmit= (Button) findViewById(R.id.btnsubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=etName.getText().toString();
                String Phone=etPhone.getText().toString();
                String Username=etUsername.getText().toString();
                String Password=etPassword.getText().toString();
                String EmailAddress=etEmailAddress.getText().toString();


                if(name.length()==0){
                    Toast.makeText(getApplicationContext(),"Invalid Name",Toast.LENGTH_LONG).show();
                    etName.requestFocus();
                    return;
                }

                else if(!Patterns.EMAIL_ADDRESS.matcher(EmailAddress).matches()){
                    Toast.makeText(getApplicationContext(),"Invalid Emailaddress",Toast.LENGTH_LONG).show();
                    etEmailAddress.requestFocus();
                    return;
                }

               else if(Phone.length()==0){
                    Toast.makeText(getApplicationContext(),"Invalid PhoneNumber",Toast.LENGTH_LONG).show();
                    etPhone.requestFocus();
                    return;
                }

                else {

                    String msg="Name :- "+ name +"\n" + " Username :- " +Username + " Password:- "+"\n"+ "Email-address :- "+ EmailAddress +"\n" + "COntact no :- "+ Phone +"\n" ;

                    Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
                    Intent i=new Intent(getApplicationContext(),Movie_Seat_Availability.class);
                    startActivity(i);

                }





            }
        });




    }}
