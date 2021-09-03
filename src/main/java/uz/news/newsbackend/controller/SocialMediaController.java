package uz.news.newsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.news.newsbackend.entity.CarouselNews;
import uz.news.newsbackend.entity.SocialMedia;
import uz.news.newsbackend.service.CarouselNewsService;
import uz.news.newsbackend.service.SocialMediaService;

import java.util.List;

@RestController
@RequestMapping("api/v1/social-media")
public class SocialMediaController {

    @Autowired
    SocialMediaService socialMediaService;

    @GetMapping
    public List<SocialMedia> getAll() {
        return socialMediaService.getAll();
    }
}
