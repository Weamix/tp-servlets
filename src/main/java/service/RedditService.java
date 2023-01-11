package service;

import entity.PostEntity;
import entity.SubRedditEntity;
import dto.PostDTO;
import dto.RedditDTO;
import dto.SubRedditDTO;
import repository.PostRedditRepository;
import repository.SubRedditRepository;

import java.util.ArrayList;
import java.util.List;

public class RedditService {

   private final SubRedditRepository subRedditRepository = new SubRedditRepository();
   private final PostRedditRepository postRedditRepository = new PostRedditRepository();

   public List<SubRedditDTO> fetchAllSubs(){
        List<SubRedditDTO> subRedditDTOList = new ArrayList<>();
        for(SubRedditEntity s : subRedditRepository.fetchAll()){
            subRedditDTOList.add(new SubRedditDTO(s.getName(), s.getDescription()));
        }
        return subRedditDTOList;
    }

    public List<PostDTO> fetchAllPosts(){
        List<PostDTO> postDTOList = new ArrayList<>();
        for(PostEntity p : postRedditRepository.fetchAll()){
            postDTOList.add(new PostDTO(p.getSub(), p.getAuthor(),p.getText()));
        }
        return postDTOList;
    }

    public List<RedditDTO> fetchThreePosts(){
        List<RedditDTO> redditDTOList = new ArrayList<>();

        for(SubRedditEntity s : subRedditRepository.fetchAll()){
            List<PostDTO> postDTOList = new ArrayList<>();
            RedditDTO redditDTO = new RedditDTO(s.getName(), s.getDescription(), postDTOList);
            for(PostEntity p : postRedditRepository.fetchAll()){
                if(p.getSub().equals("r/"+s.getName())){
                    postDTOList.add(new PostDTO(p.getSub(), p.getAuthor(),p.getText()));
                }
            }
            redditDTOList.add(redditDTO);
        }

        return redditDTOList;
    }


}
