public class TaskService implements TaskPort {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(String name) {
        Task task = new Task();
        task.setName(name);
        task.setComplete(false);
        return taskRepository.save(task);
    }

    @Override
    public Task completeTask(String id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setComplete(true);
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }
}
