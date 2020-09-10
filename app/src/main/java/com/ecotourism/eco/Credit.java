package com.ecotourism.eco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.nav.R;

public class Credit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarcredit);
        setSupportActionBar(toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        // add back arrow to toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

            EcoDB db = new EcoDB(this);
            db.addContact(new Contact("Credit1","Icon made by [author link] from www.flaticon.com"));
            db.addContact(new Contact("Credit2","information of park from http://park.dnp.go.th/visitor/listregion.php?regionid=5"));
            db.addContact(new Contact("Credit3","Photo of park from https://thai.tourismthailand.org/สถานที่ท่องเที่ยว"));
            db.addContact(new Contact("Credit4","Photo of park from https://www.ท่องทั่วไทย.com/"));

            Contact c1 = db.getContact(3);
            TextView credit1 = (TextView) findViewById(R.id.credit1);
            credit1.setText(c1.getAbout());

            Contact c2 = db.getContact(4);
            TextView credit2 = (TextView) findViewById(R.id.credit2);
            credit2.setText(c2.getAbout());

            Contact c3 = db.getContact(5);
            TextView credit3 = (TextView) findViewById(R.id.credit3);
            credit3.setText(c3.getAbout());

            Contact c = db.getContact(6);
            TextView credit4 = (TextView) findViewById(R.id.credit4);
            credit4.setText(c.getAbout());
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
}