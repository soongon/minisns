package kr.re.kitri.minisns.repository;

import kr.re.kitri.minisns.model.Article;
import kr.re.kitri.minisns.model.Post;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PostRepository {
    public List<Post> selectAllPosts() {
        List<Post> posts = Arrays.asList(
                new Post(1, "첫번째 글", "kim", "처음 쓰는 글이에요", 0),
                new Post(2, "두번째 글", "lee", "두번째 쓰는 글이에요", 15),
                new Post(3, "세번째 글", "park", "세번째 쓰는 글이에요", 20)
        );
        return posts;
    }

    public Post selectPostById(long postId) {
        return new Post(postId, "제목입니다.", "lee", "조회하신 내용입니다.", 0);
    }
}
