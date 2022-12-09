import ToDoObjects.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Main {
    public static ArrayList<Task> taskList = new ArrayList<>();
    //Adds a task to the array
    public static void addTask(Task T) {
        taskList.add(T);
    }
    // Was having issues with try and catch and found this solution worked to have the user give an Int in the form of a string and convert it.
    // Try/Catch in the while loop with a kb.nextInt was causing an infinite loop while it skipped the nextInt.
    // Made to make sure the user inputs a number
    public static int getIntFromUser(Scanner kb) {
        boolean flag = true;
        int reply = -1;
        while(flag) {
            try {
                String input = kb.nextLine();
                reply = Integer.parseInt(input);
                flag = false;
            }
            catch (NumberFormatException E) {
                System.out.println("Invalid Input! ");
            }
        }
        return reply;
    }
    // Made to make sure the user inputs a number within the bounds of the task
    private static int getIndexFromUser(Scanner kb) {
        int reply;
        System.out.println("Which task?");
        reply = getIntFromUser(kb);
        // Checks to make sure the reply is in bounds
        while (reply <= 0 || reply > taskList.size()) {
            System.out.println("Invalid Index! ");
            reply = getIntFromUser(kb);
        }
        return reply;
    }
    // Made to prevent user from using Edit, Mark done, and Remove task while the list is empty
    private static boolean isEmpty() {
        return taskList.size() == 0;
    }
    public static void main(String[] args) {
    //Variables
        Scanner kb = new Scanner(System.in);
        boolean flag = true;
        String spacing = "\n---------------------------------------";
        String title;
        Date date;
        String desc;
        String status;
        System.out.println("Welcome to your Task List!");
        while(flag) {
            System.out.print(spacing +  "\nSelect an Action: (1-6) " +
                                        "\n1.) Add a Task " +
                                        "\n2.) Mark as Task Done " +
                                        "\n3.) Remove A Task " +
                                        "\n4.) Edit A Task " +
                                        "\n5.) Display All Tasks " +
                                        "\n6.) Exit " + spacing + "\n");
            String menu = kb.nextLine();

            switch(menu) {
                case "1": {
                    System.out.print("Name your task: ");
                    title = kb.nextLine();
                    System.out.print("When's it due? (MM-DD HH:mm) ");
                    date = Task.getDateFromUser(kb);
                    System.out.print("Describe your task: ");
                    desc = kb.nextLine();
                    System.out.print("Status is set to Incomplete.");
                    status = "Incomplete";
                    addTask(new Task(title, date, desc, status));
                    break;
                }
                case "2": {
                    if (!isEmpty()) {
                        int reply = getIndexFromUser(kb);
                        taskList.get(reply - 1).status = "Complete";
                        System.out.print("\nTask Complete! Would you like to remove the task? (Y/N) ");
                        String input = kb.nextLine();
                        if (input.equals("Y") || input.equals("Yes")) {
                            taskList.remove(reply - 1);
                        }
                    }
                    else {
                        System.out.println("Error! No tasks to remove! ");
                    }
                    break;
                }
                case "3": {
                    if (!isEmpty()) {
                        int reply = getIndexFromUser(kb);
                        System.out.print("\nWould you like to remove the task? (Y/N) ");
                        String input = kb.nextLine();
                        if (input.equals("Y") || input.equals("Yes")) {
                            taskList.remove(reply - 1);
                        }
                    }
                    else {
                        System.out.println("Error! No tasks to remove! ");
                    }
                    break;
                }
                case "4": {
                    if (!isEmpty()) {
                        System.out.print("\nWhat task do you want to edit? ");
                        int index = getIndexFromUser(kb);
                        Task t = taskList.get(index - 1);
                        t.displayTask();
                        System.out.print("\nIs this the task you want to edit? (Y/N) ");
                        String reply = kb.nextLine();
                        if(reply.equals("Y") || reply.equals("Yes")) {
                            System.out.print("\nWould you like to change the Description or Date? (Desc or Date) ");
                            reply = kb.nextLine();
                            if(reply.equals("Desc")) {
                                t.desc = kb.nextLine();
                            }
                            else if (reply.equals("Date")) {
                                t.date = Task.getDateFromUser(kb);
                            }
                            else {
                                System.out.println("Invalid Input! ");
                            }
                        }
                    }
                    break;
                }
                case "5": {
                    System.out.println("Displaying Tasks... ");
                    for(int i = 0; i < taskList.size(); i++) {
                        System.out.println(spacing);
                        taskList.get(i).displayTask();
                    }
                    System.out.println("Press Enter to Continue");
                    kb.nextLine();
                    break;
                }
                case "6": {
                    System.out.println("Exiting... ");
                    flag = false;
                }
            }
        }
    }
}