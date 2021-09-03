package uz.news.newsbackend.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.news.newsbackend.entity.WhatsNew;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WhatsNewDto {
    private Long id;
    private String category;
    private String title;
    private LocalDate createdAt;
    private String author;
    private String imageLink;
    private String description;
    private List<WhatsNew> whatsNewList;
}
