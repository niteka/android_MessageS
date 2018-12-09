package mbd.fr.myandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//AjouterContact(username,...) evoie un message de type PING à l’utilisateur
public class AjouterContatctActivity extends AppCompatActivity {
    //liste de message
    //usernames
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajoutercontact);
    }
}
