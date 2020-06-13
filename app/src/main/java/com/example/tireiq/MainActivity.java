package com.example.tireiq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tyre_list);

        ArrayList<Tyre> tyres = new ArrayList<Tyre>();
        tyres.add(new Tyre(R.drawable.logo72, "Tyre 1"));
        tyres.add(new Tyre(R.drawable.logo72, "Tyre 2"));
        tyres.add(new Tyre(R.drawable.logo72, "Tyre 3"));
        tyres.add(new Tyre(R.drawable.logo72, "Tyre 4"));
        TyreAdapter adapter = new TyreAdapter(this, tyres, R.color.orange);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
