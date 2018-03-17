package a61699.brandon.kelley.rustcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        TextView rustSplash = findViewById(R.id.rustText);
        TextView calculatorSplash = findViewById(R.id.calculatorText);
        ImageView logoSplash = findViewById(R.id.splashLogo);
        Animation splashAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        logoSplash.startAnimation(splashAnimation);
        rustSplash.startAnimation(splashAnimation);
        calculatorSplash.startAnimation(splashAnimation);

        Thread timer = new Thread(){

            @Override
            public void run() {

                try {
                    sleep(2000);
                    Intent splashIntent = new Intent(getApplicationContext(),homeScreenActivity.class);
                    startActivity(splashIntent);
                    finish();
                    super.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        };
        timer.start();




    }


    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

}
