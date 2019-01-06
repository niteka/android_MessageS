package mbd.fr.messageS.controller.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import mbd.fr.messageS.model.Database;
import mbd.fr.messageS.R;

public class ActivityLogin extends AppCompatActivity {

    EditText loginBox;
    EditText passBox;
    Button validBtn;
    TextView registerLink;
    Database mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBox = (EditText) findViewById(R.id.login_box);
        passBox = (EditText) findViewById(R.id.password_box);
        validBtn = (Button) findViewById(R.id.valid_btn);
        registerLink = findViewById(R.id.register_btn);


        validBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                login();
            }
        });

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(ActivityLogin.this, ActivityRegister.class);
                ActivityLogin.this.startActivity(registerIntent);
            }
        });
    }

    public void login() {
        if (loginBox.getText().length() == 0 || passBox.getText().length() == 0) {
            validBtn.setBackgroundColor(Color.RED);
            Toast.makeText(this, "All filds are required", Toast.LENGTH_SHORT).show();
            return;

        } else {


            Intent loginIntent = new Intent(ActivityLogin.this, ContactListActivity.class);
            ActivityLogin.this.startActivity(loginIntent);



        }
    }


}

