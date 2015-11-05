package usc.cs577.team06.cmm_appln;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView lv_dash = (ListView)findViewById(R.id.listViewDash);
        TextView emptyText = (TextView)findViewById(android.R.id.empty);
        lv_dash.setEmptyView(emptyText);

        Intent intent = getIntent();
/*        String message = "Username : "+ username + " \n" + "Password : "+password;
        // Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
*/
        List<String> items = new ArrayList<String>();
        items.add("New Meeting");
        items.add("View Meeting");
        items.add("Publish Meeting");
        items.add("Pending Action Items");
        items.add("Edit Profile");
        items.add("Change Project");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);

        lv_dash.setAdapter(arrayAdapter);

    }

}
