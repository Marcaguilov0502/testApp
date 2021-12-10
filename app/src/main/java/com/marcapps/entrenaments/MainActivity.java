package com.marcapps.entrenaments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity {

    ListView simpleList;
    String[] entrenamentList;
    int icons[] = {R.drawable.e1, R.drawable.e2, R.drawable.e3, R.drawable.e4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrenamentList = new String[icons.length];
        for (int i = 0; i < icons.length; i++) {
            entrenamentList[i] = Entrenament.entrenaments[i].getNom();
        }
        simpleList = (ListView) findViewById(R.id.simpleListView);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Entrenament.selected = Entrenament.entrenaments[i];
                startActivity(new Intent(getApplicationContext(), InfoActivity.class));
            }
        });
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), entrenamentList, icons);
        simpleList.setAdapter(customAdapter);
    }
}