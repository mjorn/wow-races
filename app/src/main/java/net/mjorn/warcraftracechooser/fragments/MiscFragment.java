package net.mjorn.warcraftracechooser.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.mjorn.warcraftracechooser.R;

public class MiscFragment extends RaceFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_misc, container, false);
    }
}
