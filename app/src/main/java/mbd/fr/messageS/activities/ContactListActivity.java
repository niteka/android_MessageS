package mbd.fr.messageS.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import mbd.fr.messageS.R;
import mbd.fr.messageS.fragments.FragmentContatcList;


// ContactList(usernames) (liste des contactes avec nombre de messages à lire)
//public class contactListActivity extends AppCompatActivity implements FragmentContactLIstCallBack, fragmentMessagerieCallBack {

public class ContactListActivity extends AppCompatActivity{

    public interface iCallable {
        public void transfertData(String s);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            FragmentContatcList fragmentContactList = (FragmentContatcList)
                    getSupportFragmentManager().findFragmentById(R.id.recycler_view);

        }
    }
}



