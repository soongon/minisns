package kr.re.kitri.minisns.repository;

import kr.re.kitri.minisns.model.Article;
import kr.re.kitri.minisns.model.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.List;

@Repository
@Mapper
public interface PostRepository {
    List<Post> selectAllPosts();

    Post selectPostById(long postId);

    void insertPost(Post post);
}
