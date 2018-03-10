package net.mjorn.warcraftracechooser;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import net.mjorn.warcraftracechooser.fragments.ClassesFragment;
import net.mjorn.warcraftracechooser.fragments.MiscFragment;
import net.mjorn.warcraftracechooser.fragments.OverviewFragment;
import net.mjorn.warcraftracechooser.fragments.RaceFragment;
import net.mjorn.warcraftracechooser.fragments.RacialsFragment;
import net.mjorn.warcraftracechooser.races.*;

public class RaceShowActivity extends AppCompatActivity {

    private Race chosenRace;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_race_show);

        Intent intent = getIntent();
        String raceToFind = intent.getStringExtra("Race");
        chosenRace = findChosenRace(raceToFind);

        setUpToolbar();
        setUpPager();
    }

    public static Race findChosenRace(String raceToFind) {
        switch (raceToFind) {
            case "Human":
                return new Human();
            case "Dwarf":
                return new Dwarf();
            case "Gnome":
                return new Gnome();
            case "Night Elf":
                return new NightElf();
            case "Draenei":
                return new Draenei();
            case "Worgen":
                return new Worgen();
            case "Orc":
                return new Orc();
            case "Troll":
                return new Troll();
            case "Tauren":
                return new Tauren();
            case "Undead":
                return new Undead();
            case "Blood Elf":
                return new BloodElf();
            case "Goblin":
                return new Goblin();
        }
        return null;
    }

    private void setUpToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(chosenRace.getName());
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    private void setUpPager() {
        RacePagerAdapter pagerAdapter = new RacePagerAdapter(getSupportFragmentManager());
        ViewPager pager = findViewById(R.id.view_pager);
        pager.setAdapter(pagerAdapter);

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(pager);
    }

    private class RacePagerAdapter extends FragmentPagerAdapter {
        public RacePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getResources().getText(R.string.tab_overview);
                case 1:
                    return getResources().getText(R.string.tab_racials);
                case 2:
                    return getResources().getText(R.string.tab_classes);
                case 3:
                    return getResources().getText(R.string.tab_misc);
            }
            return null;
        }

        @Override
        public Fragment getItem(int position) {

            RaceFragment fragment = null;

            switch (position) {
                case 0:
                    fragment = new OverviewFragment();
                    break;
                case 1:
                    fragment = new RacialsFragment();
                    break;
                case 2:
                    fragment = new ClassesFragment();
                    break;
                case 3:
                   fragment = new MiscFragment();
            }
            fragment.setRaceName(chosenRace.getName());
            return fragment;
        }
    }
}
