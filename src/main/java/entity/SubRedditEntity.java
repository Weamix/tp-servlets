package entity;

import lombok.Getter;

@Getter
public class SubRedditEntity {
        Integer id;
        String name;
        String description;

        public SubRedditEntity(Integer id, String name, String description) {
            this.id = id;
            this.name = name;
            this.description = description;
        }

}
