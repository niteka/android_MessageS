package mbd.fr.myandroidapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityLogin extends AppCompatActivity
{

    EditText loginBox;
    EditText passBox;
    Button validBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_xml);

        loginBox = (EditText)findViewById(R.id.login_box);
        passBox = (EditText)findViewById(R.id.password_box);
        validBtn = (Button) findViewById(R.id.valid_btn);

        validBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    public void login() {
        if (loginBox.getText().equals("toto")
                && passBox.getText().equals("tata")) {
            validBtn.setBackgroundColor(Color.GREEN);
        } else {
            validBtn.setBackgroundColor(Color.GREEN);
        }
    }
}

