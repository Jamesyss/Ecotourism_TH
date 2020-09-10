package com.ecotourism.eco;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.nav.R;

import java.util.ArrayList;

public class ListPark extends AppCompatActivity {

    SearchView searchView;
    ListView listView;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_park);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarpark);
        setSupportActionBar(toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        // add back arrow to toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

            /*GridView gridView = (GridView) findViewById(R.id.grideView1);
            gridView.setAdapter(new imageAdapter(this));

            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                }
            });*/
        }

        listView = (ListView)findViewById(R.id.listpark);

        list = new ArrayList<String>();

        list.add("อุทยานแห่งชาติเขาคิชฌกูฏ (Khao Khitchakut)");
        list.add("อุทยานแห่งชาติเขาสิบห้าชั้น (Khao Sip Ha Chan)");
        list.add("อุทยานแห่งชาติน้ำตกพลิ้ว (Namtok Phlio)");
        list.add("อุทยานแห่งชาติน้ำตกคลองแก้ว (Namtok Khlong Kaeo)");
        list.add("อุทยานแห่งชาติทับลาน (Thap Lan)");
        list.add("อุทยานแห่งชาติเขาชะเมา - เขาวง (Khao Chamao - Khao Wong)");
        list.add("อุทยานแห่งชาติปางสีดา (Pang Sida)");
        list.add("อุทยานแห่งชาติตาพระยา (Ta Phraya)");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long id) {
                Intent i = new Intent(getApplicationContext(),Park.class);
                i.putExtra("id",position);
                startActivity(i);
                /*if(position == 0){
                    Intent i1 = new Intent(getApplicationContext(),Park.class);
                    i1.putExtra("name",R.string.khitchakut);
                    i1.putExtra("about",R.string.about1);
                    i1.putExtra("address",R.string.in1);
                    i1.putExtra("tel",R.string.tel1);
                    i1.putExtra("enfee",R.string.put1);
                    i1.putExtra("welshop",R.string.wel1);
                    startActivity(i1);
                }else if(position == 1){
                    Intent i = new Intent(getApplicationContext(),Park.class);
                    i.putExtra("name",R.string.siphachan);
                    i.putExtra("about",R.string.about2);
                    i.putExtra("address",R.string.in2);
                    i.putExtra("tel",R.string.tel2);
                    i.putExtra("enfee",R.string.put2);
                    i.putExtra("welshop",R.string.wel1);
                    startActivityForResult(i,1);
                }else if(position == 2){
                    Intent i = new Intent(getApplicationContext(),Park.class);
                    i.putExtra("name",R.string.Phlio);
                    i.putExtra("about",R.string.about3);
                    i.putExtra("address",R.string.in3);
                    i.putExtra("tel",R.string.tel3);
                    i.putExtra("enfee",R.string.put1);
                    i.putExtra("welshop",R.string.wel1);
                    startActivityForResult(i,1);
                }else if(position == 3){
                    Intent i = new Intent(getApplicationContext(),Park.class);
                    i.putExtra("name",R.string.khlongkaeo);
                    i.putExtra("about",R.string.about4);
                    i.putExtra("address",R.string.in4);
                    i.putExtra("tel",R.string.tel4);
                    i.putExtra("enfee",R.string.put2);
                    i.putExtra("welshop",R.string.wel1);
                    startActivityForResult(i,1);
                }else if(position == 4){
                    Intent i = new Intent(getApplicationContext(),Park.class);
                    i.putExtra("name",R.string.thaplan);
                    i.putExtra("about",R.string.about5);
                    i.putExtra("address",R.string.in5);
                    i.putExtra("tel",R.string.tel5);
                    i.putExtra("enfee",R.string.put2);
                    i.putExtra("welshop",R.string.wel1);
                    startActivityForResult(i,1);
                }else if(position == 5){
                    Intent i = new Intent(getApplicationContext(),Park.class);
                    i.putExtra("name",R.string.KhaoChamaoKhaoWong);
                    i.putExtra("about",R.string.about6);
                    i.putExtra("address",R.string.in6);
                    i.putExtra("tel",R.string.tel6);
                    i.putExtra("enfee",R.string.put1);
                    i.putExtra("welshop",R.string.wel1);
                    startActivityForResult(i,1);
                }else if(position == 6) {
                    Intent i = new Intent(getApplicationContext(), Park.class);
                    i.putExtra("name", R.string.pangsida);
                    i.putExtra("about", R.string.about7);
                    i.putExtra("address", R.string.in7);
                    i.putExtra("tel", R.string.tel7);
                    i.putExtra("enfee", R.string.put1);
                    i.putExtra("welshop", R.string.wel1);
                    startActivityForResult(i, 1);
                }else if(position == 7){
                    Intent i = new Intent(getApplicationContext(),Park.class);
                    i.putExtra("name",R.string.taphraya);
                    i.putExtra("about",R.string.about8);
                    i.putExtra("address",R.string.in8);
                    i.putExtra("tel",R.string.tel8);
                    i.putExtra("enfee",R.string.put3);
                    i.putExtra("welshop",R.string.wel2);
                    startActivityForResult(i,1);
                }*/
            }//endvoidOnItemClick
        });//endOnItemClick
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