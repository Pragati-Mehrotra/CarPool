package com.example.user.pragati;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class RegisterActivity  extends AppCompatActivity {

    private Button firebase_r;
    private DatabaseReference database_r;
    private EditText email;
    private EditText password;
    private EditText name;
    private EditText age;
    private EditText gender;
    private EditText occupation;
    private EditText source;
    private EditText destination;
    private EditText gotime;
    private EditText cometime;
    private EditText regno;
    private EditText model;
    private EditText colour;
    private EditText seats;
    private EditText ac;
    private EditText phno;


    String mail,Name,pass,ag,gen,occ,s,d,gtime,ctime,reg,m,col,seat,acs,ph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        firebase_r = (Button) findViewById(R.id.btnRegistrationUser);
        email = (EditText) findViewById(R.id.txtemail);
        password = (EditText) findViewById(R.id.txtpassword);
        name = findViewById(R.id.txtname);
        gender= findViewById(R.id.txtgender);
        age= findViewById(R.id.txtage);
        phno= findViewById(R.id.txtphoneno);
        occupation = findViewById(R.id.txtoccupation);
        source = findViewById(R.id.txtsource);
        destination = findViewById(R.id.txtdestination);
        gotime = findViewById(R.id.txtgotime);
        cometime = findViewById(R.id.txtcometime);
        regno = findViewById(R.id.txtregno);
        model = findViewById(R.id.txtmodel);
        colour = findViewById(R.id.txtcolour);
        seats = findViewById(R.id.txtseats);
        ac = findViewById(R.id.txtac);

    }
    public void btnRegistrationUser_Click(View v) {
        mail = email.getText().toString().trim();
        pass = password.getText().toString().trim();
        Name = name.getText().toString().trim();
        ag = age.getText().toString().trim();
        gen = gender.getText().toString().trim();
        ph = phno.getText().toString().trim();
        occ = occupation.getText().toString().trim();
        s = source.getText().toString().trim();
        d = destination.getText().toString().trim();
        gtime = gotime.getText().toString().trim();
        ctime = cometime.getText().toString().trim();
        reg = regno.getText().toString().trim();
        m = model.getText().toString().trim();
        col = colour.getText().toString().trim();
        seat = seats.getText().toString().trim();
        acs = ac.getText().toString().trim();


        database_r = FirebaseDatabase.getInstance().getReference("User_Info/"+ph);
        database_r.child("Name").setValue(Name);
        database_r.child("Password").setValue(pass);
        database_r.child("Email").setValue(mail);
        database_r.child("Mobile No").setValue(ph);
        database_r.child("Gender").setValue(gen);
        database_r.child("Occupation").setValue(occ);
        database_r.child("Age").setValue(ag);
        database_r.child("Source").setValue(s);
        database_r.child("Destination").setValue(d);
        database_r.child("Go_time").setValue(gtime);
        database_r.child("Come_time").setValue(ctime);
        database_r.child("Registration_no").setValue(reg);
        database_r.child("Model").setValue(m);
        database_r.child("Colour").setValue(col);
        database_r.child("Seats").setValue(seat);
        database_r.child("AC").setValue(acs);
        Toast.makeText(this,"user details saved",Toast.LENGTH_LONG).show();
        final Context context=this;
        Intent intent=new Intent(context,LoginActivity.class);
        startActivity(intent);



//        final ProgressDialog progressDialog = ProgressDialog.show(RegisterActivity.this, "Please wait...", "Processing...", true);
//        (firebaseAuth.createUserWithEmailAndPassword(txtEmailAddress.getText().toString(), txtPassword.getText().toString()))
//                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        progressDialog.dismiss();
//
//                        if (task.isSuccessful()) {
//                            Toast.makeText(RegisterActivity.this, "Registration successful", Toast.LENGTH_LONG).show();
//                            Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
//                            startActivity(i);
//                        }
//                        else
//                        {
//                            Log.e("ERROR", task.getException().toString());
//                            Toast.makeText(RegisterActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
//                        }
//                    }
//                });
    }
}
