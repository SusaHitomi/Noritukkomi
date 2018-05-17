package com.kayosystem.honki.chapter02.noritukkomi;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SharedPreferences pref;
    List<Sound> sounds;
    SingleRecyclerAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

//        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        pref = getSharedPreferences("表示・非表示の倉庫", MODE_PRIVATE);
        sounds = new ArrayList<>();
        Sound[] array = Sound.values();
        for (int i = 0; i < array.length; i++) {    //list.size()で全体を回す。
            Boolean isVisible = pref.getBoolean(array[i].label, true);
            if (isVisible) {
                sounds.add(array[i]);
            }
        }

        adapter = new SingleRecyclerAdapter(getApplicationContext(), sounds);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    public void reset(View v) {
        Sound[] array = Sound.values();
        for (int j = 0; j < array.length; j++) {
            SharedPreferences.Editor editor = pref.edit();
            editor.putBoolean( array[j].label,true);
            editor.commit();
        }

       // Boolean inVisible =

        sounds=Arrays.asList(Sound.values());
        adapter = new SingleRecyclerAdapter(getApplicationContext(), sounds);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

}
