import java.util.*;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("task1", "descr1", true);
        Task task2 = new Task("task2", "descr2", false);
        Task task3 = new Task("task3", "descr3", true);
        Task task4 = new Task("task4", "descr4", false);
        Task task5 = new Task("task5", "descr5", true);

        ToDoList list1 = new ToDoList();
        list1.addTask(task1);
        list1.addTask(task2);
        list1.addTask(task3);
        list1.addTask(task4);
        list1.addTask(task5);


        System.out.println("список до удаления задач:");
        list1.displayTasks();
        System.out.println();

        list1.removeTask("task1");
        list1.removeTask("task3");

        System.out.println("список после удаления 1 и 3 задачи:");
        list1.displayTasks();


        System.out.println();
        System.out.println("Тесты по доп. заданию:");

        System.out.println("список только выполненных задач:");
        list1.displayCompletedTasks();
        System.out.println();

        System.out.println("список только выполненных задач после изменения 4й задачи как выполненной:");
        list1.markAsCompleted(task4);
        list1.displayCompletedTasks();
    }
}