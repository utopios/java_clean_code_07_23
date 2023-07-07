@RestController
@RequestMapping("/tasks")
public class TaskController {
    private TaskPort taskPort;

    public TaskController(TaskPort taskPort) {
        this.taskPort = taskPort;
    }

    @PostMapping
    public Task createTask(@RequestParam String name) {
        return taskPort.createTask(name);
    }

    @PutMapping("/{id}")
    public Task completeTask(@PathVariable String id) {
        return taskPort.completeTask(id);
    }

    @GetMapping
    public List<Task> getTasks() {
        return taskPort.getTasks();
    }
}
