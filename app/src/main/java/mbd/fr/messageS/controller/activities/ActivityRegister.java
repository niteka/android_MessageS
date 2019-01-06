    package mbd.fr.messageS.controller.activities;

    import android.content.Intent;
    import android.os.Bundle;
    import android.support.annotation.Nullable;
    import android.support.v7.app.AppCompatActivity;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;
    import android.widget.Toast;

    import mbd.fr.messageS.model.Database;
    import mbd.fr.messageS.R;

    public class ActivityRegister extends AppCompatActivity {

        EditText etName;
        EditText etLastName;
        EditText etUserName;
        EditText etPassword;
        Button  bRegister;
        TextView textValreadyHaveAccount;

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
            textValreadyHaveAccount=(TextView) findViewById(R.id.alReadyHaveAccount_text_view);

// Database ...


            bRegister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = etName.getText().toString();
                    String lastName = etLastName.getText().toString();
                    String userName = etUserName.getText().toString();
                    String passWord = etPassword.getText().toString();
                    mDb=Database.getInstance(ActivityRegister.this);
                    if (name.length()==0 || lastName.length()==0 || userName.length()==0 || passWord.length()==0) {
                        Toast.makeText(ActivityRegister.this, "All Fields are required!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    else {
                        mDb.addPerson(name, lastName, userName, passWord);


                        //Intent intent = new Intent(ActivityRegister.this,DetailsActivity.class);
                        //startActivity(intent);
                        Toast.makeText(getApplicationContext(), "Details Inserted Successfully", Toast.LENGTH_SHORT).show();
                        Intent loginIntent = new Intent(ActivityRegister.this, ActivityLogin.class);
                        ActivityRegister.this.startActivity(loginIntent);
                    }
                }
            });

            textValreadyHaveAccount.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent loginIntent = new Intent(ActivityRegister.this, ActivityLogin.class);
                    ActivityRegister.this.startActivity(loginIntent);
                }
            });


        }


    }
