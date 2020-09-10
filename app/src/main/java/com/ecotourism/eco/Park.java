package com.ecotourism.eco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nav.R;

public class Park extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);

        Intent i = getIntent();
        int position = i.getExtras().getInt("id");
        imageAdapter imageAdapter = new imageAdapter(this);

        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString("name");

        ImageView showpic = (ImageView) findViewById(R.id.img);
        showpic.setImageResource(imageAdapter.Picpark[position]);

        TextView showname = (TextView) findViewById(R.id.Name);
        TextView showabout = (TextView) findViewById(R.id.About);
        TextView showadd = (TextView) findViewById(R.id.Add);
        TextView showtel = (TextView) findViewById(R.id.telnum);
        TextView showen = (TextView) findViewById(R.id.enfee);
        TextView showwel = (TextView) findViewById(R.id.welshop);
        if (position == 0){
            showname.setText(R.string.khitchakut);
            showabout.setText(R.string.about1);
            showadd.setText(R.string.in1);
        }

        showname.setText(R.string.siphachan);
        showname.setText(R.string.Phlio);
        showname.setText(R.string.khlongkaeo);
        showname.setText(R.string.thaplan);
        showname.setText(R.string.KhaoChamaoKhaoWong);
        showname.setText(R.string.pangsida);
        showname.setText(R.string.taphraya);



        showabout.setText(R.string.about2);
        showabout.setText(R.string.about3);
        showabout.setText(R.string.about4);
        showabout.setText(R.string.about5);
        showabout.setText(R.string.about6);
        showabout.setText(R.string.about7);
        showabout.setText(R.string.about8);



        showadd.setText(R.string.in2);
        showadd.setText(R.string.in3);
        showadd.setText(R.string.in4);
        showadd.setText(R.string.in5);
        showadd.setText(R.string.in6);
        showadd.setText(R.string.in7);
        showadd.setText(R.string.in8);


        showtel.setText(R.string.tel1);
        showtel.setText(R.string.tel2);
        showtel.setText(R.string.tel3);
        showtel.setText(R.string.tel4);
        showtel.setText(R.string.tel5);
        showtel.setText(R.string.tel6);
        showtel.setText(R.string.tel7);
        showtel.setText(R.string.tel8);


        showen.setText(R.string.put1);
        showen.setText(R.string.put2);
        showen.setText(R.string.put1);
        showen.setText(R.string.put2);
        showen.setText(R.string.put2);
        showen.setText(R.string.put1);
        showen.setText(R.string.put1);
        showen.setText(R.string.put3);


        showwel.setText(R.string.wel1);
        showwel.setText(R.string.wel1);
        showwel.setText(R.string.wel1);
        showwel.setText(R.string.wel1);
        showwel.setText(R.string.wel1);
        showwel.setText(R.string.wel1);
        showwel.setText(R.string.wel1);
        showwel.setText(R.string.wel2);

    }
}
