package uz.news.newsbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MostRecent {
    private Long id;
    private String author;
    private String title;
    private String category;
    private int hoursAgo;
    private String image;
}
