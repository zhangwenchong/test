package com.example.testdemo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testdemo.kotlintest.MyKotlinActivity;
import com.example.testdemo.singleton.SingleTon;
import com.example.testdemo.threadtest.TicketThread;
import com.example.testdemo.view.ViewTestActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void testThread() {

        TicketThread t1 = new TicketThread("售票点1");
        TicketThread t2 = new TicketThread("售票点2");
        TicketThread t3 = new TicketThread("售票点3");
        TicketThread t4 = new TicketThread("售票点4");
        TicketThread t5 = new TicketThread("售票点5");
        TicketThread t6 = new TicketThread("售票点6");
        TicketThread t7 = new TicketThread("售票点7");
        TicketThread t8 = new TicketThread("售票点8");
        TicketThread t9 = new TicketThread("售票点9");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();

    }
    private void testSinleTon2() {
        for (int i = 0; i < 1000000; i++) {
//           new SingleTon();
        }
    }

    private void testSinleTon() {
        for (int i = 0; i < 1000000; i++) {
            SingleTon.getInstance();
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv01:
                testThread();
                break;
            case R.id.tv02:
                startActivity(new Intent(this, MyKotlinActivity.class));
                break;
        }
    }
}