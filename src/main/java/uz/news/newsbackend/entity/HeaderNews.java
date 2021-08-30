package uz.news.newsbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HeaderNews {
    private Long id;
    private String category;
    private String title;
    private LocalDate createdAt;
    private String author;
    private String imageLink;
}
