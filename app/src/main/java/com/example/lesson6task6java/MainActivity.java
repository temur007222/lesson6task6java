package com.example.lesson6task6java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        List<User> users = prepareUserList();
        refreshAdapter(users);
    }

    void initView(){
        recyclerView = findViewById(R.id.rv);
       recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
    }
    void refreshAdapter(List<User>users){
        RecyclerAdapter adapter = new RecyclerAdapter( users);
       recyclerView.setAdapter(adapter);
       recyclerView.setNestedScrollingEnabled(false);
    }
    List<User> prepareUserList(){
        List<User> users = new ArrayList<>();

        for (int i = 1; i<15; i++){
            users.add(new User( "Temur " + i));
        }
        return users;
    }
}