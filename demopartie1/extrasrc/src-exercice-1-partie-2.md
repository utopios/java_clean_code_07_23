```java
@Service
public class TaskService {
    
    public int calculatePriority(Task task) {
        if (task.isUrgent() && task.getDeadline().isBefore(LocalDate.now())) {
            return 10;
        } else if (task.isUrgent()) {
            return 5;
        } else if (task.getCategory().equals("High")) {
            return 8;
        } else if (task.getCategory().equals("Medium")) {
            return 5;
        } else {
            return 2;
        }
    }

    
}

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate deadline;
    private boolean isUrgent;
    private String category;

    // Getters and Setters
}

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/priority")
    public int calculateTaskPriority(@RequestBody Task task) {
        return taskService.calculatePriority(task);
    }
}
```