package com.example.iossenac.appactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Ciclo de Vida","Create");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Ciclo de Vida","Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Ciclo de Vida","Stop");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Ciclo de Vida","Resume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Ciclo de Vida","Pause");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Ciclo de Vida","Restart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Ciclo de Vida","Destroy");

    }
}
