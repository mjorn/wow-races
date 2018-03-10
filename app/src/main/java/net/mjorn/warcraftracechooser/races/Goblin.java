package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

import java.util.ArrayList;

public class Goblin extends Race {

    private final String NAME = "Goblin";
    private final int MODELS = R.drawable.goblin_models;
    private final int DESCRIPTION = R.string.goblin_desc;
    private final int BACKGROUND = R.drawable.goblin_back;
    private final ArrayList<Racial> RACIALS = new ArrayList<>();
    private final ArrayList<WowClass> CLASSES = new ArrayList<>();

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
    public ArrayList<Racial> getRacials() {
        RACIALS.add(new Racial("Best Deals Anywhere", R.drawable.goblin_racial_best_deals, Type.Passive,
                "Always receive the best possible gold discount, regardless of faction."));
        RACIALS.add(new Racial("Better Living Through Chemistry", R.drawable.goblin_racial_better_living, Type.Passive,
                "Alchemy skill increased by 15."));
        RACIALS.add(new Racial("Pack Hobgoblin", R.drawable.goblin_racial_hobgoblin, Type.Active,
                "Calls in your friend, Gobber, allowing you bank access for 1 min."));
        RACIALS.add(new Racial("Rocket Barrage", R.drawable.goblin_racial_rocket_barrage, Type.Active,
                "Launches your belt rockets at an enemy, dealing (1 + Level * 2) fire damage."));
        RACIALS.add(new Racial("Rocket Jump", R.drawable.goblin_racial_rocket_jump, Type.Active,
                "Activates your rocket belt to jump forward. Other effects which slow the rate of falling cannot be used within 10 sec after using this ability."));
        RACIALS.add(new Racial("Time is Money", R.drawable.goblin_racial_time_is_money, Type.Passive,
                "Cash in on a 1% increase to haste."));
        return RACIALS;
    }

    @Override
    public ArrayList<WowClass> getClasses() {
        CLASSES.add(WowClass.WARRIOR);
        //CLASSES.add(WowClass.PALADIN);
        CLASSES.add(WowClass.DEATHKNIGHT);
        CLASSES.add(WowClass.SHAMAN);
        CLASSES.add(WowClass.HUNTER);
        //CLASSES.add(WowClass.DRUID);
        CLASSES.add(WowClass.ROGUE);
        CLASSES.add(WowClass.MAGE);
        CLASSES.add(WowClass.WARLOCK);
        CLASSES.add(WowClass.PRIEST);
        return CLASSES;
    }

}
