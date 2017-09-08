package com.dev.jochemvanhespen.listviewexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find list view
        ListView listView = (ListView) findViewById(R.id.listView);

        // generating some random data
        String[] phones = new String[]{
                "Android","iPhone","WindowsMobile","Blackberry","WebOs","Ubuntu",
                "Android","iPhone","WindowsMobile","Blackberry","WebOs","Ubuntu"
        };

        final ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < phones.length; ++i) {
            list.add(phones[i]);
        }

        PhoneArrayAdapter adapter = new PhoneArrayAdapter(this, list);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                String phone = list.get(position);

                Intent intent = new Intent(MainActivity.this,DetailActivity.class);

                intent.putExtra("phone",phone);

                startActivity(intent);
            }
        });

        listView.setAdapter(adapter);
    }
}
