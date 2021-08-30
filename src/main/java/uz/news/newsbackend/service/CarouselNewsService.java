package uz.news.newsbackend.service;

import uz.news.newsbackend.entity.CarouselNews;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarouselNewsService {

    public List<CarouselNews> getAll() {
        List<CarouselNews> carouselNewsList = new ArrayList<>();

        carouselNewsList.add(
                new CarouselNews(
                        1L,
                        "imageId",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2020, 9, 13)
                )
        );

        carouselNewsList.add(
                new CarouselNews(
                        2L,
                        "imageId",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2020, 9, 13)
                )
        );

        carouselNewsList.add(
                new CarouselNews(
                        3L,
                        "imageId",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2020, 9, 13)
                )
        );

        carouselNewsList.add(
                new CarouselNews(
                        4L,
                        "imageId",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2020, 9, 13)
                )
        );

        carouselNewsList.add(
                new CarouselNews(
                        5L,
                        "imageId",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2020, 9, 13)
                )
        );

        carouselNewsList.add(
                new CarouselNews(
                        6L,
                        "imageId",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2020, 9, 13)
                )
        );

        carouselNewsList.add(
                new CarouselNews(
                        7L,
                        "imageId",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2020, 9, 13)
                )
        );


        return carouselNewsList;
    }

}
