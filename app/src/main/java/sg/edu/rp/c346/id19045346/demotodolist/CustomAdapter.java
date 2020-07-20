package sg.edu.rp.c346.id19045346.demotodolist;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> todoList;


    public CustomAdapter(Context context,int resource,ArrayList<ToDoItem> objects){
        super(context,resource,objects);

        parent_context=context;
        layout_id=resource;
        todoList=objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.textViewtitle);
        TextView tvdate = rowView.findViewById(R.id.textViewDate);

        // Obtain the Android Version information based on the position
        ToDoItem currentTodo = todoList.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(currentTodo.getTitle());
        String date = currentTodo.getDate().get(Calendar.DAY_OF_MONTH) + "/" + currentTodo.getDate().get(Calendar.MONTH)
                + "/" + currentTodo.getDate().get(Calendar.YEAR) + " " + currentTodo.getDay(Calendar.DAY_OF_WEEK);
        tvdate.setText(date);


        return rowView;
    }



}