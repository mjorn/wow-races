package net.mjorn.warcraftracechooser;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "wowraces";
    private static final int DB_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE CLASSES (_id INTEGER PRIMARY KEY AUTOINCREMENT,NAME INTEGER,COLOR INTEGER,IMAGE INTEGER,SPECS INTEGER);");
        insertClass(db, R.string.warrior, R.color.warriorColor, R.drawable.classes_warrior, R.string.warrior_specs);
        insertClass(db, R.string.paladin, R.color.paladinColor, R.drawable.classes_paladin, R.string.paladin_specs);
        insertClass(db, R.string.death_knight, R.color.deathKnightColor, R.drawable.classes_death_knight, R.string.death_knight_specs);
        insertClass(db, R.string.shaman, R.color.shamanColor, R.drawable.classes_shaman, R.string.shaman_specs);
        insertClass(db, R.string.hunter, R.color.hunterColor, R.drawable.classes_hunter, R.string.hunter_specs);
        insertClass(db, R.string.druid, R.color.druidColor, R.drawable.classes_druid, R.string.druid_specs);
        insertClass(db, R.string.rogue, R.color.rogueColor, R.drawable.classes_rogue, R.string.rogue_specs);
        insertClass(db, R.string.priest, R.color.priestColor, R.drawable.classes_priest, R.string.priest_specs);
        insertClass(db, R.string.mage, R.color.mageColor, R.drawable.classes_mage, R.string.mage_specs);
        insertClass(db, R.string.warlock, R.color.warlockColor, R.drawable.classes_warlock, R.string.warlock_specs);

        db.execSQL("CREATE TABLE RACIALS (_id INTEGER PRIMARY KEY AUTOINCREMENT,RACE INTEGER,NAME INTEGER,ICON INTEGER,TYPE INTEGER,DESCR INTEGER);");
        insertRacial(db, R.string.human, R.string.diplomacy, R.drawable.human_racial_diplomacy, R.string.passive, R.string.diplomacy_desc);
        insertRacial(db, R.string.human, R.string.every_man_for_himself, R.drawable.human_racial_every_man_for_himself, R.string.active, R.string.every_man_for_himself_desc);
        insertRacial(db, R.string.human, R.string.the_human_spirit, R.drawable.human_racial_the_human_spirit, R.string.passive, R.string.the_human_spirit_desc);

        insertRacial(db, R.string.dwarf, R.string.explorer, R.drawable.dwarf_racial_explorer, R.string.passive, R.string.explorer_desc);
        insertRacial(db, R.string.dwarf, R.string.frost_resistance, R.drawable.dwarf_racial_frost_resistance, R.string.passive, R.string.frost_resistance_desc);
        insertRacial(db, R.string.dwarf, R.string.might_of_the_mountain, R.drawable.dwarf_racial_might_of_the_mountain, R.string.passive, R.string.might_of_the_mountain_desc);
        insertRacial(db, R.string.dwarf, R.string.stoneform, R.drawable.dwarf_racial_stoneform, R.string.active, R.string.stoneform_desc);

        insertRacial(db, R.string.gnome, R.string.arcane_resistance, R.drawable.gnome_racial_arcane_res, R.string.passive, R.string.arcane_resistance_desc);
        insertRacial(db, R.string.gnome, R.string.engineering_specialization, R.drawable.gnome_racial_engineering, R.string.passive, R.string.engineering_specialization_desc);
        insertRacial(db, R.string.gnome, R.string.escape_artist, R.drawable.gnome_racial_escape_artist, R.string.active, R.string.escape_artist_desc);
        insertRacial(db, R.string.gnome, R.string.expansive_mind, R.drawable.gnome_racial_expansive_mind, R.string.passive, R.string.expansive_mind_desc);
        insertRacial(db, R.string.gnome, R.string.nimble_fingers, R.drawable.gnome_racial_nimble_fingers, R.string.passive, R.string.nimble_fingers_desc);

        insertRacial(db, R.string.night_elf, R.string.nature_resistance, R.drawable.naightelf_racial_nature_res, R.string.passive, R.string.nature_resistance_desc);
        insertRacial(db, R.string.night_elf, R.string.quickness, R.drawable.nightelf_racial_quickness, R.string.passive, R.string.quickness_desc);
        insertRacial(db, R.string.night_elf, R.string.shadowmeld, R.drawable.nightelf_racial_shadowmeld, R.string.active, R.string.shadowmeld_desc);
        insertRacial(db, R.string.night_elf, R.string.touch_of_elune, R.drawable.nightelf_racial_elune, R.string.passive, R.string.touch_of_elune_desc);
        insertRacial(db, R.string.night_elf, R.string.wisp_spirit, R.drawable.nightelf_racial_wisp, R.string.passive, R.string.wisp_spirit_desc);

        insertRacial(db, R.string.draenei, R.string.gift_of_the_naaru, R.drawable.draenei_racial_gift, R.string.active, R.string.gift_of_the_naaru_desc);
        insertRacial(db, R.string.draenei, R.string.gemcutting, R.drawable.draenei_racial_gemcutting, R.string.passive, R.string.gemcutting_desc);
        insertRacial(db, R.string.draenei, R.string.heroic_presence, R.drawable.draenei_racial_heroic_presence, R.string.passive, R.string.heroic_presence_desc);
        insertRacial(db, R.string.draenei, R.string.shadow_resistance, R.drawable.draenei_racial_shadow_res, R.string.passive, R.string.shadow_resistance_desc);

        insertRacial(db, R.string.worgen, R.string.altered_form, R.drawable.worgen_racial_altered_form, R.string.passive, R.string.altered_form_desc);
        insertRacial(db, R.string.worgen, R.string.two_forms, R.drawable.worgen_racial_two_forms, R.string.active, R.string.two_forms_desc);
        insertRacial(db, R.string.worgen, R.string.darkflight, R.drawable.worgen_racial_darkflight, R.string.active, R.string.darkflight_desc);
        insertRacial(db, R.string.worgen, R.string.running_wild, R.drawable.worgen_racial_running_wild, R.string.active, R.string.running_wild_desc);
        insertRacial(db, R.string.worgen, R.string.aberration, R.drawable.worgen_racial_aberration, R.string.passive, R.string.aberration_desc);
        insertRacial(db, R.string.worgen, R.string.flayer, R.drawable.worgen_racial_flayer, R.string.passive, R.string.flayer_desc);
        insertRacial(db, R.string.worgen, R.string.viciousness, R.drawable.worgen_racial_viciousness, R.string.passive, R.string.viciousness_desc);

        insertRacial(db, R.string.orc, R.string.blood_fury, R.drawable.orc_racial_blood_fury, R.string.active, R.string.blood_fury_desc);
        insertRacial(db, R.string.orc, R.string.hardiness, R.drawable.orc_racial_hardiness, R.string.passive, R.string.hardiness_desc);

        insertRacial(db, R.string.troll, R.string.berserking, R.drawable.troll_racial_berserking, R.string.active, R.string.berserking_desc);
        insertRacial(db, R.string.troll, R.string.beast_slaying, R.drawable.troll_racial_beast, R.string.passive, R.string.beast_slaying_desc);
        insertRacial(db, R.string.troll, R.string.da_voodoo_shuffle, R.drawable.troll_racial_voodoo, R.string.passive, R.string.da_voodoo_shuffle_desc);
        insertRacial(db, R.string.troll, R.string.regeneration, R.drawable.troll_racial_regeneration, R.string.passive, R.string.regeneration_desc);

        insertRacial(db, R.string.tauren, R.string.war_stomp, R.drawable.tauren_racial_war_stomp, R.string.active, R.string.war_stomp_desc);
        insertRacial(db, R.string.tauren, R.string.brawn, R.drawable.tauren_racial_brawn, R.string.passive, R.string.brawn_desc);
        insertRacial(db, R.string.tauren, R.string.cultivation, R.drawable.tauren_racial_cultivation, R.string.passive, R.string.cultivation_desc);
        insertRacial(db, R.string.tauren, R.string.endurance, R.drawable.tauren_racial_endurance, R.string.passive, R.string.endurance_desc);
        insertRacial(db, R.string.tauren, R.string.nature_resistance, R.drawable.tauren_racial_nature_res, R.string.passive, R.string.nature_resistance_desc);

        insertRacial(db, R.string.undead, R.string.cannibalize, R.drawable.undead_racial_cannibalize, R.string.active, R.string.cannibalize_desc);
        insertRacial(db, R.string.undead, R.string.will_of_the_forsaken, R.drawable.undead_racial_will, R.string.active, R.string.will_of_the_forsaken_desc);
        insertRacial(db, R.string.undead, R.string.touch_of_the_grave, R.drawable.undead_racial_touch, R.string.passive, R.string.touch_of_the_grave_desc);
        insertRacial(db, R.string.undead, R.string.shadow_resistance, R.drawable.undead_racial_shadow_res, R.string.passive, R.string.shadow_resistance_desc);

        insertRacial(db, R.string.blood_elf, R.string.arcane_torrent, R.drawable.bloodelf_racial_arcane_torrent, R.string.active, R.string.arcane_torrent_desc);
        insertRacial(db, R.string.blood_elf, R.string.arcane_acuity, R.drawable.bloodelf_racial_arcane_acuity, R.string.passive, R.string.arcane_acuity_desc);
        insertRacial(db, R.string.blood_elf, R.string.arcane_affinity, R.drawable.bloodelf_racial_arcane_affinity, R.string.passive, R.string.arcane_affinity_desc);
        insertRacial(db, R.string.blood_elf, R.string.arcane_resistance, R.drawable.bloodelf_racial_arcane_res, R.string.passive, R.string.arcane_resistance_desc);

        insertRacial(db, R.string.goblin, R.string.pack_hobgoblin, R.drawable.goblin_racial_hobgoblin, R.string.active, R.string.pack_hobgoblin_desc);
        insertRacial(db, R.string.goblin, R.string.rocket_barrage, R.drawable.goblin_racial_rocket_barrage, R.string.active, R.string.rocket_barrage_desc);
        insertRacial(db, R.string.goblin, R.string.rocket_jump, R.drawable.goblin_racial_rocket_jump, R.string.active, R.string.rocket_jump_desc);
        insertRacial(db, R.string.goblin, R.string.best_deals_anywhere, R.drawable.goblin_racial_best_deals, R.string.passive, R.string.best_deals_anywhere_desc);
        insertRacial(db, R.string.goblin, R.string.better_living, R.drawable.goblin_racial_better_living, R.string.passive, R.string.better_living_desc);
        insertRacial(db, R.string.goblin, R.string.time_is_money, R.drawable.goblin_racial_time_is_money, R.string.passive, R.string.time_is_money_desc);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    private static void insertClass(SQLiteDatabase db, int name, int color, int image, int specs) {
        ContentValues values = new ContentValues();
        values.put("NAME", name);
        values.put("COLOR", color);
        values.put("IMAGE", image);
        values.put("SPECS", specs);
        db.insert("CLASSES", null, values);
    }

    private static void insertRacial(SQLiteDatabase db, int race, int name, int icon, int type, int descr) {
        ContentValues values = new ContentValues();
        values.put("RACE", race);
        values.put("NAME", name);
        values.put("ICON", icon);
        values.put("TYPE", type);
        values.put("DESCR", descr);
        db.insert("RACIALS", null, values);
    }
}
