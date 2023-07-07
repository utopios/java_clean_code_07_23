public interface TaskPort {
    Task createTask(String name);
    Task completeTask(String id);
    List<Task> getTasks();
}
