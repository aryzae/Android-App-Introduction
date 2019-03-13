package jp.aryzae.myfirstandroidjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String hello = "Hello World!";
        int intValue = 12345;
        long longValue = 12345L;
        double doubleValue = 12.345;
        float floatValue = 12.345F;
        boolean booleanValue = true;

        Log.d("MainActivity", hello);
        Log.d("MainActivity", "" + intValue);
        Log.d("MainActivity", "" + longValue);
        Log.d("MainActivity", "" + doubleValue);
        Log.d("MainActivity", "" + floatValue);
        Log.d("MainActivity", "" + booleanValue);

        int result = sum(1, 2);
        Log.d("MainActivity", "" + result); // 3

        chapter4_32_replace();
        chapter4_40();
    }

    private int sum(int a, int b) {
        return a + b;
    }

    private void chapter4_26_cast1() {
        // int => long
        int intValue = 123;
        long longValue1 = (long)intValue;
        long longValue2 = intValue;

        // float => double
        float floatValue = 12.345F;
        double doubleValue1 = (double)floatValue;
        double doubleValue2 = floatValue;

        // int => float
        float floatValue2 = intValue;
    }

    private void chapter4_26_cast2() {
        // long => int
        long longValue = 123L;
        int intValue = (int)longValue;

        // double => float
        double doubleValue = 12.345;
        float floatValue = (float)doubleValue;

        // float => int
        int intValue2 = (int)floatValue; // 小数点以下を切り捨て
    }

    private void chapter4_26_cast3() {
        double a = 1 + 1.5;
        double b = 1 - 0.5;
        double c = 1 * 1.5;
        double d = 1 / 0.5;

        double e = (double)1 / (double)2;
        double f = (double)1 / 2;

        int num = 123;
        String s1 = "number is " + num; // "number is 123"
        String s2 = num + " is number"; // "123 is number"
        String numStr = "" + num; // "123"
    }

    private void chapter4_32_replace() {
        String helloWorld = "Hello, World!";
        // "World"を"Android"に置き換えた文字列を作る
        String helloAndroid = helloWorld.replace("World", "Android");
        Log.d("MainActivity", helloAndroid); // "Hello, Android!"
    }

    private void chapter4_40() {
        // レイアウトからTextViewを取り出す
        TextView hello = findViewById(R.id.textview_hello);
        // TextViewにセットされている文字を抜き出す
        String text = hello.getText().toString();
        // ログに出力する
        Log.d("MainActivity", text);
    }
}
