package com.example.lifebot;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class services extends Fragment {

    ArrayList<Item> allItem ;
    RecyclerView current ;

    public services() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        allItem = new ArrayList<Item>(3);
        allItem.add(new Item("Service" , "Chat Bot"));
        allItem.add(new Item ("Service2" , "counselor"));

//        MyRecyclerAdapter recyclerAdapter = new MyRecyclerAdapter();
//        current.setAdapter(recyclerAdapter);
//
//        recyclerAdapter.setData(allItem);
        return inflater.inflate(R.layout.fragment_services, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
