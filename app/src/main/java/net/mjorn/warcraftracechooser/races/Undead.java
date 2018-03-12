package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

public class Undead extends Race {

    private final String NAME = "Undead";
    private final int MODELS = R.drawable.undead_models;
    private final int DESCRIPTION = R.string.undead_desc;
    private final int BACKGROUND = R.drawable.undead_back;

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
                R.string.cannibalize,
                R.string.will_of_the_forsaken,
                R.string.touch_of_the_grave,
                R.string.shadow_resistance
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
