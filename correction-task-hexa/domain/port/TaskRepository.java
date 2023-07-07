public interface TaskRepository {
    Task save(Task task);
    Task findById(String id);
    List<Task> findAll();
}
