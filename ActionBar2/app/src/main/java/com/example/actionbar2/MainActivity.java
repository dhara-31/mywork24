package com.example.actionbar2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ActionBar actionBar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        actionBar = getSupportActionBar();

        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);

        actionBar.setLogo(R.drawable.download);

        actionBar.setTitle("My actionbar");


        Button showActionBarButton = (Button) findViewById(R.id.button);
        showActionBarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionBar.show();
            }
        });
    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the action bar menu from menu xml file.
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.myxmlfile, menu);
            return super.onCreateOptionsMenu(menu);
        }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();
        String menuTitle = (String)item.getTitle();

        switch (itemId)
        {

            case R.id.menuNews:
                Toast.makeText(this,"title of actionbar"+menuTitle,Toast.LENGTH_LONG).show();
                break;

            case R.id.space :
               break;

            case R.id.option:
                Toast.makeText(this,"option select",Toast.LENGTH_LONG).show();
                break;
            case R.id.menuHide:
                actionBar.hide();
                break;
            case R.id.menuExit:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    }
