package net.mjorn.warcraftracechooser.races;

import net.mjorn.warcraftracechooser.R;

import java.util.ArrayList;

public class Worgen extends Race {

    private final String NAME = "Worgen";
    private final int MODELS = R.drawable.worgen_models;
    private final int DESCRIPTION = R.string.worgen_desc;
    private final int BACKGROUND = R.drawable.worgen_back;
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
        RACIALS.add(new Racial("Altered Form", R.drawable.worgen_racial_altered_form, Type.Passive,
                "Enables Worgens to switch between human and Worgan forms."));
        RACIALS.add(new Racial("Two Forms", R.drawable.worgen_racial_two_forms, Type.Active,
                "Turn into your currently inactive form."));
        RACIALS.add(new Racial("Darkflight", R.drawable.worgen_racial_darkflight, Type.Active,
                "Activates your true form, increasing current movement speed by an additional 40% for 10 sec."));
        RACIALS.add(new Racial("Running Wild", R.drawable.worgen_racial_running_wild, Type.Active,
                "(Mount) Drop to all fours to run as fast as a wild animal."));
        RACIALS.add(new Racial("Aberration", R.drawable.worgen_racial_aberration, Type.Passive,
                "Reduces Shadow and Nature damage taken by 1%."));
        RACIALS.add(new Racial("Flayer", R.drawable.worgen_racial_flayer, Type.Passive,
                "Skinning skill increased by 15 and allows you to skin faster."));
        RACIALS.add(new Racial("Viciousness", R.drawable.worgen_racial_viciousness, Type.Passive,
                "Increases critical strike chance by 1%."));
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
        CLASSES.add(WowClass.WARLOCK);
        CLASSES.add(WowClass.PRIEST);
        return CLASSES;
    }
}
