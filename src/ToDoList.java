import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the to-do list.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ". " + tasks.get(i).getDescription());
            }
        }
    }

    public void markTaskComplete(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.get(taskIndex).markComplete();
        } else {
            System.out.println("Invalid task index");
        }
    }

    public void removeTask(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.remove(taskIndex);
        } else {
            System.out.println("Invalid task index");
        }
    }
}
