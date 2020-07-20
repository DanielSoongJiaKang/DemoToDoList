package sg.edu.rp.c346.id19045346.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> todoList;


    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.ListviewToDoList);
        Calendar date = Calendar.getInstance();
        date.set(Calendar.DAY_OF_MONTH,1);
        date.set(Calendar.MONTH,8);
        date.set(Calendar.YEAR,2020);

        Calendar date2 = Calendar.getInstance();
        date2.set(Calendar.DAY_OF_MONTH,2);
        date2.set(Calendar.MONTH,8);
        date2.set(Calendar.YEAR,2020);

        ToDoItem item1 = new ToDoItem("Go for movie",  date);
        ToDoItem item2 = new ToDoItem("Go for haircut",date2);


        todoList = new ArrayList<>();
        todoList.addAll(Arrays.asList(item1,item2));

        adapter = new CustomAdapter(this,R.layout.row,todoList);

        lvToDo.setAdapter(adapter);

    }
}
