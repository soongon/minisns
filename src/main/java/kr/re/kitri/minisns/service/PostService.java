package kr.re.kitri.minisns.service;

import kr.re.kitri.minisns.model.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();

    Post getPostById(long postId);

}
