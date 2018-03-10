package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

import java.util.ArrayList;

public class Orc extends Race {

    private final String NAME = "Orc";
    private final int MODELS = R.drawable.orc_models;
    private final int DESCRIPTION = R.string.orc_desc;
    private final int BACKGROUND = R.drawable.orc_back;
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
        RACIALS.add(new Racial("Blood Fury", R.drawable.orc_racial_blood_fury, Type.Active,
                "Increases your melee attack power by 2243 and/or your spell power by 2243 for 15 sec."));
        RACIALS.add(new Racial("Hardiness", R.drawable.orc_racial_hardiness, Type.Passive,
                "Duration of Stun effects reduced by an additional 20%."));
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
        //CLASSES.add(WowClass.PRIEST);
        return CLASSES;
    }

}
