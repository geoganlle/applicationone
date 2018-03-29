package com.example.applicationone;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button button1 ;
    ConstraintLayout layout;
    ImageView bingPicImg;
    Boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button);
        layout= (ConstraintLayout )this.findViewById(R.id.layout);
        bingPicImg=(ImageView)findViewById(R.id.bing_pic_impg);
        flag=true;
        button1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){

                    if(flag==true)
                    bingPicImg.setImageResource( R.drawable.bg1);
                    else bingPicImg.setImageResource( R.drawable.bg2);
                    flag=!flag;
                    Toast.makeText(MainActivity.this,"背景已改变",Toast.LENGTH_SHORT).show();
                }
        });
    }
}
