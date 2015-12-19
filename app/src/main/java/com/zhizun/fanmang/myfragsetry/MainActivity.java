package com.zhizun.fanmang.myfragsetry;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 =(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 =(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 =(Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Left left=new Left();
                FragmentManager fragmentManager1=getFragmentManager();
                FragmentTransaction transaction1=fragmentManager1.beginTransaction();
                transaction1.replace(R.id.right_layout, left);
                transaction1.commit();
                break;
            case R.id.button2:
                Middle middle=new Middle();
                FragmentManager fragmentManager2=getFragmentManager();
                FragmentTransaction transaction2=fragmentManager2.beginTransaction();
                transaction2.replace(R.id.right_layout, middle);
                transaction2.commit();
                break;
            case R.id.button3:
                Right right=new Right();
                FragmentManager fragmentManager3=getFragmentManager();
                FragmentTransaction transaction3=fragmentManager3.beginTransaction();
                transaction3.replace(R.id.right_layout,right);
                transaction3.commit();
                break;
            default:
                break;
        }
    }
}
