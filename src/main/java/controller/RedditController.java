package controller;

import dto.PostDTO;
import dto.RedditDTO;
import dto.SubRedditDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import service.RedditService;

import java.util.List;

@Path("/reddit")
public class RedditController {

    private final RedditService redditService = new RedditService();

    @GET
    @Path("/subs")
    @Produces("application/json")
    public List<SubRedditDTO> getAllSubs() {
        return redditService.fetchAllSubs();
    }


    @GET
    @Path("/posts")
    @Produces("application/json")
    public List<PostDTO> getAllPosts() {
        return redditService.fetchAllPosts();
    }

    @Path("/posts/3")
    @GET
    @Produces("application/json")
    public List<RedditDTO> getThreePosts() {
        return redditService.fetchThreePosts();
    }

}

