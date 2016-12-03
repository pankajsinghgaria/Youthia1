package com.youthia.youthia.ActivityClass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.youthia.youthia.R;

public class AdminPage extends AppCompatActivity {
    EditText regId, name, email, number, qualification, occupation;
    Button addUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);

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

            }
        });
    }
}
