package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

import java.util.ArrayList;

public class NightElf extends Race {

    private final String NAME = "Night Elf";
    private final int MODELS = R.drawable.nightelf_models;
    private final int DESCRIPTION = R.string.night_elf_desc;
    private final int BACKGROUND = R.drawable.nightelf_back;
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
        RACIALS.add(new Racial("Nature Resistance", R.drawable.naightelf_racial_nature_res,
                Type.Passive, "Reduces Nature damage taken by 1%."));
        RACIALS.add(new Racial("Quickness", R.drawable.nightelf_racial_quickness, Type.Passive,
                "Increases your chance to dodge melee and ranged attacks by 2%, and your movement speed by 2%."));
        RACIALS.add(new Racial("Shadowmeld", R.drawable.nightelf_racial_shadowmeld, Type.Active,
                "Activate to slip into the shadows, reducing the chance for enemies to detect your presence. Lasts until cancelled or upon moving. Any threat is restored versus enemies still in combat upon cancellation of this effect."));
        RACIALS.add(new Racial("Touch of Elune", R.drawable.nightelf_racial_elune, Type.Passive,
                "Increases your Haste by 1% during the night. Increases your Critical Strike by 1% during the day."));
        RACIALS.add(new Racial("Wisp Spirit", R.drawable.nightelf_racial_wisp, Type.Passive,
                "Transform into a wisp upon death, increasing speed by 75%."));
        return RACIALS;
    }

    @Override
    public ArrayList<WowClass> getClasses() {
        CLASSES.add(WowClass.WARRIOR);
        //CLASSES.add(WowClass.PALADIN);
        CLASSES.add(WowClass.DEATHKNIGHT);
        //CLASSES.add(WowClass.SHAMAN);
        CLASSES.add(WowClass.HUNTER);
        CLASSES.add(WowClass.DRUID);
        CLASSES.add(WowClass.ROGUE);
        CLASSES.add(WowClass.MAGE);
        //CLASSES.add(WowClass.WARLOCK);
        CLASSES.add(WowClass.PRIEST);
        return CLASSES;
    }
}
