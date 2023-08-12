package com.example.recicleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Jairo Vargas", "jairo@email.com", R.drawable.a));
        items.add(new Item("Hector", "hector@email.com", R.drawable.b));
        items.add(new Item("Elmer", "misael@email.com", R.drawable.c));
        items.add(new Item("Lau", "laura@email.com", R.drawable.b));
        items.add(new Item("Ron Damon", "Ramon@email.com", R.drawable.c));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));

    }
}