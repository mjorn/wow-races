package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

import java.util.ArrayList;

public class Draenei extends Race {

    private final String NAME = "Draenei";
    private final int MODELS = R.drawable.draenei_models;
    private final int DESCRIPTION = R.string.draenei_desc;
    private final int BACKGROUND = R.drawable.draenei_back;
    private final ArrayList<WowClass> CLASSES = new ArrayList<>();

    private final ArrayList<Racial> RACIALS = new ArrayList<>();

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
        RACIALS.add(new Racial("Gemcutting", R.drawable.draenei_racial_gemcutting, Type.Passive,
                "Jewelcrafting skill increased by 10."));
        RACIALS.add(new Racial("Gift of the Naaru", R.drawable.draenei_racial_gift, Type.Active,
                "Heals the target for 20% of the caster's total health over 5 sec."));
        RACIALS.add(new Racial("Heroic Presence", R.drawable.draenei_racial_heroic_presence, Type.Passive,
                "Increases your Strength, Agility, and Intellect by 425 (scales with level)."));
        RACIALS.add(new Racial("Shadow Resistance", R.drawable.draenei_racial_shadow_res, Type.Passive,
                "Reduces Shadow damage taken by 1%."));
        return RACIALS;
    }

    @Override
    public ArrayList<WowClass> getClasses() {
        CLASSES.add(WowClass.WARRIOR);
        CLASSES.add(WowClass.PALADIN);
        CLASSES.add(WowClass.DEATHKNIGHT);
        CLASSES.add(WowClass.SHAMAN);
        CLASSES.add(WowClass.HUNTER);
        //CLASSES.add(WowClass.DRUID);
        //CLASSES.add(WowClass.ROGUE);
        CLASSES.add(WowClass.MAGE);
        //CLASSES.add(WowClass.WARLOCK);
        CLASSES.add(WowClass.PRIEST);
        return CLASSES;
    }

}
