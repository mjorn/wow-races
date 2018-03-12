package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

public class Troll extends Race {

    private final String NAME = "Troll";
    private final int MODELS = R.drawable.troll_models;
    private final int DESCRIPTION = R.string.troll_desc;
    private final int BACKGROUND = R.drawable.troll_back;

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
                R.string.berserking,
                R.string.beast_slaying,
                R.string.da_voodoo_shuffle,
                R.string.regeneration
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
                R.string.druid,
                R.string.rogue,
                R.string.priest,
                R.string.mage,
                R.string.warlock
        };
    }
}
