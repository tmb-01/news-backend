package uz.news.newsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.news.newsbackend.entity.SocialMedia;
import uz.news.newsbackend.entity.TrendingNews;
import uz.news.newsbackend.service.SocialMediaService;
import uz.news.newsbackend.service.TrendingNewsService;

import java.util.List;

@RestController
@RequestMapping("api/v1/trending-news")
@CrossOrigin
public class TrendingNewsController {

    @Autowired
    TrendingNewsService trendingNewsService;

    @GetMapping
    public List<TrendingNews> getAll() {
        return trendingNewsService.getAll();
    }
}
