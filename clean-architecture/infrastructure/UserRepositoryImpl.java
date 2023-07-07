// Infrastructure Layer

public class UserRepositoryDatabaseImpl implements UserRepository {
    private Database database;

    public UserRepositoryDatabaseImpl(Database database) {
        this.database = database;
    }

    public User findById(String id) {
        // Interact with the database to find a user by ID
    }

    public void save(User user) {
        // Interact with the database to save the user
    }
}
