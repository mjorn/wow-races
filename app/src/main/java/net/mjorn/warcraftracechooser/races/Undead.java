package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

import java.util.ArrayList;

public class Undead extends Race {

    private final String NAME = "Undead";
    private final int MODELS = R.drawable.undead_models;
    private final int DESCRIPTION = R.string.undead_desc;
    private final int BACKGROUND = R.drawable.undead_back;
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
        RACIALS.add(new Racial("Cannibalize", R.drawable.undead_racial_cannibalize, Type.Active,
                "When activated, regenerates 7% of total health and mana every 2 sec for 10 sec. Only works on Humanoid or Undead corpses within 5 yds. Any movement, action, or damage taken while Cannibalizing will cancel the effect."));
        RACIALS.add(new Racial("Shadow Resistance", R.drawable.undead_racial_shadow_res, Type.Passive,
                "Reduces Shadow damage taken by 1%."));
        RACIALS.add(new Racial("Touch of the Grave", R.drawable.undead_racial_touch, Type.Passive,
                "Your attacks and damaging spells have a chance to drain the target, dealing [max(Attack power * 1.25, Spell power) * $pctD * (1 + Versatility)] Shadow damage and healing you for the same amount. Additionally, you can breathe underwater indefinitely."));
        RACIALS.add(new Racial("Will of the Forsaken", R.drawable.undead_racial_will, Type.Active,
                "Removes any Charm, Fear and Sleep effect. This effect shares a 30 sec cooldown with other similar effects."));
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
