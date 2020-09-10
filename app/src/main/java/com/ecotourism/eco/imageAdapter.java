package com.ecotourism.eco;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.nav.R;

public class imageAdapter extends BaseAdapter implements IimageAdapter {
   private Context mContext;

    public imageAdapter(Context mContext) {
        this.mContext = mContext;
        PicParkIds();
    }

    @Override
    public int getCount() {
        return Picpark.length;
    }

    @Override
    public Object getItem(int position) {
        return Picpark[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView iv = new ImageView(mContext);
        iv.setImageResource(Picpark[position]);
        return iv;
    }

    @Override
    public void PicParkIds() {
        Picpark[0] = R.drawable.khitchakut;
        Picpark[1] = R.drawable.siphachan;
        Picpark[2] = R.drawable.phlio;
        Picpark[3] = R.drawable.klongkeaw;
        Picpark[4] = R.drawable.thaplan;
        Picpark[5] = R.drawable.chamao;
        Picpark[6] = R.drawable.pangsida;
        Picpark[7] = R.drawable.taphraya;
    }
}
