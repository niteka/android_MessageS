package mbd.fr.messageS.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mbd.fr.messageS.fragments.FragmentContactLIstCallBack;
import mbd.fr.messageS.R;
import mbd.fr.messageS.fragments.fragmentMessagerieCallBack;

// ContactList(usernames) (liste des contactes avec nombre de messages à lire)
public class contactListActivity extends AppCompatActivity implements FragmentContactLIstCallBack, fragmentMessagerieCallBack {
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messagerie);
    }
}
