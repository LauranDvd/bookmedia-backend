package david.bookmedia.domain;

import java.time.LocalDateTime;

public class Post {
    private String title;
    private String content;
    private int authorId;
    private LocalDateTime creationTime;

    public Post(String title, String content, int authorId, LocalDateTime creationTime) {
        this.title = title;
        this.content = content;
        this.authorId = authorId;
        this.creationTime = creationTime;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getAuthorId() {
        return authorId;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }
}
