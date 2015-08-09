package com.example.catfish.inspire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Quotes extends AppCompatActivity {

    private String quotes[] = {"empty", "empty", "empty", "empty", "empty", "empty", "empty",
            "empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty",
            "empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);
        quotes[0] = getResources().getString(R.string.q1);
        quotes[1] = getResources().getString(R.string.q2);
        quotes[2] = getResources().getString(R.string.q3);
        quotes[3] = getResources().getString(R.string.q4);
        quotes[4] = getResources().getString(R.string.q5);
        quotes[5] = getResources().getString(R.string.q6);
        quotes[6] = getResources().getString(R.string.q7);
        quotes[7] = getResources().getString(R.string.q8);
        quotes[8] = getResources().getString(R.string.q9);
        quotes[9] = getResources().getString(R.string.q10);
        quotes[10] = getResources().getString(R.string.q11);
        quotes[11] = getResources().getString(R.string.q12);
        quotes[12] = getResources().getString(R.string.q13);
        quotes[13] = getResources().getString(R.string.q14);
        quotes[14] = getResources().getString(R.string.q15);
        quotes[15] = getResources().getString(R.string.q16);
        quotes[16] = getResources().getString(R.string.q17);
        quotes[17] = getResources().getString(R.string.q18);
        quotes[18] = getResources().getString(R.string.q19);
        quotes[19] = getResources().getString(R.string.q20);
        quotes[20] = getResources().getString(R.string.q21);
        quotes[21] = getResources().getString(R.string.q22);
        quotes[22] = getResources().getString(R.string.q23);
        quotes[23] = getResources().getString(R.string.q24);
        quotes[24] = getResources().getString(R.string.q25);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quotes, menu);
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

    public void showQuote(View view) {
        Random rng = new Random();
        int random = rng.nextInt(25);
        TextView quote = (TextView) findViewById(R.id.quoteView);
        quote.setText(quotes[random]);
    }
}
