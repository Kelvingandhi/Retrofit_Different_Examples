package com.example.kelvin.retrofit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kelvin.retrofit.php_data.AndroidListActivity;

/**
 * Created by Kelvin on 6/21/2017.
 */
public class Home extends Activity{

    Button simple_btn,json_parsing_btn,php_db_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home);

        simple_btn = (Button) findViewById(R.id.btn_simple);
        json_parsing_btn = (Button) findViewById(R.id.btn_json_parsing);
        php_db_btn = (Button) findViewById(R.id.btn_php_db);

        simple_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(Home.this,MainActivity.class);
                startActivity(i1);
            }
        });

        json_parsing_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(Home.this,json_MainActivity.class);
                startActivity(i1);
            }
        });

        php_db_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(Home.this,AndroidListActivity.class);
                startActivity(i1);
            }
        });

    }
}
