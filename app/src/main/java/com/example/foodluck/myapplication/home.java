package com.example.foodluck.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class home extends AppCompatActivity implements View.OnClickListener {
    private CardView makanpagi,makansiang,makanmalam,cemilan,minuman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        makanpagi = (CardView)findViewById(R.id.makanpagi);
        makansiang = (CardView)findViewById(R.id.makansiang);
        makanmalam = (CardView)findViewById(R.id.makanmalam);
        cemilan = (CardView)findViewById(R.id.cemilan);
        minuman = (CardView)findViewById(R.id.minuman);
        //add click listener to the cards
        makanpagi.setOnClickListener((View.OnClickListener) this);
        makansiang.setOnClickListener((View.OnClickListener) this);
        makanmalam.setOnClickListener((View.OnClickListener) this);
        cemilan.setOnClickListener((View.OnClickListener) this);
        minuman.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.makanpagi : i= new Intent(this,makanpagi.class);startActivity(i);break;
            case R.id.makansiang : i= new Intent(this,makansiang.class);startActivity(i);break;
            case R.id.makanmalam : i= new Intent(this,makanmalam.class);startActivity(i);break;
            case R.id.cemilan : i= new Intent(this,cemilan.class);startActivity(i);break;
            case R.id.minuman : i= new Intent(this,minuman.class);startActivity(i);break;
            default:break;


        }

    }
}
