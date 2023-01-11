package entity;

import lombok.Getter;

@Getter
public class PostEntity {

    Integer id;
    String sub;
    String author;
    String text;

    public PostEntity(Integer id, String sub, String author, String text) {
        this.id = id;
        this.sub = sub;
        this.author = author;
        this.text = text;
    }
}
