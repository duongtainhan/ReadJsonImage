package com.example.duongtainhan555.readjsonimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button btnRead;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Init
        Init();
        //Event Click
        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get().load("https://cdn.macrumors.com/article-new/2015/03/Android-Icon-250x250.png").into(imageView);
            }
        });
    }
    private void Init()
    {
        imageView = findViewById(R.id.imageView);
        btnRead = findViewById(R.id.btnRead);
    }
}
