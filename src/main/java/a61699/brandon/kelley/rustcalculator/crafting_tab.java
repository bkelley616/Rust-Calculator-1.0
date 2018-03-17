package a61699.brandon.kelley.rustcalculator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class crafting_tab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crafting_tab);
    }


    public void openRustLabs(View rustLabs) {
        Intent rustLabsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rustlabs.com/"));
        startActivity(rustLabsIntent);
    }

    public void backToHomeFromCraft(View backHomeRec) {


        Intent goHomeCraft = new Intent(this, homeScreenActivity.class);
        startActivity(goHomeCraft);
        this.overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }

    @Override
    public void onBackPressed() {
        Intent goHomeCraft = new Intent(this, homeScreenActivity.class);
        startActivity(goHomeCraft);
        this.overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }


















}
