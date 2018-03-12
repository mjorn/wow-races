package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

public class Orc extends Race {

    private final String NAME = "Orc";
    private final int MODELS = R.drawable.orc_models;
    private final int DESCRIPTION = R.string.orc_desc;
    private final int BACKGROUND = R.drawable.orc_back;

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
                R.string.blood_fury,
                R.string.hardiness
        };
    }

    @Override
    public int[] getClasses() {
        return new int[] {
                R.string.warrior,
                //R.string.paladin,
                R.string.death_knight,
                R.string.shaman,
                R.string.hunter,
                //R.string.druid,
                R.string.rogue,
                //R.string.priest,
                R.string.mage,
                R.string.warlock
        };
    }
}
