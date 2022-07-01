package kr.re.kitri.minisns.controller;

import kr.re.kitri.minisns.model.Post;
import kr.re.kitri.minisns.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    public static Logger logger = LoggerFactory.getLogger(PostController.class);

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> viewAllPosts() {
        // 누가 언제 이함수를 왜? 호출했다.
        logger.debug("debug 로그 남겨요...... ");
        logger.info("info 로그 남겨요...... ");
        logger.error("error 로그 남겨요...... ");
        return postService.getAllPosts();
    }

    @GetMapping("/posts/{postId}")
    public Post viewPostById(@PathVariable long postId) {
        return postService.getPostById(postId);
    }

    @PostMapping("/posts")
    public Post registPost(@RequestBody Post post) {
        postService.setPost(post);
        return post;
    }
}
