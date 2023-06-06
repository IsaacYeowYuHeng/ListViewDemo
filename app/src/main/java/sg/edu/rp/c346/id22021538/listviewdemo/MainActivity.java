package sg.edu.rp.c346.id22021538.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);

        //fruits = new String[3];
        //fruits[0] = "apple";
        //fruits[1] = "banana";
        //fruits[2] = "cherry";

        ArrayList<String> fruits;
        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");

        //String theFruit = fruits.get(1);

        //fruits.remove(0);

        //fruits.set(3, "dragon fruit");

        //tv.setText("fruits\n=====\n"+fruits[0]+"\n"+fruits[1]+"\n"+fruits[2]);

        tv.setText("fruits\n=====\n" + fruits.get(0) + "\n" + fruits.get(1) + "\n" + fruits.get(2) + "\n" + fruits.get(3));


    }
}