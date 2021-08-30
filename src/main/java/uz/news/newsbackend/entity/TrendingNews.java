package uz.news.newsbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrendingNews {
    private Long id;
    private String imageId;
    private String title;
    private LocalDate createdAt;
    private String linkToVideo;
}
