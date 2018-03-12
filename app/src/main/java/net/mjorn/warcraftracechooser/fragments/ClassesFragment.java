package net.mjorn.warcraftracechooser.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.mjorn.warcraftracechooser.ClassesCardAdapter;
import net.mjorn.warcraftracechooser.MainActivity;
import net.mjorn.warcraftracechooser.R;

public class ClassesFragment extends RaceFragment {

    Context context;
    RecyclerView recycler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        context = getLayoutInflater().getContext();
        recycler = (RecyclerView)
                inflater.inflate(R.layout.fragment_classes, container, false);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recycler.setLayoutManager(layoutManager);
        return recycler;
    }

    @Override
    public void onStart() {
        super.onStart();

        ClassesCardAdapter adapter = new ClassesCardAdapter(context, race.getClasses());
        recycler.setAdapter(adapter);

//        adapter.setListener(new ClassesCardAdapter.Listener() {
//            @Override
//            public void onClick(int position) {
//                Intent intent = new Intent(getActivity(), MainActivity.class);
//                intent.putExtra("position", position);
//                getActivity().startActivity(intent);
//            }
//        });

    }
}
