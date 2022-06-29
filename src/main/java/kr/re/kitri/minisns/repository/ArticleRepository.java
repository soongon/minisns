package kr.re.kitri.minisns.repository;

import kr.re.kitri.minisns.model.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ArticleRepository {
    public List<Article> selectAllArticles() {
        // select * from articles;

        List<Article> articles = Arrays.asList(
                new Article(1, "첫번째 글", 1, "처음 쓰는 글이에요"),
                new Article(2, "두번째 글", 1, "두번째 쓰는 글이에요"),
                new Article(3, "세번째 글", 1, "세번째 쓰는 글이에요")
        );
        return articles;
    }
}
