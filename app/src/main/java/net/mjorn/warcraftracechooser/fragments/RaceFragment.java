package net.mjorn.warcraftracechooser.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import net.mjorn.warcraftracechooser.RaceShowActivity;
import net.mjorn.warcraftracechooser.races.Race;

public class RaceFragment extends Fragment {

    String raceName;
    Race race;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState!=null) {
            raceName = savedInstanceState.getString("raceName");
        }
    }

    @Override
    public void onStart() {
        super.onStart();

        race = RaceShowActivity.findChosenRace(raceName);
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("raceName", raceName);
    }
}
