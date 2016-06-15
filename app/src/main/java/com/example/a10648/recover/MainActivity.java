package com.example.a10648.recover;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private ArrayList<Size>  sizeArrayList = new ArrayList<Size>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        SizeAdapter sizeAdapter = new SizeAdapter(this, R.layout.size_item, sizeArrayList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(sizeAdapter);

    }
    private void initData(){
        Size big = new Size(R.drawable.big, "Big");
        Size small = new Size(R.drawable.small, "small");
        sizeArrayList.add(big);
        sizeArrayList.add(small);
    }
}



