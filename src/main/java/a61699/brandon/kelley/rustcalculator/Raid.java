package a61699.brandon.kelley.rustcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Raid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raid);
    }

    public void backToHomeFromRaid(View backHomeRaid) {


        Intent goHomeRaid = new Intent(this, homeScreenActivity.class);
        startActivity(goHomeRaid);
        this.overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);

    }




    public int setQuantityOfRaidObject (EditText raidObjectQuantity){
        int raidObjectQuantityNum = 1;

        try {
            raidObjectQuantityNum = Integer.parseInt(raidObjectQuantity.getText().toString());
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }

        return raidObjectQuantityNum;


    }



    private int displayQuantityOfMats(int quantityOfObjects,TextView rustView) {

        int resourceQuantity = 1;

        try {
            resourceQuantity = Integer.parseInt(rustView.getText().toString());
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }


        int totalMats = quantityOfObjects * resourceQuantity ;

        rustView.setText("" + totalMats);

        return totalMats;



    }



    public void restartRaid(View view){
        Intent goHomeRaid = new Intent(this, Raid.class);
        startActivity(goHomeRaid);
        this.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

    }




    @Override
    public void onBackPressed() {
        Intent goHomeRaid = new Intent(this, homeScreenActivity.class);
        startActivity(goHomeRaid);
        this.overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }















    public void calculateCost (View view){

        EditText sheetMetalDoorET = (EditText) findViewById(R.id.sheetMetalDoor_editText);



        TextView sheetMetalDoor_Satchel = (TextView) findViewById(R.id.sheetMetalDoor_Satchel);
        TextView sheetMetalDoor_Satchel_S = (TextView) findViewById(R.id.sheetMetalDoor_Satchel_Sulfur);
        TextView sheetMetalDoor_Satchel_C = (TextView) findViewById(R.id.sheetMetalDoor_Satchel_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalDoorET),sheetMetalDoor_Satchel);
        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalDoorET), sheetMetalDoor_Satchel_S);
        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalDoorET), sheetMetalDoor_Satchel_C);



        TextView sheetMetalDoor_Rocket = (TextView) findViewById(R.id.sheetMetalDoor_Rocket);
        TextView sheetMetalDoor_Rocket_S = (TextView) findViewById(R.id.sheetMetalDoor_Rocket_Sulfur);
        TextView sheetMetalDoor_Rocket_C = (TextView) findViewById(R.id.sheetMetalDoor_Rocket_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalDoorET),sheetMetalDoor_Rocket);
        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalDoorET), sheetMetalDoor_Rocket_S);
        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalDoorET), sheetMetalDoor_Rocket_C);



        TextView sheetMetalDoor_C4 = (TextView) findViewById(R.id.sheetMetalDoor_C4);
        TextView sheetMetalDoor_C4S = (TextView) findViewById(R.id.sheetMetalDoor_C4_Sulfur);
        TextView sheetMetalDoor_C4C = (TextView) findViewById(R.id.sheetMetalDoor_C4_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalDoorET),sheetMetalDoor_C4);
        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalDoorET), sheetMetalDoor_C4S);
        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalDoorET), sheetMetalDoor_C4C);








        EditText armoredDoorET = (EditText) findViewById(R.id.armoredDoor_editText);



        TextView armoredDoor_Satchel = (TextView) findViewById(R.id.armored_door_Satchel);
        TextView armoredDoor_Satchel_S = (TextView) findViewById(R.id.armored_door_Satchel_Sulfur);
        TextView armoredDoor_Satchel_C = (TextView) findViewById(R.id.armored_door_Satchel_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(armoredDoorET),armoredDoor_Satchel);
        displayQuantityOfMats(setQuantityOfRaidObject(armoredDoorET), armoredDoor_Satchel_S);
        displayQuantityOfMats(setQuantityOfRaidObject(armoredDoorET), armoredDoor_Satchel_C);



        TextView armoredDoor_Rocket = (TextView) findViewById(R.id.armored_door_Rocket);
        TextView armoredDoor_Rocket_S = (TextView) findViewById(R.id.armored_door_Rocket_Sulfur);
        TextView armoredDoor_Rocket_C = (TextView) findViewById(R.id.armored_door_Rocket_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(armoredDoorET),armoredDoor_Rocket);
        displayQuantityOfMats(setQuantityOfRaidObject(armoredDoorET), armoredDoor_Rocket_S);
        displayQuantityOfMats(setQuantityOfRaidObject(armoredDoorET), armoredDoor_Rocket_C);



        TextView armoredDoor_C4 = (TextView) findViewById(R.id.armored_door_C4);
        TextView armoredDoor_C4S = (TextView) findViewById(R.id.armored_door_C4_Sulfur);
        TextView armoredDoor_C4C = (TextView) findViewById(R.id.armored_door_C4_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(armoredDoorET),armoredDoor_C4);
        displayQuantityOfMats(setQuantityOfRaidObject(armoredDoorET), armoredDoor_C4S);
        displayQuantityOfMats(setQuantityOfRaidObject(armoredDoorET), armoredDoor_C4C);








        EditText garageDoorET = (EditText) findViewById(R.id.garageDoor_editText);


        TextView garageDoor_Satchel = (TextView) findViewById(R.id.garageDoor_Satchel);
        TextView garageDoor_Satchel_S = (TextView) findViewById(R.id.garageDoor_Satchel_Sulfur);
        TextView garageDoor_Satchel_C = (TextView) findViewById(R.id.garageDoor_Satchel_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(garageDoorET),garageDoor_Satchel);
        displayQuantityOfMats(setQuantityOfRaidObject(garageDoorET), garageDoor_Satchel_S);
        displayQuantityOfMats(setQuantityOfRaidObject(garageDoorET), garageDoor_Satchel_C);



        TextView garageDoor_Rocket = (TextView) findViewById(R.id.garageDoor_Rocket);
        TextView garageDoor_Rocket_S = (TextView) findViewById(R.id.garageDoor_Rocket_Sulfur);
        TextView garageDoor_Rocket_C = (TextView) findViewById(R.id.garageDoor_Rocket_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(garageDoorET),garageDoor_Rocket);
        displayQuantityOfMats(setQuantityOfRaidObject(garageDoorET), garageDoor_Rocket_S);
        displayQuantityOfMats(setQuantityOfRaidObject(garageDoorET), garageDoor_Rocket_C);



        TextView garageDoor_C4 = (TextView) findViewById(R.id.garageDoor_C4);
        TextView garageDoor_C4S = (TextView) findViewById(R.id.garageDoor_C4_Sulfur);
        TextView garageDoor_C4C = (TextView) findViewById(R.id.garageDoor_C4_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(garageDoorET),garageDoor_C4);
        displayQuantityOfMats(setQuantityOfRaidObject(garageDoorET), garageDoor_C4S);
        displayQuantityOfMats(setQuantityOfRaidObject(garageDoorET), garageDoor_C4C);









        EditText stoneWallET = (EditText) findViewById(R.id.stoneWall_editText);


        TextView stoneWall_Satchel = (TextView) findViewById(R.id.stoneWall_Satchel);
        TextView stoneWall_Satchel_S = (TextView) findViewById(R.id.stoneWall_Satchel_Sulfur);
        TextView stoneWall_Satchel_C = (TextView) findViewById(R.id.stoneWall_Satchel_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(stoneWallET),stoneWall_Satchel);
        displayQuantityOfMats(setQuantityOfRaidObject(stoneWallET), stoneWall_Satchel_S);
        displayQuantityOfMats(setQuantityOfRaidObject(stoneWallET), stoneWall_Satchel_C);



        TextView stoneWall_Rocket = (TextView) findViewById(R.id.stoneWall_Rocket);
        TextView stoneWall_Rocket_S = (TextView) findViewById(R.id.stoneWall_Rocket_Sulfur);
        TextView stoneWall_Rocket_C = (TextView) findViewById(R.id.stoneWall_Rocket_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(stoneWallET),stoneWall_Rocket);
        displayQuantityOfMats(setQuantityOfRaidObject(stoneWallET), stoneWall_Rocket_S);
        displayQuantityOfMats(setQuantityOfRaidObject(stoneWallET), stoneWall_Rocket_C);



        TextView stoneWall_C4 = (TextView) findViewById(R.id.stoneWall_C4);
        TextView stoneWall_C4S = (TextView) findViewById(R.id.stoneWall_C4_Sulfur);
        TextView stoneWall_C4C = (TextView) findViewById(R.id.stoneWall_C4_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(stoneWallET),stoneWall_C4);
        displayQuantityOfMats(setQuantityOfRaidObject(stoneWallET), stoneWall_C4S);
        displayQuantityOfMats(setQuantityOfRaidObject(stoneWallET), stoneWall_C4C);








        EditText sheetMetalWallET = (EditText) findViewById(R.id.sheetMetalWall_editText);


        TextView sheetMetalWall_Satchel = (TextView) findViewById(R.id.sheetMetalWall_Satchel);
        TextView sheetMetalWall_Satchel_S = (TextView) findViewById(R.id.sheetMetalWall_Satchel_Sulfur);
        TextView sheetMetalWall_Satchel_C = (TextView) findViewById(R.id.sheetMetalWall_Satchel_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalWallET),sheetMetalWall_Satchel);
        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalWallET), sheetMetalWall_Satchel_S);
        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalWallET), sheetMetalWall_Satchel_C);



        TextView sheetMetalWall_Rocket = (TextView) findViewById(R.id.sheetMetalWall_Rocket);
        TextView sheetMetalWall_Rocket_S = (TextView) findViewById(R.id.sheetMetalWall_Rocket_Sulfur);
        TextView sheetMetalWall_Rocket_C = (TextView) findViewById(R.id.sheetMetalWall_Rocket_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalWallET),sheetMetalWall_Rocket);
        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalWallET), sheetMetalWall_Rocket_S);
        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalWallET), sheetMetalWall_Rocket_C);



        TextView sheetMetalWall_C4 = (TextView) findViewById(R.id.sheetMetalWall_C4);
        TextView sheetMetalWall_C4S = (TextView) findViewById(R.id.sheetMetalWall_C4_Sulfur);
        TextView sheetMetalWall_C4C = (TextView) findViewById(R.id.sheetMetalWall_C4_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalWallET),sheetMetalWall_C4);
        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalWallET), sheetMetalWall_C4S);
        displayQuantityOfMats(setQuantityOfRaidObject(sheetMetalWallET), sheetMetalWall_C4C);












        EditText armoredWallET = (EditText) findViewById(R.id.armoredWall_editText);


        TextView armoredWall_Satchel = (TextView) findViewById(R.id.armoredWall_Satchel);
        TextView armoredWall_Satchel_S = (TextView) findViewById(R.id.armoredWall_Satchel_Sulfur);
        TextView armoredWall_Satchel_C = (TextView) findViewById(R.id.armoredWall_Satchel_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(armoredWallET),armoredWall_Satchel);
        displayQuantityOfMats(setQuantityOfRaidObject(armoredWallET), armoredWall_Satchel_S);
        displayQuantityOfMats(setQuantityOfRaidObject(armoredWallET), armoredWall_Satchel_C);



        TextView armoredWall_Rocket = (TextView) findViewById(R.id.armoredWall_Rocket);
        TextView armoredWall_Rocket_S = (TextView) findViewById(R.id.armoredWall_Rocket_Sulfur);
        TextView armoredWall_Rocket_C = (TextView) findViewById(R.id.armoredWall_Rocket_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(armoredWallET),armoredWall_Rocket);
        displayQuantityOfMats(setQuantityOfRaidObject(armoredWallET), armoredWall_Rocket_S);
        displayQuantityOfMats(setQuantityOfRaidObject(armoredWallET), armoredWall_Rocket_C);



        TextView armoredWall_C4 = (TextView) findViewById(R.id.armoredWall_C4);
        TextView armoredWall_C4S = (TextView) findViewById(R.id.armoredWall_C4_Sulfur);
        TextView armoredWall_C4C = (TextView) findViewById(R.id.armoredWall_C4_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(armoredWallET),armoredWall_C4);
        displayQuantityOfMats(setQuantityOfRaidObject(armoredWallET), armoredWall_C4S);
        displayQuantityOfMats(setQuantityOfRaidObject(armoredWallET), armoredWall_C4C);












        EditText highExtStoneET = (EditText) findViewById(R.id.highExtStone_editText);


        TextView highExtStone_Satchel = (TextView) findViewById(R.id.highExtStone_Satchel);
        TextView highExtStone_Satchel_S = (TextView) findViewById(R.id.highExtStone_Satchel_Sulfur);
        TextView highExtStone_Satchel_C = (TextView) findViewById(R.id.highExtStone_Satchel_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(highExtStoneET),highExtStone_Satchel);
        displayQuantityOfMats(setQuantityOfRaidObject(highExtStoneET), highExtStone_Satchel_S);
        displayQuantityOfMats(setQuantityOfRaidObject(highExtStoneET), highExtStone_Satchel_C);



        TextView highExtStone_Rocket = (TextView) findViewById(R.id.highExtStone_Rocket);
        TextView highExtStone_Rocket_S = (TextView) findViewById(R.id.highExtStone_Rocket_Sulfur);
        TextView highExtStone_Rocket_C = (TextView) findViewById(R.id.highExtStone_Rocket_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(highExtStoneET),highExtStone_Rocket);
        displayQuantityOfMats(setQuantityOfRaidObject(highExtStoneET), highExtStone_Rocket_S);
        displayQuantityOfMats(setQuantityOfRaidObject(highExtStoneET), highExtStone_Rocket_C);



        TextView highExtStone_C4 = (TextView) findViewById(R.id.highExtStone_C4);
        TextView highExtStone_C4S = (TextView) findViewById(R.id.highExtStone_C4_Sulfur);
        TextView highExtStone_C4C = (TextView) findViewById(R.id.highExtStone_C4_Charcoal);

        displayQuantityOfMats(setQuantityOfRaidObject(highExtStoneET),highExtStone_C4);
        displayQuantityOfMats(setQuantityOfRaidObject(highExtStoneET), highExtStone_C4S);
        displayQuantityOfMats(setQuantityOfRaidObject(highExtStoneET), highExtStone_C4C);














    }



























}
