package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDTO {

    private final String sub;
    private final String author;
    private final String text;

    public PostDTO(String sub, String author, String text) {
        this.sub = sub;
        this.author = author;
        this.text = text;
    }
}
