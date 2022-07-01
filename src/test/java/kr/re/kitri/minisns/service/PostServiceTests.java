package kr.re.kitri.minisns.service;

import kr.re.kitri.minisns.model.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PostServiceTests {

    @Autowired
    private PostService postService;

    @Test
    public void testGetAllPosts() {
        // getAllPosts 함수를 호출한다.
        // 결과를 반환할건데.. 반환된 결과를 가지고 성공/실패를 판단.
        // 1. List<Post> 객체가 null 이 아니면 성공
        // 2. List<post> 의 리스트의 갯수가 0 보다 크면 성공
        // 3. List<Post> 의 첫번째 Post를 꺼내서 title 이 first 면 성공
        List<Post> posts = postService.getAllPosts();
        assertTrue(posts.size() > 0);
    }

    @Test
    public void testSetPost() {
        Post post = new Post(99999990, "dsfds", "sldfkjdksl", "lskdfjdskl", 10);
        postService.setPost(post);
    }

    // 상세조회 시나리오
    // 1번 글을 조회해서 타이틀 속성이 "first" 이면 성공
}
