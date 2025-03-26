package task;

public interface TaskSubject {
    void register(TaskObserver obj);
    void unregister(TaskObserver obj);
    void notifyObservers();
}
