package sg.edu.rp.c346.id18014854.demotodolist;

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

    public Calendar getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.MONTH) + "/" + date.get(Calendar.YEAR) + "(" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";
        return str;
    }

    private String getDay(int dayOfWeek) {
        if (dayOfWeek == 1) {
            return "Monday";
        } else if (dayOfWeek == 2) {
            return "Tuesday";
        } else if (dayOfWeek == 3) {
            return "Wednesday";
        } else if (dayOfWeek == 4) {
            return "Thursday";
        } else if (dayOfWeek == 5) {
            return "Friday";
        } else if (dayOfWeek == 6) {
            return "Saturday";
        } else if (dayOfWeek == 7) {
            return "Sunday";
        }
        return null;
    }
}
