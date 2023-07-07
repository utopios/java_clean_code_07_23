// Presenter Layer

public class UserPresenter {
    public UserViewModel present(User user) {
        UserViewModel viewModel = new UserViewModel();
        viewModel.setId(user.getId());
        viewModel.setName(user.getName());
        return viewModel;
    }
}
