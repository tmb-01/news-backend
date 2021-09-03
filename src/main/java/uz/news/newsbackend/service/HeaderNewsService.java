package uz.news.newsbackend.service;

import org.springframework.stereotype.Service;
import uz.news.newsbackend.entity.HeaderNews;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HeaderNewsService {
    public List<HeaderNews> getNews() {
        List<HeaderNews> newsList = new ArrayList<>();

        newsList.add(new HeaderNews(
                1L,
                "business",
                "Anna Lora Stuns In White At Her Australian Premiere",
                LocalDate.of(2021, 7, 21),
                "Maraim Tuxtasunov",
                "trending_top2.jpg"));

        newsList.add(new HeaderNews(
                2L,
                "business",
                "Anna Lora Stuns In White At Her Australian Premiere",
                LocalDate.of(2021, 7, 21),
                "Maraim Tuxtasunov",
                "trending_top02.jpg"));

        newsList.add(new HeaderNews(
                3L,
                "fashion",
                "Anna Lora Stuns In White At Her Australian Premiere",
                LocalDate.of(2021, 7, 21),
                "Maraim Tuxtasunov",
                "trending_top3.jpg"));

        newsList.add(new HeaderNews(
                4L,
                "tech",
                "Anna Lora Stuns In White At Her Australian Premiere",
                LocalDate.of(2021, 7, 21),
                "Maraim Tuxtasunov",
                "trending_top4.jpg"));

        return newsList;

    }
}
