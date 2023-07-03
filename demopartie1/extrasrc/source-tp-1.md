```java
//1 - Les comments  => java doc
//2 - Utilisation des services
//3 - Interface
//4 - Gestion des exceptions
//5 - Couche DTO



import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author
 * @version
 *
 * */

@RestController
public class UserController {
    /*@Autowired
    private UserRepository userRepository;*/
    @Autowired
    private UserService userService;

    /**
     * Description méthode
     * @param
     * @return
     * @throws
     */
    @GetMapping("/users")
    public List<User> getAllUsers() {
        //return userRepository.findAll();
        return userService.getAllUsers();
    }
}

//UserRequestDTO
//UserResponseDTO

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

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
```