package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.myapplication2.adapter.CatMiauAdapter;
import com.example.myapplication2.adapter.CatpopularAdapter;
import com.example.myapplication2.model.CatMiau;
import com.example.myapplication2.model.CatPopular;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView popularRecycler, catRecycler;
    CatpopularAdapter catpopularAdapter;
    CatMiauAdapter catMiauAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // agregamos algunos datos a la clase


        List<CatMiau> catMauiList = new ArrayList<>();
        catMauiList.add(new CatMiau("Bonnie", R.drawable.cat21));
        catMauiList.add(new CatMiau("Clyde", R.drawable.cat22));
        catMauiList.add(new CatMiau("Silver", R.drawable.cat23));
        catMauiList.add(new CatMiau("Piccola", R.drawable.cat24));
        catMauiList.add(new CatMiau("Ramses", R.drawable.cat25));
        catMauiList.add(new CatMiau("Frida", R.drawable.descarga));

        setCatRecycler(catMauiList);



        List<CatPopular> catPopularList = new ArrayList<>();
        catPopularList.add(new CatPopular("Bonnie", "There are two ways to take refuge from the miseries of life: music and cats", R.drawable.cat9, "100", "Bonnie"));
        catPopularList.add(new CatPopular("Clyde", "There are two ways to take refuge from the miseries of life: music and cats", R.drawable.cat20, "200", "Clyde"));
        catPopularList.add(new CatPopular("Silver", "There are two ways to take refuge from the miseries of life: music and cats", R.drawable.gato2, "100", "Silver"));
        catPopularList.add(new CatPopular("Piccola", "There are two ways to take refuge from the miseries of life: music and cats", R.drawable.cat7, "400", "Piccola"));
        catPopularList.add(new CatPopular("Ramses", "There are two ways to take refuge from the miseries of life: music and cats", R.drawable.gato, "500", "Ramses"));
        catPopularList.add(new CatPopular("Frida", "There are two ways to take refuge from the miseries of life: music and cats", R.drawable.c57b910daffc41c7f8237692c2bdb542, "600", "Frida"));

        setPopularRecycler(catPopularList);

    }


    private void setPopularRecycler(List<CatPopular> catPopularList) {

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        catpopularAdapter = new CatpopularAdapter(MainActivity.this,catPopularList);
        popularRecycler.setAdapter(catpopularAdapter);

    }

    private void setCatRecycler(List<CatMiau> catMauiList) {

        catRecycler = findViewById(R.id.asia_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        catRecycler.setLayoutManager(layoutManager);
        catMiauAdapter = new CatMiauAdapter(catMauiList);
        catRecycler.setAdapter(catMiauAdapter);

    }
}