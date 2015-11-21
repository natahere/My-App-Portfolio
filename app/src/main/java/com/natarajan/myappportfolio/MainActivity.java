package com.natarajan.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn1 = (Button) findViewById(R.id.mediaBtn);
        btn2 = (Button) findViewById(R.id.scoresBtn);
        btn3 = (Button) findViewById(R.id.libBtn);
        btn4 = (Button) findViewById(R.id.buildBigBtn);
        btn5 = (Button) findViewById(R.id.xyzBtn);
        btn6 = (Button) findViewById(R.id.capBtn);


       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }


    public void onClickbtn(View view) {
        String tagVal = view.getTag().toString();
        int tag = Integer.parseInt(tagVal);

        switch (tag) {
            case 0:

                break;
            case 1:
                Toast.makeText(this, "This button will launch my Media Stream app!", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "This button will launch my Scores app!", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "This button will launch my Library app!", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this, "This button will launch my Build it bigger app!", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(this, "This button will launch my XYZ Reader app!", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Toast.makeText(this, "This button will launch my Capstone my own app!", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
