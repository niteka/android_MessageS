package mbd.fr.messageS.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.util.Log;

import mbd.fr.messageS.MainFragmentCallBack;

public class MainFragmentHC extends Fragment {
    /**
     * La parent du fragment (son callback/sonactivité contenante)
     */
    private MainFragmentCallBack parent;

    /*
     * (non-Javadoc)
     *
     * @see android.app.Fragment#onAttach(android.app.Activity)
     */
    @Override
    public void onAttach(Activity activity) {
        Log.w("MainFragmentHC", "onAttach called");
        super.onAttach(activity);
        // Utiliser cette méthode pour lier votre fragment avec son callback
        parent = (MainFragmentCallBack) activity;
    }

    /**
     * Un item a été sélectionné, notifier le changement
     * @param position of the item
     */
    public void onItemSelected(int position) {
        //Notifiez le parent qu'un item a été sélectionné
        parent.onItemSelected(position);
        //Faîtes d'autres traitements ici au besoin
    }
}
