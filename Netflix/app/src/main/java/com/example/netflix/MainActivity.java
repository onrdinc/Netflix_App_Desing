package com.example.netflix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ParentModelClass> parentModelClassArrayList;
    ArrayList<ChildModelClass> childModelClassArrayList;
    ArrayList<ChildModelClass> populerList;
    ArrayList<ChildModelClass> gundemdekilerList;
    ArrayList<ChildModelClass> yenidenizleList;
    ArrayList<ChildModelClass> favoriList;
    ArrayList<ChildModelClass> yenieklenenlerList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView = findViewById(R.id.rv_parent);
        childModelClassArrayList = new ArrayList<>();
        populerList = new ArrayList<>();
        gundemdekilerList = new ArrayList<>();
        yenidenizleList = new ArrayList<>();
        favoriList = new ArrayList<>();
        yenieklenenlerList = new ArrayList<>();
        parentModelClassArrayList = new ArrayList<>();
        ParentAdapter parentAdapter;
        //--------------------------------------------------------------------------------------------------

        populerList.add(new ChildModelClass(R.drawable.atiye));
        populerList.add(new ChildModelClass(R.drawable.braqueurs));
        populerList.add(new ChildModelClass(R.drawable.behind));
        populerList.add(new ChildModelClass(R.drawable.road));
        populerList.add(new ChildModelClass(R.drawable.narcos));
        populerList.add(new ChildModelClass(R.drawable.adamproject));
        populerList.add(new ChildModelClass(R.drawable.afterlife));

        parentModelClassArrayList.add(new ParentModelClass("Netflix'te Popüler",populerList));
        //--------------------------------------------------------------------------------------------------

        gundemdekilerList.add(new ChildModelClass(R.drawable.lacassadepapel));
        gundemdekilerList.add(new ChildModelClass(R.drawable.fiftym));
        gundemdekilerList.add(new ChildModelClass(R.drawable.dark));
        gundemdekilerList.add(new ChildModelClass(R.drawable.ext));
        gundemdekilerList.add(new ChildModelClass(R.drawable.blackcrab));
        gundemdekilerList.add(new ChildModelClass(R.drawable.famegame));
        gundemdekilerList.add(new ChildModelClass(R.drawable.cargo));

        parentModelClassArrayList.add(new ParentModelClass("Gündemdekiler",gundemdekilerList));
        //--------------------------------------------------------------------------------------------------

        yenidenizleList.add(new ChildModelClass(R.drawable.titan));
        yenidenizleList.add(new ChildModelClass(R.drawable.outside));
        yenidenizleList.add(new ChildModelClass(R.drawable.leyla));
        yenidenizleList.add(new ChildModelClass(R.drawable.stella));
        yenidenizleList.add(new ChildModelClass(R.drawable.freaks));
        yenidenizleList.add(new ChildModelClass(R.drawable.qusand));
        yenidenizleList.add(new ChildModelClass(R.drawable.thepowerofthedog));

        parentModelClassArrayList.add(new ParentModelClass("Yeniden İzleyin",yenidenizleList));
        //--------------------------------------------------------------------------------------------------

        yenieklenenlerList.add(new ChildModelClass(R.drawable.therain));
        yenieklenenlerList.add(new ChildModelClass(R.drawable.thetwopopes));
        yenieklenenlerList.add(new ChildModelClass(R.drawable.thewitcher));
        yenieklenenlerList.add(new ChildModelClass(R.drawable.tiny));
        yenieklenenlerList.add(new ChildModelClass(R.drawable.truestory));
        yenieklenenlerList.add(new ChildModelClass(R.drawable.tribes));
        yenieklenenlerList.add(new ChildModelClass(R.drawable.yenilmezler));

        parentModelClassArrayList.add(new ParentModelClass("Yeni Eklenenler",yenieklenenlerList));
        //--------------------------------------------------------------------------------------------------


        favoriList.add(new ChildModelClass(R.drawable.shadow));
        favoriList.add(new ChildModelClass(R.drawable.sherlock));
        favoriList.add(new ChildModelClass(R.drawable.stayclose));
        favoriList.add(new ChildModelClass(R.drawable.underground));
        favoriList.add(new ChildModelClass(R.drawable.strangerthings));
        favoriList.add(new ChildModelClass(R.drawable.carelot));
        favoriList.add(new ChildModelClass(R.drawable.avengers3));


        parentModelClassArrayList.add(new ParentModelClass("Favoriler",favoriList));
        //--------------------------------------------------------------------------------------------------


        parentAdapter = new ParentAdapter(parentModelClassArrayList,MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(parentAdapter);




    }
}