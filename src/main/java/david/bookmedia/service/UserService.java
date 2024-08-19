package david.bookmedia.service;

import david.bookmedia.domain.Post;
import david.bookmedia.domain.User;
import david.bookmedia.repository.PostRepository;
import david.bookmedia.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }
}
