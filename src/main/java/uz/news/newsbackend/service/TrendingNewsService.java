package uz.news.newsbackend.service;

import org.springframework.stereotype.Service;
import uz.news.newsbackend.entity.TrendingNews;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TrendingNewsService {

    public List<TrendingNews> getAll() {
        List<TrendingNews> trendingNewsList = new ArrayList<>();

        trendingNewsList.add(
                new TrendingNews(
                        1L,
                        "tranding1.png",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2021, 7, 12),
                        ""
                )
        );

        trendingNewsList.add(
                new TrendingNews(
                        2L,
                        "tranding2.png",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2021, 7, 12),
                        ""
                )
        );

        trendingNewsList.add(
                new TrendingNews(
                        3L,
                        "tranding1.png",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2021, 7, 12),
                        ""
                )
        );

        trendingNewsList.add(
                new TrendingNews(
                        4L,
                        "tranding2.png",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2021, 7, 12),
                        ""
                )
        );

        trendingNewsList.add(
                new TrendingNews(
                        5L,
                        "tranding1.png",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2021, 7, 12),
                        ""
                )
        );

        trendingNewsList.add(
                new TrendingNews(
                        6L,
                        "tranding2.png",
                        "What to Expect From the 2020 Oscar Nomin ations",
                        LocalDate.of(2021, 7, 12),
                        ""
                )
        );

        return trendingNewsList;

    }

}
