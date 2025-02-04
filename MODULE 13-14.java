import java.util.ArrayList;
import java.util.Scanner;

public class TaskScheduler {

    private static ArrayList<String> tasks = new ArrayList<>();

    public static void add_task() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the task to add: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public static void run_scheduler() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to run.");
        } else {
            System.out.println("Running tasks:");
            for (String task : tasks) {
                System.out.println("- " + task);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Run Scheduler");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    add_task();
                    break;
                case 2:
                    run_scheduler();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
