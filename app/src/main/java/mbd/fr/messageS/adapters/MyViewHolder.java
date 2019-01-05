package mbd.fr.messageS.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import mbd.fr.messageS.R;

public class MyViewHolder extends RecyclerView.ViewHolder
{
    TextView txtv;
    public MyViewHolder(View itemView)
    {
        super(itemView);
        txtv = (TextView)itemView.findViewById(R.id.cellulite);
    }
}
