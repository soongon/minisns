package kr.re.kitri.minisns.service;

import kr.re.kitri.minisns.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstaServiceImpl implements InstaService{

    @Autowired
    private ArticleRepository articleRepository;
    @Override
    public String getAllArticles() {
        return articleRepository.selectAllArticles();
    }
}
