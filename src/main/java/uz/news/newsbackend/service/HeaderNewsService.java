package uz.news.newsbackend.service;

import uz.news.newsbackend.entity.HeaderNews;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeaderNewsService {
    public List<HeaderNews> getNews() {
        List<HeaderNews> newsList = new ArrayList<>();

        newsList.add(new HeaderNews(
                1L,
                "business",
                "Anna Lora Stuns In White At Her Australian Premiere",
                LocalDate.of(2021, 7, 21),
                "Maraim Tuxtasunov",
                ""));

        newsList.add(new HeaderNews(
                2L,
                "tech",
                "Anna Lora Stuns In White At Her Australian Premiere",
                LocalDate.of(2021, 7, 21),
                "Maraim Tuxtasunov",
                ""));

        newsList.add(new HeaderNews(
                3L,
                "business",
                "Anna Lora Stuns In White At Her Australian Premiere",
                LocalDate.of(2021, 7, 21),
                "Maraim Tuxtasunov",
                ""));

        newsList.add(new HeaderNews(
                4L,
                "fashion",
                "Anna Lora Stuns In White At Her Australian Premiere",
                LocalDate.of(2021, 7, 21),
                "Maraim Tuxtasunov",
                ""));

        newsList.add(new HeaderNews(
                5L,
                "business",
                "Anna Lora Stuns In White At Her Australian Premiere",
                LocalDate.of(2021, 7, 21),
                "Maraim Tuxtasunov",
                ""));

        newsList.add(new HeaderNews(
                6L,
                "business",
                "Anna Lora Stuns In White At Her Australian Premiere",
                LocalDate.of(2021, 7, 21),
                "Maraim Tuxtasunov",
                ""));

        return newsList;

    }
}
