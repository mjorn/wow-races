package net.mjorn.warcraftracechooser.races;

import java.util.ArrayList;

public abstract class Race {

    public abstract String getName();
    public abstract int getBackground();
    public abstract int getDescription();
    public abstract ArrayList<Racial> getRacials();
    public abstract ArrayList<WowClass> getClasses();
    public abstract int getModels();

}
