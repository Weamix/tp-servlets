package dto;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class SubRedditDTO {
    private final String name;
    private final String description;

    public SubRedditDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
