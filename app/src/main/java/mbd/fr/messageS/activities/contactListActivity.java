package mbd.fr.messageS.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import mbd.fr.messageS.adapters.TextAdapter;
import mbd.fr.messageS.fragments.FragmentContactLIstCallBack;
import mbd.fr.messageS.R;
import mbd.fr.messageS.fragments.MainFragmentCallBack;
import mbd.fr.messageS.fragments.fragmentMessagerieCallBack;

import static android.app.PendingIntent.getActivity;

// ContactList(usernames) (liste des contactes avec nombre de messages à lire)
//public class contactListActivity extends AppCompatActivity implements FragmentContactLIstCallBack, fragmentMessagerieCallBack {
public class contactListActivity extends AppCompatActivity implements contactListActivity.iCallable {

    List<String> strs = new ArrayList<String>();
    strs.add("Aurelien,");
    strs.add("Nag");
    strs.add("Paci");
    strs.add("Bright");
    TextAdapter mAdapter =new TextAdapter(strs);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messagerie);

        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }


}
