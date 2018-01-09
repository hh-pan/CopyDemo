package com.test.copydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void click1(View view) {
        Toast.makeText(this, "11111111", Toast.LENGTH_SHORT).show();
    }

    public void click2(View view) {
        Toast.makeText(this, "2222222", Toast.LENGTH_SHORT).show();
    }
}
