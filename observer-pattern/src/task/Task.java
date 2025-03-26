package task;

import java.util.ArrayList;
import java.util.List;

public class Task implements TaskSubject{
    private String taskName;
    private String taskStatus;
    private List<TaskObserver> observers = new ArrayList<>();

    public Task(String taskStatus, String taskName) {
        this.taskStatus = taskStatus;
        this.taskName = taskName;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        notifyObservers();
    }

    @Override
    public void register(TaskObserver obj) {
        if (!observers.contains(obj)) {
            observers.add(obj);
        }
    }

    @Override
    public void unregister(TaskObserver obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (TaskObserver observer : observers) {
            observer.update(taskStatus);
        }
    }
}
