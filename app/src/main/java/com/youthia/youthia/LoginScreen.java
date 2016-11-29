package com.youthia.youthia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginScreen extends AppCompatActivity {
    EditText regId, password;
    CheckBox rememberMe;
    Button login, signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        regId = (EditText) findViewById(R.id.editText_regidtration_id);
        password = (EditText) findViewById(R.id.editText_password);
        rememberMe = (CheckBox) findViewById(R.id.checkBox_remember_me);
        login = (Button) findViewById(R.id.button_login);
        signup = (Button) findViewById(R.id.button_signup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginScreen.this, HomeActivity.class);
                startActivity(i);
            }
        });
    }
}
