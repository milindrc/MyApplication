package com.example.mrc2.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by MRC2 on 16-Nov-15.
 */
public class myAdapter3 extends RecyclerView.Adapter<myAdapter3.VH> {

    info obj[];

    Context c;

    myAdapter3(Context c, info obj[])
    {
        this.c=c;
        this.obj=obj;
    }

    class VH extends RecyclerView.ViewHolder {

        TextView T;
        CircleImageView view;

        public VH(View itemView) {
            super(itemView);


            T =(TextView) itemView.findViewById(R.id.T);
            view = (CircleImageView) itemView.findViewById(R.id.view2);

        }


    }


    @Override
    public VH onCreateViewHolder(final ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.radio,parent,false);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) v.findViewById(R.id.T)).setTextColor(Color.WHITE);
                ((CircleImageView) v.findViewById(R.id.view2)).setFillColor(Color.parseColor("#f26d50"));

                System.out.println("----" + parent.getChildCount());

                for(int i=0;i<parent.getChildCount();i++)
                {
                    if(!((TextView) v.findViewById(R.id.T)).getText().toString().equals(((TextView) parent.getChildAt(i).findViewById(R.id.T)).getText().toString())) {
                        ((TextView) parent.getChildAt(i).findViewById(R.id.T)).setTextColor(Color.BLACK);
                        ((CircleImageView) parent.getChildAt(i).findViewById(R.id.view2)).setFillColor(Color.parseColor("#00ffffff"));
                    }
                }
            }
        });

        return new VH(v);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {

        holder.T.setText(obj[position].Group);

        holder.T.setTypeface(Typeface.createFromAsset(c.getAssets(), "OpenSans-ExtraBold.ttf"));


    }

    @Override
    public int getItemCount() {
        return obj.length;
    }


}
