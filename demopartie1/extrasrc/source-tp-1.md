```java
@RestController
public class UserController {
  @Autowired
  private UserRepository userRepository;
  
  @GetMapping("/users")
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }
}
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  private String name;
  private String email;
  private String password;
  
  // getters et setters
}
```