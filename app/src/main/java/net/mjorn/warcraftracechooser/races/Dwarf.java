package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

import java.util.ArrayList;

public class Dwarf extends Race {

    private final String NAME = "Dwarf";
    private final int MODELS = R.drawable.dwarf_models;
    private final int DESCRIPTION = R.string.dwarf_desc;
    private final int BACKGROUND = R.drawable.dwarf_back;

    @Override
    public String getName() {
        return NAME;
    }

    public int getModels() {
        return MODELS;
    }

    @Override
    public int getBackground() {
        return BACKGROUND;
    }

    @Override
    public int getDescription() {
        return DESCRIPTION;
    }

    @Override
    public Integer[] getRacials() {
        return new Integer[]{
                R.string.explorer,
                R.string.frost_resistance,
                R.string.might_of_the_mountain,
                R.string.stoneform
        };
    }

    @Override
    public int[] getClasses() {
        return new int[] {
                R.string.warrior,
                R.string.paladin,
                R.string.death_knight,
                R.string.shaman,
                R.string.hunter,
                //R.string.druid,
                R.string.rogue,
                R.string.priest,
                R.string.mage,
                R.string.warlock
        };
    }
}
