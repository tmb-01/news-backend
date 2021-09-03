package uz.news.newsbackend.service;

import org.springframework.stereotype.Service;
import uz.news.newsbackend.entity.MostRecent;

import java.util.ArrayList;
import java.util.List;

@Service
public class MostRecentService {

    public List<MostRecent> getAll() {
        List<MostRecent> mostRecentList = new ArrayList<>();

        mostRecentList.add(
                new MostRecent(
                        1L,
                        "Jhon",
                        "What to Wear: 9+ Cute Work Outfits to Wear This.",
                        "vogue",
                        2,
                        "most_recent.png"
                )
        );

        mostRecentList.add(
                new MostRecent(
                        2L,
                        "Jhon",
                        "What to Wear: 9+ Cute Work Outfits to Wear This.",
                        "vogue",
                        2,
                        "most_recent1.png"
                )
        );

        mostRecentList.add(
                new MostRecent(
                        3L,
                        "Jhon",
                        "What to Wear: 9+ Cute Work Outfits to Wear This.",
                        "vogue",
                        2,
                        "most_recent2.png"
                )
        );

        return mostRecentList;
    }

}
