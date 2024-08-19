package david.bookmedia.repository;

import david.bookmedia.domain.Post;
import david.bookmedia.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepository {
    private List<User> allUsers = List.of(
            new User(1, "david"),
            new User(2, "ion")
    );

    public List<User> getAllUsers() {
        return allUsers;
    }

    public void addUser(User user) {
        allUsers.add(user);
    }
}
