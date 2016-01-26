package com.raystone.ray.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button spotify;
    private Button score;
    private Button library;
    private Button build;
    private Button xyz;
    private Button capstone;
    private Toast toast;
    private TextView toast_textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotify = (Button)findViewById(R.id.spotify);
        spotify.setOnClickListener(this);
        score = (Button)findViewById(R.id.score);
        score.setOnClickListener(this);
        library = (Button)findViewById(R.id.library);
        library.setOnClickListener(this);
        build = (Button)findViewById(R.id.build);
        build.setOnClickListener(this);
        xyz = (Button)findViewById(R.id.xyz);
        xyz.setOnClickListener(this);
        capstone = (Button)findViewById(R.id.capstone);
        capstone.setOnClickListener(this);
        toast = new Toast(getApplicationContext());
        View toast_view = getLayoutInflater().inflate(R.layout.toast,null);
        toast.setView(toast_view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast_textView = (TextView)toast_view.findViewById(R.id.toast_textview);
    }

    @Override
    public void onClick(View view)
    {

        switch (view.getId()) {
            case R.id.spotify:
                toast_textView.setText("You clicked SPOTIFY STREAMER");
                toast.show();
                break;
            case R.id.score:
                toast_textView.setText("You clicked SCORES APP");
                toast.show();
                break;
            case R.id.library:
                toast_textView.setText("You clicked LIBRARY APP");
                toast.show();
                break;
            case R.id.build:
                toast_textView.setText("You clicked BUILD IT BIGGER");
                toast.show();
                break;
            case R.id.xyz:
                toast_textView.setText("You clicked XYZ READER");
                toast.show();
                break;
            case R.id.capstone:
                toast_textView.setText("You clicked CAPSTONE: MY OWN APP");
                toast.show();
                break;
        }

    }
}
