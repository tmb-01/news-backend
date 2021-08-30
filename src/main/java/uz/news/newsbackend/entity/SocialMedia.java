package uz.news.newsbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SocialMedia {

    private Long id;
    private String socialMediaName;
    private Integer numberOfFollowers;

}
