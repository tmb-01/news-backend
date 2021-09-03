package uz.news.newsbackend.service;

import org.springframework.stereotype.Service;
import uz.news.newsbackend.entity.MostPopular;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class MostPopularService {

    public List<MostPopular> getAll() {
        List<MostPopular> mostPopularList = new ArrayList<>();

        mostPopularList.add(
                new MostPopular(
                        1L,
                        "weeklyNews1.png",
                        "Scarlett’s disappointment at latest accolade",
                        "Jhon",
                        LocalDate.of(2021, 8, 20)
                )
        );
        mostPopularList.add(
                new MostPopular(
                        2L,
                        "weeklyNews2.png",
                        "Scarlett’s disappointment at latest accolade",
                        "Jhon",
                        LocalDate.of(2021, 8, 20)
                )
        );
        mostPopularList.add(
                new MostPopular(
                        3L,
                        "weeklyNews3.png",
                        "Scarlett’s disappointment at latest accolade",
                        "Jhon",
                        LocalDate.of(2021, 8, 20)
                )
        );
        mostPopularList.add(
                new MostPopular(
                        4L,
                        "weeklyNews1.png",
                        "Scarlett’s disappointment at latest accolade",
                        "Jhon",
                        LocalDate.of(2021, 8, 20)
                )
        );
        mostPopularList.add(
                new MostPopular(
                        5L,
                        "weeklyNews2.png",
                        "Scarlett’s disappointment at latest accolade",
                        "Jhon",
                        LocalDate.of(2021, 8, 20)
                )
        );
        mostPopularList.add(
                new MostPopular(
                        6L,
                        "weeklyNews3.png",
                        "Scarlett’s disappointment at latest accolade",
                        "Jhon",
                        LocalDate.of(2021, 8, 20)
                )
        );

        return mostPopularList;
    }

}
