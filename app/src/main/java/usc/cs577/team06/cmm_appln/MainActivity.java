package usc.cs577.team06.cmm_appln;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.io.Console;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    public final static String UserName = "com.mycompany.myfirstapp.USERNAME";
    public final static String Password = "com.mycompany.myfirstapp.PASSWORD";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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

    public void sendCredentials(View view){
        Intent intent = new Intent(this, ProjectChooseActivity.class);
        EditText username_box = (EditText) findViewById(R.id.username);
        String username = username_box.getText().toString();

        EditText password_box = (EditText) findViewById(R.id.password);
        String password = password_box.getText().toString();

        intent.putExtra(UserName, username);
        intent.putExtra(Password, password);

        startActivity(intent);

    }

    public void toDashboard(View view){
        Intent intent = new Intent(this, ProjectChooseActivity.class);
        startActivity(intent);
    }
}
