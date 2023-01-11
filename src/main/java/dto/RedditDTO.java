package dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RedditDTO {
    private final String name;
    private final String description;

    private final List<PostDTO> posts;

    public RedditDTO(String name, String description, List<PostDTO> posts) {
        this.name = name;
        this.description = description;
        this.posts = posts;
    }
}
