package task;

public class Test {
    public static void main(String[] args) {
        Task task = new Task("create", "Fix bug Cam");
        Task task2 = new Task("inprogess", "payment via paypal");
        Employee employee1 = new Employee("Employee 1", task);
        Employee employee2 = new Employee("Employee 2", task);
        Employee employee3 = new Employee("Employee 3", task2);

        System.out.println("Task Name: " + task.getTaskName() + " -- Status: " + task.getTaskStatus());
        task.setTaskStatus("In Progress");

        System.out.println("Task Name: " + task2.getTaskName() + " -- Status: " + task2.getTaskStatus());
        task2.setTaskStatus("pending");
    }
}
