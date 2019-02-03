package com.merogyan.sharedpreferencesday;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SharedPreferencesDesign extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences_design);

        sharedPreferences
                = getApplicationContext().getSharedPreferences("shareddata",MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }// oncreate end

    public  void onclickput(View view)
    {
        editor.putString("key1", "Afno Name");
        editor.putInt("key2", 100);

        editor.commit();
    }

    public void onclickshow(View v)
    {
        String data1 = sharedPreferences.getString("key1", null);
        Toast.makeText(this, ""+data1, Toast.LENGTH_SHORT).show();
    }

    public void onclickclear(View view)
    {
        editor.remove("key1");
        editor.commit();
    }

} // main class end
