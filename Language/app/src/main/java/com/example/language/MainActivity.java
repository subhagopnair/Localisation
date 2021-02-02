package com.example.language;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ListView lvFamily = (ListView) findViewById(R.id.lvFamily);
        final ArrayAdapter<CharSequence> adaFamily = ArrayAdapter.createFromResource(this,R.array.Family,android.R.layout.simple_list_item_1);
        lvFamily.setAdapter(adaFamily);
        lvFamily.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                String message = adaFamily.getItem(position).toString();
                Intent goToSong = new Intent();
                goToSong.setClass(parent.getContext(), SongActivity.class);
                goToSong.putExtra("choice",message);
                startActivity(goToSong);
            }
        });

    }
    }