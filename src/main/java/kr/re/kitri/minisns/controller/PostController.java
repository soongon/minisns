package kr.re.kitri.minisns.controller;

import kr.re.kitri.minisns.model.Post;
import kr.re.kitri.minisns.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> viewAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/posts/{postId}")
    public Post viewPostById(@PathVariable long postId) {
        return postService.getPostById(postId);
    }
}
