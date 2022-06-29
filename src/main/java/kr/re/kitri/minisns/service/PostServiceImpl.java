package kr.re.kitri.minisns.service;

import kr.re.kitri.minisns.model.Post;
import kr.re.kitri.minisns.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPosts() {
        return postRepository.selectAllPosts();
    }

    @Override
    public Post getPostById(long postId) {
        return postRepository.selectPostById(postId);
    }

    @Override
    public Post setPost(Post post) {
        return postRepository.insertPost(post);
    }
}
