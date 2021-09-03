package uz.news.newsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.news.newsbackend.entity.CarouselNews;
import uz.news.newsbackend.entity.MostRecent;
import uz.news.newsbackend.service.CarouselNewsService;
import uz.news.newsbackend.service.MostRecentService;

import java.util.List;

@RestController
@RequestMapping("api/v1/most-recent")
@CrossOrigin
public class MostRecentController {

    @Autowired
    MostRecentService mostRecentService;

    @GetMapping
    public List<MostRecent> getAll() {
        return mostRecentService.getAll();
    }
}
