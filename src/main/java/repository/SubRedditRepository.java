package repository;

import entity.SubRedditEntity;

import java.util.ArrayList;
import java.util.List;

public class SubRedditRepository {

    public List<SubRedditEntity> fetchAll() {
        List<SubRedditEntity> subRedditDAOList = new ArrayList<>();

        SubRedditEntity java = new SubRedditEntity(1, "Java","Java News/Tech/Discussion/etc. No programming help, no learning Java");
        subRedditDAOList.add(java);

        SubRedditEntity scala = new SubRedditEntity(2, "Scala","Welcome to Scala");
        subRedditDAOList.add(scala);

        return subRedditDAOList;
    }
}
