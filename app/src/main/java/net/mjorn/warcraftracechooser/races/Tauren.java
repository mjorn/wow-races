package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

import java.util.ArrayList;

public class Tauren extends Race {

    private final String NAME = "Tauren";
    private final int MODELS = R.drawable.tauren_models;
    private final int DESCRIPTION = R.string.tauren_desc;
    private final int BACKGROUND = R.drawable.tauren_back;
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
        RACIALS.add(new Racial("Brawn", R.drawable.tauren_racial_brawn, Type.Passive,
                "Critical strike damage and healing increased by 2%."));
        RACIALS.add(new Racial("Cultivation", R.drawable.tauren_racial_cultivation, Type.Passive,
                "Herbalism skill increased by 15 and you gather herbs faster than normal herbalists."));
        RACIALS.add(new Racial("Endurance", R.drawable.tauren_racial_endurance, Type.Passive,
                "Increases your Stamina by 1283 (scales with level)."));
        RACIALS.add(new Racial("Nature Resistance", R.drawable.tauren_racial_nature_res, Type.Passive,
                "Reduces Nature damage taken by 1%."));
        RACIALS.add(new Racial("War Stomp", R.drawable.tauren_racial_war_stomp, Type.Active,
                "Stuns up to 5 enemies within 8 yds for 2 sec."));
        return RACIALS;
    }

    @Override
    public ArrayList<WowClass> getClasses() {
        CLASSES.add(WowClass.WARRIOR);
        CLASSES.add(WowClass.PALADIN);
        CLASSES.add(WowClass.DEATHKNIGHT);
        CLASSES.add(WowClass.SHAMAN);
        CLASSES.add(WowClass.HUNTER);
        CLASSES.add(WowClass.DRUID);
        //CLASSES.add(WowClass.ROGUE);
        //CLASSES.add(WowClass.MAGE);
        //CLASSES.add(WowClass.WARLOCK);
        CLASSES.add(WowClass.PRIEST);
        return CLASSES;
    }

}
