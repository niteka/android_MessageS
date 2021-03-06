package mbd.fr.messageS.controller.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import mbd.fr.messageS.R;



public class TextAdapter extends RecyclerView.Adapter<TextAdapter.MyViewHolder> {
    private List<String> strs;

    public TextAdapter(List<String> strs) {
        this.strs = strs;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_contact_list, parent, false);

        return new MyViewHolder(itemView);
    }

    //ien entre la vue et les données
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtv;

        public MyViewHolder(View itemView) {
            super(itemView);

             /*       public final View mView;
                    public final TextView mIdView;
                    public final TextView mContentView;
                    public DummyContent.DummyItem mItem;

            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.cellulite);
            mContentView = (TextView) view.findViewById(R.id.content);


            */

            txtv = (TextView) itemView.findViewById(R.id.cellulite);
        }





    }
    //Fonction appelée a chaque fois que la recycle view lie une cellule a une nouvelle donnée,
    // on doit mettre a jour les champs de la cellule avec les données pour la position passée
    // en parametre
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.txtv.setText(strs.get(position));
    }

    //ItemCount Permet a la recycleView de savoir combien de cellule afficher
    @Override
    public int getItemCount() {
        return strs.size();
    }
}





