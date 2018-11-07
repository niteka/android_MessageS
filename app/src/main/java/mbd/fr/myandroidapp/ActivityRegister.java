    package mbd.fr.myandroidapp;

    import android.content.Intent;
    import android.os.Bundle;
    import android.support.annotation.Nullable;
    import android.support.v7.app.AppCompatActivity;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.Toast;

    public class ActivityRegister extends AppCompatActivity {

        EditText etName;
        EditText etLastName;
        EditText etUserName;
        EditText etPassword;
        Button  bRegister;

        Database mDb;



        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_register);
            etName= (EditText) findViewById(R.id.name);
            etLastName= (EditText) findViewById(R.id.lastname);
            etUserName= (EditText) findViewById(R.id.login_box);
            etPassword= (EditText) findViewById(R.id.password_box);
            bRegister= (Button) findViewById(R.id.register_btn);
// Database ...


            bRegister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = etName.getText().toString();
                    String lastName = etLastName.getText().toString();
                    String userName = etUserName.getText().toString();
                    String passWord = etPassword.getText().toString();
                    mDb=Database.getInstance(ActivityRegister.this);
                    mDb.addPerson(name,lastName, userName, passWord);
                    //Intent intent = new Intent(ActivityRegister.this,DetailsActivity.class);
                    //startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Details Inserted Successfully",Toast.LENGTH_SHORT).show();

                }
            });


        }
    }
