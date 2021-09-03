package uz.news.newsbackend.service;

import org.springframework.stereotype.Service;
import uz.news.newsbackend.entity.VideoNews;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoNewsService {

    public List<VideoNews> getAll() {
        List<VideoNews> videoNewsList = new ArrayList<>();

        videoNewsList.add(
                new VideoNews(
                        1L,
                        "news1.mp4",
                        "Spondon News -2019"
                )
        );

        videoNewsList.add(
                new VideoNews(
                        2L,
                        "news2.mp4",
                        "Spondon News -2019"
                )
        );

        videoNewsList.add(
                new VideoNews(
                        3L,
                        "news3.mp4",
                        "Spondon News -2019"
                )
        );

        return videoNewsList;
    }
}
