package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

public class Gnome extends Race {

    private final String NAME = "Gnome";
    private final int MODELS = R.drawable.gnome_models;
    private final int DESCRIPTION = R.string.gnome_desc;
    private final int BACKGROUND = R.drawable.gnome_back;

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
       return new Integer[] {
               R.string.arcane_resistance,
               R.string.engineering_specialization,
               R.string.escape_artist,
               R.string.expansive_mind,
               R.string.nimble_fingers
       };
    }

    @Override
    public int[] getClasses() {
        return new int[] {
                R.string.warrior,
                //R.string.paladin,
                R.string.death_knight,
                //R.string.shaman,
                R.string.hunter,
                //R.string.druid,
                R.string.rogue,
                R.string.priest,
                R.string.mage,
                R.string.warlock
        };
    }
}
