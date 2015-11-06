package usc.cs577.team06.cmm_appln;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProjectCategoryChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_category_choose);

        ListView lv = (ListView)findViewById(R.id.ProjectTypeList);
        TextView emptyText = (TextView)findViewById(android.R.id.empty);
        lv.setEmptyView(emptyText);

        List<String> items = new ArrayList<String>();
        items.add("Program");
        items.add("Design");
        items.add("Construction");
        items.add("Regulatory Agencies");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);

        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(intent);
                int type = position;
                switch(type){
                    case 0:
                        intent = new Intent(getApplicationContext(), NewMeetingActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), NewMeetingActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), NewMeetingActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), NewMeetingActivity.class);
                        startActivity(intent);
                        break;
                }

            }
        });

    }

}
