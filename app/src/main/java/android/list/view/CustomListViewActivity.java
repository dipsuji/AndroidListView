package android.list.view;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        final ListView listView = (ListView) findViewById(R.id.book_list);

        ArrayList<Book> bookArrayList = new ArrayList<>();

        Book book = new Book();
        book.price = 434;
        book.name = "Algebra";
        bookArrayList.add(book);

        book = new Book();
        book.price = 324;
        book.name = "Trigonometry";
        bookArrayList.add(book);

        book = new Book();
        book.price = 540;
        book.name = "Calculus";
        bookArrayList.add(book);

        book = new Book();
        book.price = 343;
        book.name = "Differential Equations";
        bookArrayList.add(book);

        book = new Book();
        book.price = 3243;
        book.name = "Probability & Statistics";
        bookArrayList.add(book);

        book = new Book();
        book.price = 500;
        book.name = "Real Analysis";
        bookArrayList.add(book);

        book = new Book();
        book.price = 453;
        book.name = "Abstract Algebra";
        bookArrayList.add(book);

        book = new Book();
        book.price = 3243;
        book.name = "Mechanics";
        bookArrayList.add(book);

        book = new Book();
        book.price = 3243;
        book.name = "Linear Algebra";
        bookArrayList.add(book);

        book = new Book();
        book.price = 643;
        book.name = "Discrete Mathematics";
        bookArrayList.add(book);

        book = new Book();
        book.price = 243;
        book.name = "Linear Programming & Its Applications";
        bookArrayList.add(book);

        book = new Book();
        book.price = 643;
        book.name = "Complex Analysis";
        bookArrayList.add(book);

        book = new Book();
        book.price = 630;
        book.name = "Numerical Analysis";
        bookArrayList.add(book);




        BookAdapter adapter = new BookAdapter(this, bookArrayList);

        listView.setAdapter(adapter);
        // click on item of row
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Book book = (Book) listView.getItemAtPosition(position);
                Toast.makeText(CustomListViewActivity.this, " Clicked " +book.name , Toast.LENGTH_SHORT).show();
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
