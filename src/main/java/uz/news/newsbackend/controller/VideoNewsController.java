package uz.news.newsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.news.newsbackend.entity.SocialMedia;
import uz.news.newsbackend.entity.VideoNews;
import uz.news.newsbackend.service.SocialMediaService;
import uz.news.newsbackend.service.VideoNewsService;

import java.util.List;

@RestController
@RequestMapping("api/v1/video-news")
@CrossOrigin
public class VideoNewsController {

    @Autowired
    VideoNewsService videoNewsService;

    @GetMapping
    public List<VideoNews> getAll() {
        return videoNewsService.getAll();
    }
}
