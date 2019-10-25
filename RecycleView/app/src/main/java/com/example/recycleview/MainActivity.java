package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MyData> arrayList=new ArrayList<MyData>();

        MyData m =new MyData("Java",R.drawable.d);
        MyData m1=new MyData("Android",R.drawable.download);
        MyData m2=new MyData("PHP",R.drawable.d3);

        arrayList.add(m);
        arrayList.add(m1);
        arrayList.add(m2);

        RecyclerView re = (RecyclerView) findViewById(R.id.recycle);
        CustomAdapter adapter = new CustomAdapter(arrayList);
        re.setLayoutManager(new LinearLayoutManager(this));
        re.setAdapter(adapter);

        }
    }

