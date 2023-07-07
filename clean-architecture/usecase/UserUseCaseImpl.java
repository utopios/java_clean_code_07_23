// Use Case Layer

public class UserUseCaseImpl implements UserUseCase {
    private UserRepository repository;

    public UserUseCaseImpl(UserRepository repository) {
        this.repository = repository;
    }

    public User getUserById(String id) {
        return repository.findById(id);
    }

    public void createUser(User user) {
        repository.save(user);
    }
}
