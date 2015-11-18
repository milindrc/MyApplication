package com.example.mrc2.myapplication;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by MRC2 on 18-Nov-15.
 */
public class RadioAdapter extends BaseAdapter {
    info obj[];




    public RadioAdapter(info obj[])
    {
        this.obj=obj;

    }

    @Override
    public int getCount() {
        return obj.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.radio,parent,false);
        ((TextView) v.findViewById(R.id.T)).setText(obj[position].Group);


        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) v.findViewById(R.id.T)).setTextColor(Color.WHITE);
                ((CircleImageView) v.findViewById(R.id.view2)).setFillColor(Color.parseColor("#f26d50"));

                for(int i=0;i<parent.getChildCount();i++)
                {
                    View temp =parent.getChildAt(i);

                    if(temp!=v)
                    {
                        ((TextView) temp.findViewById(R.id.T)).setTextColor(Color.BLACK);
                        ((CircleImageView) temp.findViewById(R.id.view2)).setFillColor(Color.parseColor("#00ffffff"));

                    }

                }

            }
        });

        return v;
    }
}
