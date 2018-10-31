package com.kthiri.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;
        btn= (Button)findViewById(R.id.button);
        final ImageView imgleft= findViewById(R.id.imageView2);
        final ImageView imgRight= findViewById(R.id.imageView3);
        final int[] da = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6

        };

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Dicee","the utton has been pressed" );
                Random rn = new Random();
                int n = rn.nextInt(6);
                int nn= rn.nextInt(6);
                imgleft.setImageResource(da[n]);
                imgRight.setImageResource(da[nn]);
            }
        });
    }
}
