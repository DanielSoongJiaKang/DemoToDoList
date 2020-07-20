package sg.edu.rp.c346.id19045346.demotodolist;

import java.util.Calendar;

public class ToDoItem {
    private String title;
    private Calendar date;


    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }


    public String toString() {
        return title + date;
    }


    public String getDay(int day) {
        day = date.get(Calendar.DAY_OF_WEEK) + 1;
        String display = "";
        if(Calendar.MONDAY == day) {
            display = "(Monday)";

        }
        else if(Calendar.TUESDAY == day) {
            display = "(Tuesday)";

        }
        else if(Calendar.WEDNESDAY == day) {
            display = "(Wednesday)";

        }
        else if(Calendar.THURSDAY == day) {
            display = "(Thursday)";

        }
        else if(Calendar.FRIDAY == day) {
            display = "(Friday)";

        }
        else if(Calendar.SATURDAY == day) {
            display = "(Saturday)";

        }
        else if (Calendar.SUNDAY == day){
            display = "(Sunday)";

        }
        return  display;

    }
}
