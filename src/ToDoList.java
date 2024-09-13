import java.util.LinkedHashMap;
import java.util.Map;

class ToDoList {

    Map<String, Task> tasksMap = new LinkedHashMap<>();

    void addTask(Task task) {
        tasksMap.put(task.title, task);
    }

    void removeTask(String title) {
        tasksMap.remove(title);
    }

    void displayTasks() {
        tasksMap.values().forEach(System.out::println);
    }

    void displayCompletedTasks() {
        tasksMap.values().stream().filter(n -> n.isCompleted).forEach(System.out::println);
    }

    void markAsCompleted(Task task) {
        task.isCompleted = true;
    }
}