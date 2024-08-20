package david.bookmedia.controller;

import david.bookmedia.domain.Post;
import david.bookmedia.service.PostService;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> all() {
        List<Post> posts = postService.getAllPosts();
//        return CollectionModel.of(posts);
        return posts;
    }
}
