package com.example.daggerpractice.ui.main;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.daggerpractice.BaseActivity;
import com.example.daggerpractice.R;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: in main act");
        Toast.makeText(this, "Logged into main activity", Toast.LENGTH_SHORT).show();
    }
}
