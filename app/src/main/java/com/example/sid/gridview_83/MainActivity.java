package com.example.sid.gridview_83;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    public int [] mImages = {
            R.drawable.gingerbread,
            R.drawable.honneycomb,
            R.drawable.icecream,
            R.drawable.jelly,
            R.drawable.kitkat,
            R.drawable.lollipop,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting the adapter
        GridView gridView = (GridView) findViewById(R.id.gvImages);
        gridView.setAdapter(new CustomAdapter(MainActivity.this,mImages));
    }
}
