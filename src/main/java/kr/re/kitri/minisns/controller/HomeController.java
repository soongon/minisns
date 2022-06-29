package kr.re.kitri.minisns.controller;

import kr.re.kitri.minisns.service.InstaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private InstaService instaService;

    @GetMapping("/articles")
    public String viewAllArticles() {
        return instaService.getAllArticles();
    }
}
