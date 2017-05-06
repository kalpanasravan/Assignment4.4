package com.example.mahathi.gridviewsample;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.Toast;
import com.example.mahathi.gridviewsample.Adapter.ImageAdapter;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    GridView gridView;
    static final String[] MOBILE_OS = new String[] { "GingerBread", "Honeycomb","",
            "Icecream","Jelly Bean","","Kitkat", "Lollipop",""};
    int[] imageId={R.drawable.gingerbread,R.drawable.honeycomb,0,
            R.drawable.icreamimage,R.drawable.jellybean,0,
            R.drawable.kitkat_new1,R.drawable.lollipop,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing image adapter
        ImageAdapter imgAdapter=new ImageAdapter(MainActivity.this,MOBILE_OS,imageId);
        GridView gridview = (GridView) findViewById(R.id.gridview);
        //Setting image adapter to gridview
        gridview.setAdapter(imgAdapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +MOBILE_OS[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}
