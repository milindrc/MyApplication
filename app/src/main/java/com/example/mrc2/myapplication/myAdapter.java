package com.example.mrc2.myapplication;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by MRC2 on 16-Nov-15.
 */
public class myAdapter extends RecyclerView.Adapter<myAdapter.VH>{

    info obj[];

    Context c;

    myAdapter(Context c, info obj[])
    {
        this.c=c;
        this.obj=obj;
    }

    class VH extends RecyclerView.ViewHolder{

        TextView T1;
        TextView T2;
        TextView T3;
        TextView Ti;

        Button B1;
        Button B2;


        public VH(View itemView) {
            super(itemView);


            T1 =(TextView) itemView.findViewById(R.id.T1);
            T2 =(TextView) itemView.findViewById(R.id.T2);
            T3 =(TextView) itemView.findViewById(R.id.T3);
            Ti =(TextView) itemView.findViewById(R.id.Ti);

            B1 = (Button) itemView.findViewById(R.id.B1);
            B2 = (Button) itemView.findViewById(R.id.B2);
        }
    }


    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout,parent,false);

        return new VH(v);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {

        holder.T1.setText(obj[position].NAME);
        holder.T2.setText(obj[position].ADDRESS);
        holder.T3.setText(obj[position].DATE);
        holder.Ti.setText(obj[position].Group);

        holder.T1.setTypeface(Typeface.createFromAsset(c.getAssets(), "OpenSans-Bold.ttf"));
        holder.T2.setTypeface(Typeface.createFromAsset(c.getAssets(),"OpenSans-Regular.ttf"));
        holder.T3.setTypeface(Typeface.createFromAsset(c.getAssets(),"OpenSans-Light.ttf"));
        holder.Ti.setTypeface(Typeface.createFromAsset(c.getAssets(),"OpenSans-ExtraBold.ttf"));

        holder.B1.setTypeface(Typeface.createFromAsset(c.getAssets(),"OpenSans-Regular.ttf"));
        holder.B2.setTypeface(Typeface.createFromAsset(c.getAssets(),"OpenSans-Regular.ttf"));
    }

    @Override
    public int getItemCount() {
        return obj.length;
    }
}
