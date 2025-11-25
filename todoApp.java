import java.util.*;
class Task{
    String title;
    boolean isCompleted;
    Task(String title){
        this.title = title;
        this.isCompleted = false;
    }
}
public class todoApp{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[]args){
        while(true){
            System.out.println("Todo List Application");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Exit");
            System.out.print("Choose an option:");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch(choice){
                case 1: addTask();
                break;
                case 2: viewTasks();
                break;
                case 3: markTaskCompleted();
                break;
                case 4: System.exit(0);
                default: System.out.println(" Invalid option. Please try again.");
            }
        }
    }

    public static void addTask(){
        System.out.print(" Enter task title:");
        String title = sc.nextLine();
        tasks.add(new Task(title));
        System.out.println(" Task added successfully.");
    }

    public static void viewTasks(){
        if(tasks.isEmpty()){
            System.out.println(" No tasks available.");
            return;
        }
        for(int i = 0; i < tasks.size(); i++){
            Task task = tasks.get(i);
            String status = task.isCompleted ? "Completed" : "Pending";
            System.out.println((i + 1) + ". " + task.title + " - " + status);
        }
    }
    public static void markTaskCompleted(){
        System.out.print(" Enter task number to mark as completed:");
        int taskNumber = sc.nextInt();
        if(taskNumber > 0 && taskNumber <= tasks.size()){
            Task task = tasks.get(taskNumber - 1);
            task.isCompleted = true;
            System.out.println(" Task marked as completed.");
        } else{
            System.out.println(" Invalid task number. Please try again.");
        }
    }
}
            
            