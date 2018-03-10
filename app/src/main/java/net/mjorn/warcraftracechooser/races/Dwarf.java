package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

import java.util.ArrayList;

public class Dwarf extends Race {

    private final String NAME = "Dwarf";
    private final int MODELS = R.drawable.dwarf_models;
    private final int DESCRIPTION = R.string.dwarf_desc;
    private final int BACKGROUND = R.drawable.dwarf_back;
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
        RACIALS.add(new Racial("Explorer", R.drawable.dwarf_racial_explorer, Type.Passive,
                "You find additional fragments when looting archaeological finds and you can survey faster than normal archaeologists."));
        RACIALS.add(new Racial("Frost Resistance", R.drawable.dwarf_racial_frost_resistance, Type.Passive,
                "Reduces Frost damage taken by 1%."));
        RACIALS.add(new Racial("Might of the Mountain", R.drawable.dwarf_racial_might_of_the_mountain, Type.Passive,
                "Critical strike damage and healing increased by 2%."));
        RACIALS.add(new Racial("Stoneform", R.drawable.dwarf_racial_stoneform, Type.Active,
                "Removes all poison, disease, curse, magic, and bleed effects and reduces all physical damage taken by 10% for 8 sec."));
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
        CLASSES.add(WowClass.ROGUE);
        CLASSES.add(WowClass.MAGE);
        CLASSES.add(WowClass.WARLOCK);
        CLASSES.add(WowClass.PRIEST);
        return CLASSES;
    }
}
