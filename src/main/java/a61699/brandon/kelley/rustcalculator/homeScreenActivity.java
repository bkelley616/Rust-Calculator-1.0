package a61699.brandon.kelley.rustcalculator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class homeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    public void openDevBlog(View devBlog) {
        Intent devBlogIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rust.facepunch.com/blog/"));
        startActivity(devBlogIntent);
    }



    public void goToRecycleTab(View switchToRecycleTab) {

        Intent goToRec = new Intent(this, Recycling_Tab.class);
        startActivity(goToRec);
        this.overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);

    }


    public void goToCraftingTab(View switchToCraftingTab) {


        Intent goToCraft = new Intent(this, crafting_tab.class);
        startActivity(goToCraft);
        this.overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);

    }


    public void goToDurTab(View switchToDurabilityTab) {


        Intent goToDur = new Intent(this, durability_tab.class);
        startActivity(goToDur);
        this.overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);

    }

    public void goToRaidTab(View switchToRaidTab) {


        Intent goToRaid = new Intent(this, Raid.class);
        startActivity(goToRaid);
        this.overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);

    }


}

