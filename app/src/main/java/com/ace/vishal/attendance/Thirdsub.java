package com.ace.vishal.attendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
/**
 * Created by Hp on 10/19/2016.
 */
public class Thirdsub extends AppCompatActivity {
    ListView mListView;
    String[] Subjects = new String[]{"Data Structure","Database Management System","Digital Electronics","Programming Languages","FOM"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_sem);
        mListView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> subjectAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Subjects);
        mListView.setAdapter(subjectAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent i=new Intent(Thirdsub.this,DataStructure.class);
                    startActivity(i);
                }
            }
        });
    }
}