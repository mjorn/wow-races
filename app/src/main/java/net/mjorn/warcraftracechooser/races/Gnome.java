package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

import java.util.ArrayList;

public class Gnome extends Race {

    private final String NAME = "Gnome";
    private final int MODELS = R.drawable.gnome_models;
    private final int DESCRIPTION = R.string.gnome_desc;
    private final int BACKGROUND = R.drawable.gnome_back;
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
       RACIALS.add(new Racial("Arcane Resistance", R.drawable.gnome_racial_arcane_res,
               Type.Passive,"Reduces Arcane damage taken by 1%."));
       RACIALS.add(new Racial("Engineering Specialization", R.drawable.gnome_racial_engineering,
               Type.Passive, "Engineering skill increased by 15."));
       RACIALS.add(new Racial("Escape Artist", R.drawable.gnome_racial_escape_artist,
               Type.Active, "Escape the effects of any immobilization or movement speed reduction effect."));
       RACIALS.add(new Racial("Expansive Mind", R.drawable.gnome_racial_expansive_mind,
               Type.Passive, "Maximum mana/energy/runic power/focus/rage increased by 5%."));
       RACIALS.add(new Racial("Nimble Fingers", R.drawable.gnome_racial_nimble_fingers,
               Type.Passive, "Haste increased by 1%."));
       return RACIALS;
    }

    @Override
    public ArrayList<WowClass> getClasses() {
        CLASSES.add(WowClass.WARRIOR);
        //CLASSES.add(WowClass.PALADIN);
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
