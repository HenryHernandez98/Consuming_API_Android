package com.example.consuming_api_rest.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.consuming_api_rest.R;

public class MainActivity extends AppCompatActivity {
    private TextView jsonTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jsonTextView=findViewById(R.id.jsonProduct);

    }
   public void getProduct(){

   }
}
