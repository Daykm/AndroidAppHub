package com.example.daykm.nanodegreehub;

import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HubActivity extends AppCompatActivity {

    Button streamerButton, scoresButton, libraryButton, biggerButton, xyzButton, capstoneButton;

    private class ButtonListener implements View.OnClickListener {

        @StringRes int toastMessage;

        public ButtonListener(@StringRes int toastMessage) {
            this.toastMessage = toastMessage;
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(HubActivity.this, toastMessage, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);

        streamerButton = (Button) findViewById(R.id.button_spotify);
        scoresButton = (Button) findViewById(R.id.button_scores);
        libraryButton = (Button) findViewById(R.id.button_library);
        biggerButton = (Button) findViewById(R.id.button_bigger);
        xyzButton = (Button) findViewById(R.id.button_xyz);
        capstoneButton = (Button) findViewById(R.id.button_capstone);

        streamerButton.setOnClickListener(new ButtonListener(R.string.hub_toast_spotify));
        scoresButton.setOnClickListener(new ButtonListener(R.string.hub_toast_scores));
        libraryButton.setOnClickListener(new ButtonListener(R.string.hub_toast_library));
        biggerButton.setOnClickListener(new ButtonListener(R.string.hub_toast_bigger));
        xyzButton.setOnClickListener(new ButtonListener(R.string.hub_toast_xyz));
        capstoneButton.setOnClickListener(new ButtonListener(R.string.hub_toast_capstone));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hub, menu);
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
