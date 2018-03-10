package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

import java.util.ArrayList;

public class Human extends Race {

    private final String NAME = "Human";
    private final int MODELS = R.drawable.human_models;
    private final int DESCRIPTION = R.string.human_desc;
    private final int BACKGROUND = R.drawable.human_back;
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
        RACIALS.add(new Racial("Diplomacy", R.drawable.human_racial_diplomacy,
                Type.Passive,"Reputation gains increased by 10%."));
        RACIALS.add(new Racial("Every Man for Himself", R.drawable.human_racial_every_man_for_himself,
                Type.Active,"Removes all stun effects. This effect shares a 30 sec cooldown with other similar effects."));
        RACIALS.add(new Racial("The Human Spirit", R.drawable.human_racial_the_human_spirit,
                Type.Passive, "You gain 2% more of all secondary stats (Haste, Critical Strike, Mastery, Versatility) from all sources."));
        return RACIALS;
    }

    @Override
    public ArrayList<WowClass> getClasses() {
        CLASSES.add(WowClass.WARRIOR);
        CLASSES.add(WowClass.PALADIN);
        CLASSES.add(WowClass.DEATHKNIGHT);
        //CLASSES.add(WowClass.SHAMAN);
        CLASSES.add(WowClass.HUNTER);
        //CLASSES.add(WowClass.DRUID);
        CLASSES.add(WowClass.ROGUE);
        CLASSES.add(WowClass.MAGE);
        CLASSES.add(WowClass.WARLOCK);
        CLASSES.add(WowClass.PRIEST);
        return CLASSES;
    }
}
