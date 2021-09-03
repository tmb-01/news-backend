package uz.news.newsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.news.newsbackend.entity.CarouselNews;
import uz.news.newsbackend.entity.MostPopular;
import uz.news.newsbackend.service.CarouselNewsService;
import uz.news.newsbackend.service.MostPopularService;

import java.util.List;

@RestController
@RequestMapping("api/v1/most-popular")
@CrossOrigin
public class MostPopularController {

    @Autowired
    MostPopularService mostPopularService;

    @GetMapping
    public List<MostPopular> getAll() {
        return mostPopularService.getAll();
    }
}
