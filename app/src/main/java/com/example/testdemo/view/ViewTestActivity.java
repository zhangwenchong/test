package com.example.testdemo.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.example.testdemo.MainActivity;
import com.example.testdemo.R;
import com.example.testdemo.singleton.SingleTon;

public class ViewTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_test);
        testChildViewTochu();

    }


    private void testChildViewTochu() {
        findViewById(R.id.tv01).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {

                    case MotionEvent.ACTION_DOWN:
                        Log.e("tv01", "按下" + event.getAction());
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.e("tv01", "移动" + event.getAction());
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e("tv01", "抬起" + event.getAction());
                        break;
                }
                return true;//事件传递 false的时候 默认不消费事件
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {

            case MotionEvent.ACTION_DOWN:
                Log.e("onTouchEvent", "按下" + event.getAction());
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("onTouchEvent", "移动" + event.getAction());
                break;
            case MotionEvent.ACTION_UP:
                Log.e("onTouchEvent", "抬起" + event.getAction());
                break;
        }
//        Log.e("onTouchEvent", "onTouchEvent: ==" + event.getAction());
        return super.onTouchEvent(event);
    }
}