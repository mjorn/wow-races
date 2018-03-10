package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

import java.util.ArrayList;

public class BloodElf extends Race {

    private final String NAME = "Blood Elf";
    private final int MODELS = R.drawable.bloodelf_models;
    private final int DESCRIPTION = R.string.bloodelf_desc;
    private final int BACKGROUND = R.drawable.bloodelf_back;
    private final ArrayList<Racial> RACIALS = new ArrayList<>(8);
    private final ArrayList<WowClass> CLASSES = new ArrayList<>();

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
        RACIALS.add(new Racial("Arcane Acuity", R.drawable.bloodelf_racial_arcane_acuity, Type.Passive,
                "Increases critical strike chance by 1%."));
        RACIALS.add(new Racial("Arcane Affinity", R.drawable.bloodelf_racial_arcane_affinity, Type.Passive,
                "Enchanting skill increased by 10."));
        RACIALS.add(new Racial("Arcane Resistance", R.drawable.bloodelf_racial_arcane_res, Type.Passive,
                "Reduces Arcane damage taken by 1%."));
        RACIALS.add(new Racial("Arcane Torrent", R.drawable.bloodelf_racial_arcane_torrent, Type.Active,
                "Silence all enemies within 8 yards for 2 sec and restore 3% of your Mana / 20 Runic Power / 15 Fury / 15 Focus / 15 Energy.  Non-player victim spellcasting is also interrupted for 3 sec."));
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
