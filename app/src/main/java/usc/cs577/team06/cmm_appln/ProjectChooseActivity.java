package usc.cs577.team06.cmm_appln;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.*;

import java.util.*;


public class ProjectChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_project_choose);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ListView lv = (ListView)findViewById(R.id.ProjectList);
        TextView emptyText = (TextView)findViewById(android.R.id.empty);
        lv.setEmptyView(emptyText);

        Intent intent = getIntent();
        String username = intent.getStringExtra(MainActivity.UserName);
        String password = intent.getStringExtra(MainActivity.Password);

        String message = "Username : "+ username + " \n" + "Password : "+password;
        // Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        List<String> items = new ArrayList<String>();
        items.add(username);
        items.add(password);
        items.add("USC Village");
        items.add("USC Construction");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);

        lv.setAdapter(arrayAdapter);
    }

}
