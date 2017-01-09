package com.youthia.youthia.ActivityClass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.youthia.youthia.R;
import com.youthia.youthia.User;

public class LoginScreen extends AppCompatActivity {
    EditText regId, password;
    CheckBox rememberMe;
    Button login, adminLogin;
    private DatabaseReference mFirebaseReference;
    private FirebaseDatabase mFirebaseInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        mFirebaseInstance = FirebaseDatabase.getInstance();
        mFirebaseReference = mFirebaseInstance.getReference("Users");

        regId = (EditText) findViewById(R.id.editText_regidtration_id);
        password = (EditText) findViewById(R.id.editText_password);
        rememberMe = (CheckBox) findViewById(R.id.checkBox_remember_me);
        login = (Button) findViewById(R.id.button_login);
        adminLogin = (Button) findViewById(R.id.button_adminLogin);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(regId.getText().toString().isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(), "Enter RegId", Toast.LENGTH_SHORT);
                    toast.show();
                    regId.requestFocus();
                }
                else if(password.getText().toString().isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(), "Enter Password", Toast.LENGTH_SHORT);
                    toast.show();
                    password.requestFocus();
                }
                else{
                    mFirebaseReference.child(regId.getText().toString()).addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            boolean flag = dataSnapshot.exists();
                            User user = dataSnapshot.getValue(User.class);

                            if (!flag){
                                Toast toast = Toast.makeText(getApplicationContext(), "Wrong RegId", Toast.LENGTH_SHORT);
                                toast.show();
                                regId.requestFocus();
                            }
                            else{
                                if (!password.getText().toString().equals(user.getPassword())){
                                    Toast toast = Toast.makeText(getApplicationContext(), "Wrong password", Toast.LENGTH_SHORT);
                                    toast.show();
                                    password.requestFocus();
                                }
                                else{
                                    Intent i = new Intent(LoginScreen.this, HomeActivity.class);
                                    startActivity(i);
                                }
                            }
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
            }
        });
        adminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginScreen.this, AdminLogin.class);
                startActivity(i);
            }
        });
    }
}
