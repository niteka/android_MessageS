package mbd.fr.messageS.controller.activities;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import mbd.fr.messageS.R;
import mbd.fr.messageS.model.Database;
import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class AjouterContatctActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText username;


    private Database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajoutercontact);

        db = Database.getInstance(getApplicationContext());
        username = findViewById(R.id.newPersonUsername);

        Button submit = findViewById(R.id.newPersonSubmit);
        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String usernamed = username.getText().toString();

        if(usernamed.length() > 0){

            //db.addPerson(usernamed);

            setResult(Activity.RESULT_OK);
            List<Pair<String, String>> params = new ArrayList<>();


        } else {
            Toast.makeText(this, "All the fields are requiered", Toast.LENGTH_LONG).show();
        }

    }
}
