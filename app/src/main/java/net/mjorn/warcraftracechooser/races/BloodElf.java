package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

public class BloodElf extends Race {

    private final String NAME = "Blood Elf";
    private final int MODELS = R.drawable.bloodelf_models;
    private final int DESCRIPTION = R.string.bloodelf_desc;
    private final int BACKGROUND = R.drawable.bloodelf_back;

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
                R.string.arcane_torrent,
                R.string.arcane_acuity,
                R.string.arcane_affinity,
                R.string.arcane_resistance
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
