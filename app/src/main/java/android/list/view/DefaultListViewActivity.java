package android.list.view;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DefaultListViewActivity extends AppCompatActivity {

    // Array of strings...
    String[] languages = {"Python", "Java", "Ruby/Ruby on Rails", "HTML (HyperText Markup Language)",
            "JavaScript", "C Language", "C++", "C#", "Objective-C", "PHP (Hypertext Preprocessor)",
            "SQL (Structured Query Language)", "Swift"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_list_view);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.default_list_row_item, languages);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        // click on item of row
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(DefaultListViewActivity.this, " Clicked " + listView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case android.R.id.home:
                finish();
        }
        return true;
    }

}
