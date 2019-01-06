package mbd.fr.messageS.controller.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import mbd.fr.messageS.R;
import mbd.fr.messageS.controller.adapters.TextAdapter;
import mbd.fr.messageS.controller.fragments.FragmentContatcList;
import mbd.fr.messageS.model.MyItemRecyclerViewAdapter;


// ContactList(usernames) (liste des contactes avec nombre de messages à lire)
//public class contactListActivity extends AppCompatActivity implements FragmentContactLIstCallBack, fragmentMessagerieCallBack {

public class ContactListActivity extends AppCompatActivity  implements FragmentContatcList.iCallable{
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_contact_list);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)



      /*  mAdapter = new TextAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);*/

    }

    @Override
    public void transfertData(String s) {

    }
}



