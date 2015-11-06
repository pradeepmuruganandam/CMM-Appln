package usc.cs577.team06.cmm_appln;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
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

        List<String> items = new ArrayList<String>();
        items.add("New Meeting");
        items.add("View Meeting");
        items.add("Publish Meeting");
        items.add("Pending Action Items");
        items.add("Edit Profile");
        items.add("Change Project");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);

        lv_dash.setAdapter(arrayAdapter);

        lv_dash.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                int type = position;
                Intent intent = null;
                switch(type){
                    case 0:
                        intent = new Intent(getApplicationContext(), ProjectCategoryChooseActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), ViewMeetingActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), PublishMeetingActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), DashboardActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), EditContactInfoActivity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), ProjectChooseActivity.class);
                        startActivity(intent);
                        break;
                }

            }
        });

    }

}
