package task;

public class Employee implements TaskObserver{
    private String name;
    private Task task;

    public Employee(String name, Task task) {
        this.name = name;
        this.task = task;
        this.task.register(this);
    }

    @Override
    public void update(String status) {
        System.out.println("Employee " + name + " has been notified with task " +
                task.getTaskName()+ " status change to: " + status);
    }
}
