package com.test.huasheng;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.test.copydemo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 选取一份作为原始模板，通过选择Build Variants 选择编译不同的apk
    }

    public void click1(View view) {
        Toast.makeText(this, "11111111", Toast.LENGTH_SHORT).show();
    }

    public void click2(View view) {
        Toast.makeText(this, "2222222", Toast.LENGTH_SHORT).show();
    }
}
