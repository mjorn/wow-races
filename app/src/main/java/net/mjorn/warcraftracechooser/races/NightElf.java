package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

public class NightElf extends Race {

    private final String NAME = "Night Elf";
    private final int MODELS = R.drawable.nightelf_models;
    private final int DESCRIPTION = R.string.night_elf_desc;
    private final int BACKGROUND = R.drawable.nightelf_back;

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
                R.string.nature_resistance,
                R.string.quickness,
                R.string.shadowmeld,
                R.string.touch_of_elune,
                R.string.wisp_spirit
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
                R.string.druid,
                R.string.rogue,
                R.string.priest,
                R.string.mage,
                //R.string.warlock
        };
    }
}
