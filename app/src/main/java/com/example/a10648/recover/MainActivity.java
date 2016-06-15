package com.example.a10648.recover;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.logging.Logger;

public class MainActivity extends ActionBarActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private ArrayList<Size>  sizeArrayList = new ArrayList<Size>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SizeAdapter sizeAdapter = new SizeAdapter(this, R.layout.size_item, sizeArrayList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(sizeAdapter);

    }
    private void initData(){
        Size big = new Size(R.drawable.add, "Big");
        Size small = new Size(R.drawable.remove, "small");
        sizeArrayList.add(big);
        sizeArrayList.add(small);
    }
}



