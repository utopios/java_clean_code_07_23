// Controller Layer

public class UserController {
    private UserUseCase useCase;
    private UserPresenter presenter;

    public UserController(UserUseCase useCase, UserPresenter presenter) {
        this.useCase = useCase;
        this.presenter = presenter;
    }

    public UserViewModel getUserById(String id) {
        User user = useCase.getUserById(id);
        return presenter.present(user);
    }

    public void createUser(UserViewModel viewModel) {
        User user = new User();
        user.setId(viewModel.getId());
        user.setName(viewModel.getName());
        useCase.createUser(user);
    }
}
