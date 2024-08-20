package david.bookmedia.repository;

import david.bookmedia.domain.Post;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class PostRepository {
    private List<Post> allPosts = List.of(
            new Post("titlu", "cont", 1, LocalDateTime.now()),
            new Post("alt titlu", "nuj", 2, LocalDateTime.now())
    );

    public List<Post> getAllPosts() {
        return allPosts;
    }

    public void addPost(Post post) {
        allPosts.add(post);
    }
}
