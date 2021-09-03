package uz.news.newsbackend.service;

import org.springframework.stereotype.Service;
import uz.news.newsbackend.entity.CarouselNews;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarouselNewsService {

    public List<CarouselNews> getAll() {
        List<CarouselNews> carouselNewsList = new ArrayList<>();

        carouselNewsList.add(
                new CarouselNews(
                        1L,
                        "weekly2News1.png",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2020, 9, 13)
                )
        );

        carouselNewsList.add(
                new CarouselNews(
                        2L,
                        "weekly2News2.png",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2020, 9, 13)
                )
        );

        carouselNewsList.add(
                new CarouselNews(
                        3L,
                        "weekly2News3.png",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2020, 9, 13)
                )
        );

        carouselNewsList.add(
                new CarouselNews(
                        4L,
                        "weekly2News4.png",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2020, 9, 13)
                )
        );

        carouselNewsList.add(
                new CarouselNews(
                        5L,
                        "weekly2News1.png",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2020, 9, 13)
                )
        );

        carouselNewsList.add(
                new CarouselNews(
                        6L,
                        "weekly2News2.png",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2020, 9, 13)
                )
        );

        carouselNewsList.add(
                new CarouselNews(
                        7L,
                        "weekly2News3.png",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2020, 9, 13)
                )
        );


        return carouselNewsList;
    }

}
