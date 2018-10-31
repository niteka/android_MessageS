    package mbd.fr.myandroidapp;

    import android.os.Bundle;
    import android.support.annotation.Nullable;
    import android.support.v7.app.AppCompatActivity;
    import android.widget.Button;
    import android.widget.EditText;

    public class ActivityRegister extends AppCompatActivity {

        EditText etName;
        EditText etLastName;
        EditText etUserName;
        EditText etPassword;
        Button  bRegister;



        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_register);
            etName= (EditText) findViewById(R.id.name);
            etLastName= (EditText) findViewById(R.id.lastname);
            etUserName= (EditText) findViewById(R.id.login_box);
            etPassword= (EditText) findViewById(R.id.password_box);
            bRegister= (Button) findViewById(R.id.register_btn);


        }
    }
