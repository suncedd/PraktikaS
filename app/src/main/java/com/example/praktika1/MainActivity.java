package com.example.praktika1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    int start_x = 0;
    int end_x = 0;

    @Override
    public boolean onTouchEvent(MotionEvent event){
        switch (event.getAction()){
            case MotionEvent.ACTION_UP:
                start_x = (int) event.getX();
                break;
            case MotionEvent.ACTION_DOWN:
                end_x = (int) event.getX();
            break;
        }
        if(start_x != 0 && end_x != 0){
            if(start_x > end_x){

                setContentView(R.layout.activity_main);
            }else if(start_x<end_x){
                setContentView(R.layout.regin);
            }
            start_x=0;
            end_x=0;
    }
        return false;

}
}
