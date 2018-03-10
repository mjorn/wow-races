package net.mjorn.warcraftracechooser.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import net.mjorn.warcraftracechooser.R;

public class OverviewFragment extends RaceFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_overview, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        View view = getView();
        System.out.println(view);
        if(view!=null) {

            ImageView back = view.findViewById(R.id.race_back);
            ImageView models = view.findViewById(R.id.race_models);
            TextView desc = view.findViewById(R.id.race_desc);

            back.setImageResource(race.getBackground());
            models.setImageResource(race.getModels());
            desc.setText(race.getDescription());
        }
    }

}
