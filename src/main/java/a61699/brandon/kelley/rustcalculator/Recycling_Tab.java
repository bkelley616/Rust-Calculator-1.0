package a61699.brandon.kelley.rustcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Recycling_Tab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycling__tab);
    }

    public void backToHomeFromRecycle(View backHomeRec) {


        Intent goHomeRec = new Intent(this, homeScreenActivity.class);


        startActivity(goHomeRec);
        this.overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);

    }


    @Override
    public void onBackPressed() {
        Intent goHomeRec = new Intent(this, homeScreenActivity.class);
        startActivity(goHomeRec);
        this.overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }






}
