package mbd.fr.messageS.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import mbd.fr.messageS.R;

import static android.support.v7.widget.RecyclerView.*;

public class TextAdapter extends RecyclerView.Adapter<TextAdapter.MyViewHolder> {
    private List<String> strs;

    public TextAdapter(List<String> strs) {
        this.strs = strs;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_itemrow, parent, false);

        return new MyViewHolder(itemView);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtv;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtv = (TextView) itemView.findViewById(R.id.cellulite);
        }
        //C’est le lien entre la vue et les données
    }


    //onBindViewHolder
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.txtv.setText(strs.get(position));
    }


    //Fonction appelée a chaque fois que la recycle view lie une cellule a une nouvelle donnée,
    // on doit mettre a jour les champs de la cellule avec les données pour la position passée
    // en parametre


    //ItemCount
    @Override
    public int getItemCount() {
        return strs.size();
    }


}



