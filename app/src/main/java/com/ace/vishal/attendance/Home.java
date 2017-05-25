package com.ace.vishal.attendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Hp on 10/21/2016.
 */
public class Home extends AppCompatActivity implements View.OnClickListener {
    Button ta,va,ss,vs,ab;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        ta=(Button)findViewById(R.id.button);
        va=(Button)findViewById(R.id.button2);
        ss=(Button)findViewById(R.id.button3);
        vs=(Button)findViewById(R.id.button4);
        ab=(Button)findViewById(R.id.button5);
        ta.setOnClickListener(this);
        va.setOnClickListener(this);
        ss.setOnClickListener(this);
        vs.setOnClickListener(this);
        ab.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v==ta){
            Intent i=new Intent(Home.this,MainActivity.class);
            startActivity(i);
        }else if(v==va){

        }else if(v==ss){

        }else if(v==vs){

        }else if(v==ab){
            Intent i=new Intent(Home.this,AboutUs.class);
            startActivity(i);

        }
    }
}