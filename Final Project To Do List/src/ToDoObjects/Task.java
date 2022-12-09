package ToDoObjects;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task {
    private String title;
    public String desc;
    public Date date;
    public String status;
    public static final String PATTERN = "MM-dd HH:mm";
    static final SimpleDateFormat formatter = new SimpleDateFormat(PATTERN);
    public static Date getDateFromUser(Scanner kb) {
        boolean flag = true;
        Date reply = new Date();
        while(flag) {
            try {
                String date = kb.nextLine();
                reply = formatter.parse(date);
                flag = false;
            }
            catch (ParseException E) {
                System.out.println("Invalid Input! ");
            }
        }
        return reply;
    }
    public Task(String title, Date date, String desc, String status) {
        this.date = date;
        this.title = title;
        this.desc = desc;
        this.status = status;
    }
    public void displayTask() {
        System.out.println("Task: " + title);
        System.out.println("Due Date: " + formatter.format(date));
        System.out.println("Description: " + desc);
        System.out.println("Status of Completion: " + status);
    }
}

