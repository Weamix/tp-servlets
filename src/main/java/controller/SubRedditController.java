package controller;

import dto.PostDTO;
import dto.RedditDTO;
import dto.SubRedditDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import repository.PostRepository;
import service.RedditService;

import java.util.List;

@Path("/subreddit")
public class SubRedditController {

    private final RedditService subRedditService = new RedditService();

    @GET
    @Produces("application/json")
    public List<SubRedditDTO> getAllSubReddit() {
        return subRedditService.fetchAllSubReddit();
    }

    @Path("/posts")
    @GET
    @Produces("application/json")
    public List<PostDTO> getAllPosts() {
        return subRedditService.fetchAllPosts();
    }

    @Path("/3")
    @GET
    @Produces("application/json")
    public List<RedditDTO> getThreePosts() {
        return subRedditService.fetchThreePosts();
    }

}

