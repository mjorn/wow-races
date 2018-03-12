package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

public class Goblin extends Race {

    private final String NAME = "Goblin";
    private final int MODELS = R.drawable.goblin_models;
    private final int DESCRIPTION = R.string.goblin_desc;
    private final int BACKGROUND = R.drawable.goblin_back;

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
                R.string.pack_hobgoblin,
                R.string.rocket_barrage,
                R.string.rocket_jump,
                R.string.best_deals_anywhere,
                R.string.better_living,
                R.string.time_is_money
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
                R.string.priest,
                R.string.mage,
                R.string.warlock
        };
    }
}
