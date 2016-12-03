package com.youthia.youthia.ActivityClass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.youthia.youthia.R;

public class AdminLogin extends AppCompatActivity {
    EditText password;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        password = (EditText) findViewById(R.id.editText_admin_password);
        go = (Button) findViewById(R.id.button_admin_go);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AdminLogin.this, AdminPage.class);
                startActivity(i);
            }
        });
    }
}
