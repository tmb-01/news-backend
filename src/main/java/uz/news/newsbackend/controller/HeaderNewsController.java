package uz.news.newsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.news.newsbackend.entity.HeaderNews;
import uz.news.newsbackend.service.HeaderNewsService;

import java.util.List;

@RestController
@RequestMapping("api/v1/header-news")
@CrossOrigin
public class HeaderNewsController {

    @Autowired
    HeaderNewsService headerNewsService;

    @GetMapping
    public List<HeaderNews> getAll() {
        return headerNewsService.getNews();
    }

}
