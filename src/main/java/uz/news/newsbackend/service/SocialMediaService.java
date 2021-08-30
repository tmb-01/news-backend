package uz.news.newsbackend.service;

import org.springframework.stereotype.Service;
import uz.news.newsbackend.entity.SocialMedia;

import java.util.ArrayList;
import java.util.List;

@Service
public class SocialMediaService {

    public List<SocialMedia> getAll() {
        List<SocialMedia> socialMediaList = new ArrayList<>();

        socialMediaList.add(
                new SocialMedia(
                        1L,
                        "facebook",
                        8045
                ));

        socialMediaList.add(
                new SocialMedia(
                        1L,
                        "twitter",
                        8045
                ));

        socialMediaList.add(
                new SocialMedia(
                        1L,
                        "instagram",
                        8045
                ));

        socialMediaList.add(
                new SocialMedia(
                        1L,
                        "youtube",
                        8045
                ));

        return socialMediaList;

    }

}
