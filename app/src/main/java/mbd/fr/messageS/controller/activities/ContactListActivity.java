package mbd.fr.messageS.controller.activities;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import mbd.fr.messageS.R;
import mbd.fr.messageS.controller.fragments.FragmentContatcList;

public class ContactListActivity extends AppCompatActivity  implements FragmentContatcList.iCallable{
  Button bAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_contact_list);

    }
    @Override
    public void transfertData(String s) {

    }
}



