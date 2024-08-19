package david.bookmedia.controller;

import david.bookmedia.domain.Post;
import david.bookmedia.domain.User;
import david.bookmedia.service.PostService;
import david.bookmedia.service.UserService;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public CollectionModel<User> all() {
        List<User> users = userService.getAllUsers();
        return CollectionModel.of(users);
    }
}
