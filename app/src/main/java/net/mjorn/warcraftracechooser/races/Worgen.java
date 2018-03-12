package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

public class Worgen extends Race {

    private final String NAME = "Worgen";
    private final int MODELS = R.drawable.worgen_models;
    private final int DESCRIPTION = R.string.worgen_desc;
    private final int BACKGROUND = R.drawable.worgen_back;

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
                R.string.altered_form,
                R.string.two_forms,
                R.string.darkflight,
                R.string.running_wild,
                R.string.aberration,
                R.string.flayer,
                R.string.viciousness
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
                R.string.warlock
        };
    }
}
