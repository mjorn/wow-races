package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

public class Human extends Race {

    private final String NAME = "Human";
    private final int MODELS = R.drawable.human_models;
    private final int DESCRIPTION = R.string.human_desc;
    private final int BACKGROUND = R.drawable.human_back;

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
                R.string.diplomacy,
                R.string.every_man_for_himself,
                R.string.the_human_spirit
        };
    }

    @Override
    public int[] getClasses() {
        return new int[] {
                R.string.warrior,
                R.string.paladin,
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
