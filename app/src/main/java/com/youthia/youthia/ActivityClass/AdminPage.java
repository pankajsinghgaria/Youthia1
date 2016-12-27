package com.youthia.youthia.ActivityClass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.youthia.youthia.R;
import com.youthia.youthia.User;

public class AdminPage extends AppCompatActivity {
    EditText regId, name, email, number, qualification, occupation;
    Button addUser, listUser;
    private DatabaseReference mFirebaseReference;
    private FirebaseDatabase mFirebaseInstance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(myToolbar);

        mFirebaseInstance = FirebaseDatabase.getInstance();
        mFirebaseReference = mFirebaseInstance.getReference("Users");

        regId = (EditText) findViewById(R.id.editText_addRegId);
        name = (EditText) findViewById(R.id.editText_addName);
        email = (EditText) findViewById(R.id.editText_addemail);
        number = (EditText) findViewById(R.id.editText_addNumber);
        qualification = (EditText) findViewById(R.id.editText_addQualification);
        occupation = (EditText) findViewById(R.id.editText_addOccupation);

        addUser = (Button) findViewById(R.id.button_addUser);

        addUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userId = mFirebaseReference.push().getKey();
                User user = new User();
                user.setReg_id(regId.getText().toString());
                user.setName(name.getText().toString());
                user.setEmailId(email.getText().toString());
                user.setNumber(number.getText().toString());
                user.setQualification(qualification.getText().toString());
                user.setOccupattion(occupation.getText().toString());
                user.setPassword(regId.getText().toString());

                if(regId.getText().toString().isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(), "enter reg Id", Toast.LENGTH_SHORT);
                    toast.show();
                    regId.requestFocus();
                }
                else if(name.getText().toString().isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(), "enter name", Toast.LENGTH_SHORT);
                    toast.show();
                    name.requestFocus();
                }
                else if(email.getText().toString().isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(), "enter email", Toast.LENGTH_SHORT);
                    toast.show();
                    email.requestFocus();
                }
                else if(number.getText().toString().isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(), "enter number", Toast.LENGTH_SHORT);
                    toast.show();
                    number.requestFocus();
                }
                else if(qualification.getText().toString().isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(), "enter qualification", Toast.LENGTH_SHORT);
                    toast.show();
                    qualification.requestFocus();
                }
                else if(occupation.getText().toString().isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(), "enter occupation", Toast.LENGTH_SHORT);
                    toast.show();
                    occupation.requestFocus();
                }
                else {
                    mFirebaseReference.child(userId).setValue(user);
                    Toast toast = Toast.makeText(getApplicationContext(), "member saved", Toast.LENGTH_SHORT);
                    toast.show();
                    regId.setText("");
                    name.setText("");
                    email.setText("");
                    number.setText("");
                    qualification.setText("");
                    occupation.setText("");
                    regId.requestFocus();
                }
            }
        });

        listUser = (Button) findViewById(R.id.button_userList);

        listUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AdminPage.this, AdminUserList.class);
                startActivity(i);
            }
        });
    }
}
