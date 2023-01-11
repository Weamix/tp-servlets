package repository;

import entity.PostEntity;

import java.util.ArrayList;
import java.util.List;

public class PostRedditRepository {

    public List<PostEntity> fetchAll() {
        List<PostEntity> postEntityList = new ArrayList<>();

        PostEntity postEntity1 = new PostEntity(1, "r/Scala","Redditor1","Hi, I am new to scala. I have built a fat jar.i have added a jks file while running locally i am able to use the jks but when i am building a jar and running it..i am getting an error that jks file path is not found….\\nwhere and how should i put my jks file in code in intellij so that the jks file can be accessed by my jar?");
        postEntityList.add(postEntity1);

        PostEntity postEntity2 = new PostEntity(2, "r/Scala","Redditor2","My attempt to understand…erceive Java as complex");
        postEntityList.add(postEntity2);

        PostEntity postEntity3 = new PostEntity(2, "r/Scala","Redditor3","I see many videos on YouTube teaching how to use scala, and I get the impression that every dev teaching scala knows Java");
        postEntityList.add(postEntity3);

        return postEntityList;
    }
}

