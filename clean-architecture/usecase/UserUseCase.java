// Use Case Layer

public interface UserUseCase {
    User getUserById(String id);
    void createUser(User user);
}
