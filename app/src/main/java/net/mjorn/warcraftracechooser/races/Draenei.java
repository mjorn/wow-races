package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

public class Draenei extends Race {

    private final String NAME = "Draenei";
    private final int MODELS = R.drawable.draenei_models;
    private final int DESCRIPTION = R.string.draenei_desc;
    private final int BACKGROUND = R.drawable.draenei_back;

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
                R.string.gift_of_the_naaru,
                R.string.gemcutting,
                R.string.heroic_presence,
                R.string.shadow_resistance
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
                //R.string.rogue,
                R.string.priest,
                R.string.mage,
                //R.string.warlock
        };
    }
}
