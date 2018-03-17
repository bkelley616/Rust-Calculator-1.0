package a61699.brandon.kelley.rustcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class durability_tab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_durability_tab);
    }

    public void backToHomeFromDurability(View backHomeDur) {


        Intent goHomeDur = new Intent(this, homeScreenActivity.class);
        startActivity(goHomeDur);
        this.overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);

    }

    @Override
    public void onBackPressed() {
        Intent goHomeDur = new Intent(this, homeScreenActivity.class);
        startActivity(goHomeDur);
        this.overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }







}
