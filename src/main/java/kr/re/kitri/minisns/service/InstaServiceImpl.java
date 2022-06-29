package kr.re.kitri.minisns.service;

import kr.re.kitri.minisns.model.Article;
import kr.re.kitri.minisns.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstaServiceImpl implements InstaService{

    @Autowired
    private ArticleRepository articleRepository;
    @Override
    public List<Article> getAllArticles() {
        return articleRepository.selectAllArticles();
    }
}
