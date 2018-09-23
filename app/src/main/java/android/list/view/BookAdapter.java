package android.list.view;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Book> {
    private final Context context;

    private final ArrayList<Book> programs;

    public BookAdapter(Context context, ArrayList<Book> programsArray) {
        super(context, -1, programsArray);
        this.context = context;
        this.programs = programsArray;
    }

    @Override
    public int getCount() {
        return programs.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.custom_list_row_item, parent, false);

        Book book = programs.get(position);
        // finding text view and setting values
        TextView textView = (TextView) rowView.findViewById(R.id.book_name);
        textView.setText(book.name);

        TextView textView2 = (TextView) rowView.findViewById(R.id.prices);
        textView2.setText(book.price +" 円");

        Log.d("test",""+position);

        return rowView;
    }
}