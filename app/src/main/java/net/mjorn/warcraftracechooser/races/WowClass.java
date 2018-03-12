package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

public enum WowClass {

    WARRIOR("Warrior", R.color.warriorColor, "Arms · Fury · Protection", R.drawable.classes_warrior),
    PALADIN("Paladin", R.color.paladinColor, "Holy · Retribution · Protection", R.drawable.classes_paladin),
    DEATHKNIGHT("Death Knight", R.color.deathKnightColor, "Blood · Unholy · Frost", R.drawable.classes_death_knight),

    SHAMAN("Shaman", R.color.shamanColor, "Elemental · Enchancement · Restoration", R.drawable.classes_shaman),
    HUNTER("Hunter", R.color.hunterColor, "Beast Mastery · Survival · Marksmanship", R.drawable.classes_hunter),

    DRUID("Druid", R.color.druidColor, "Restoration · Balance · Guardian · Feral", R.drawable.classes_druid),
    ROGUE("Rogue", R.color.rogueColor, "Assassination · Outlaw · Subtlety", R.drawable.classes_rogue),

    PRIEST("Priest", R.color.priestColor, "Holy · Discipline · Shadow", R.drawable.classes_priest),
    MAGE("Mage", R.color.mageColor, "Fire · Frost · Arcane", R.drawable.classes_mage),
    WARLOCK("Warlock", R.color.warlockColor, "Destruction · Affliction · Demonology", R.drawable.classes_warlock);

    public String name;
    public int color;
    public String specs;
    public int image;

    WowClass(String name, int color, String specs, int image) {
        this.name = name;
        this.color = color;
        this.specs = specs;
        this.image = image;
    }
}
