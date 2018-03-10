package net.mjorn.warcraftracechooser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_alliance);
    }

    // TODO: implement faction preference (ex: if horde clicked more, start app with horde layout)
    public void onClickAlliance(View view) {
        setContentView(R.layout.activity_main_alliance);
    }
    public void onClickHorde(View view) {
        setContentView(R.layout.activity_main_horde);
    }

    public void onClickShowRace(View view) {
        Intent intent = new Intent(this,RaceShowActivity.class);
        Button button = (Button) view;
        intent.putExtra("Race",button.getText().toString());
        startActivity(intent);
    }
}
