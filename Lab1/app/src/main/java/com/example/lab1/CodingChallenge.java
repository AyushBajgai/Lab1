package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CodingChallenge extends AppCompatActivity {
    private int mCount1 = 0;
    private TextView mShowCount1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding_challenge);
        mShowCount1 = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount1 ++;
        if(mShowCount1 != null){
            mShowCount1.setText(Integer.toString(mCount1));
        }
    }
}