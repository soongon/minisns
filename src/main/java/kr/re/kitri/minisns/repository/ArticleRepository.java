package kr.re.kitri.minisns.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ArticleRepository {
    public String selectAllArticles() {
        return "전체 글 입ㄴ디ㅏ.";
    }
}
