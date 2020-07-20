package sg.edu.rp.c346.id18014854.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> toDoList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewToDo);

        toDoList = new ArrayList<>();

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2020, 8 , 1);
        Calendar calendar2 =  Calendar.getInstance();
        calendar2.set(2020, 8, 2);

        ToDoItem item1 = new ToDoItem("Go for movie", calendar1);
        ToDoItem item2 = new ToDoItem("Go for movie", calendar2);

        toDoList.add(item1);
        toDoList.add(item2);

        adapter = new CustomAdapter(this, R.layout.row, toDoList);
        lvToDo.setAdapter(adapter);
    }
}
