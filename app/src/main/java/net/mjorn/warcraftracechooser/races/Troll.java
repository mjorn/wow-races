package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

import java.util.ArrayList;

public class Troll extends Race {

    private final String NAME = "Troll";
    private final int MODELS = R.drawable.troll_models;
    private final int DESCRIPTION = R.string.troll_desc;
    private final int BACKGROUND = R.drawable.troll_back;
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
        RACIALS.add(new Racial("Beast Slaying", R.drawable.troll_racial_beast, Type.Passive,
                "Experience gains from killing Beasts increased by 20%."));
        RACIALS.add(new Racial("Berserking", R.drawable.troll_racial_berserking, Type.Active,
                "Increases your haste by 15% for 10 sec."));
        RACIALS.add(new Racial("Da Voodoo Shuffle", R.drawable.troll_racial_voodoo, Type.Passive,
                "Reduces the duration of all movement impairing effects by 20%. Trolls be flippin' out mon!"));
        RACIALS.add(new Racial("Regeneration", R.drawable.troll_racial_regeneration, Type.Passive,
                "Health regeneration rate increased by 10%. 10% of total Health regeneration may continue during combat."));
        return RACIALS;
    }

    @Override
    public ArrayList<WowClass> getClasses() {
        CLASSES.add(WowClass.WARRIOR);
        //CLASSES.add(WowClass.PALADIN);
        CLASSES.add(WowClass.DEATHKNIGHT);
        CLASSES.add(WowClass.SHAMAN);
        CLASSES.add(WowClass.HUNTER);
        CLASSES.add(WowClass.DRUID);
        CLASSES.add(WowClass.ROGUE);
        CLASSES.add(WowClass.MAGE);
        CLASSES.add(WowClass.WARLOCK);
        CLASSES.add(WowClass.PRIEST);
        return CLASSES;
    }
}
