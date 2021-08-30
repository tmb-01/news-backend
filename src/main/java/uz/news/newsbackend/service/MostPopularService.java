package uz.news.newsbackend.service;

import uz.news.newsbackend.entity.MostPopular;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MostPopularService {

    public List<MostPopular> getAll() {
        List<MostPopular> mostPopularList = new ArrayList<>();

        mostPopularList.add(
                new MostPopular(
                        1L,
                        "",
                        "Scarlett’s disappointment at latest accolade",
                        "Jhon",
                        LocalDate.of(2021, 8, 20)
                )
        );
        mostPopularList.add(
                new MostPopular(
                        2L,
                        "",
                        "Scarlett’s disappointment at latest accolade",
                        "Jhon",
                        LocalDate.of(2021, 8, 20)
                )
        );
        mostPopularList.add(
                new MostPopular(
                        3L,
                        "",
                        "Scarlett’s disappointment at latest accolade",
                        "Jhon",
                        LocalDate.of(2021, 8, 20)
                )
        );
        mostPopularList.add(
                new MostPopular(
                        4L,
                        "",
                        "Scarlett’s disappointment at latest accolade",
                        "Jhon",
                        LocalDate.of(2021, 8, 20)
                )
        );
        mostPopularList.add(
                new MostPopular(
                        5L,
                        "",
                        "Scarlett’s disappointment at latest accolade",
                        "Jhon",
                        LocalDate.of(2021, 8, 20)
                )
        );
        mostPopularList.add(
                new MostPopular(
                        6L,
                        "",
                        "Scarlett’s disappointment at latest accolade",
                        "Jhon",
                        LocalDate.of(2021, 8, 20)
                )
        );

        return mostPopularList;
    }

}
