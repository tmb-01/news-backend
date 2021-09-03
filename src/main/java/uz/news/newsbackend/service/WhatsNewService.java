package uz.news.newsbackend.service;

import org.springframework.stereotype.Service;
import uz.news.newsbackend.entity.WhatsNew;
import uz.news.newsbackend.payload.WhatsNewDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class WhatsNewService {

    public List<WhatsNewDto> getAll() {

        List<WhatsNewDto> whatsNewDtoList = new ArrayList<>();
        List<WhatsNew> whatsNewList = new ArrayList<>();

//        lifestyle
        whatsNewList.add(
                new WhatsNew(
                        1L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_right_img1.png"
                )
        );

        whatsNewList.add(
                new WhatsNew(
                        2L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_right_img2.png"
                )
        );

        whatsNewList.add(
                new WhatsNew(
                        3L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_right_img3.png"
                )
        );

        whatsNewList.add(
                new WhatsNew(
                        4L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_right_img4.png"
                )
        );


        whatsNewDtoList.add(
                new WhatsNewDto(
                        1L,
                        "lifestyle",
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "Alice cloe",
                        "",
                        "hello world",
                        whatsNewList
                )
        );

//        travel
        whatsNewList = new ArrayList<>();
        whatsNewList.add(
                new WhatsNew(
                        1L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_news_details1.png"
                )
        );

        whatsNewList.add(
                new WhatsNew(
                        2L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        ""
                )
        );

        whatsNewList.add(
                new WhatsNew(
                        3L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        ""
                )
        );

        whatsNewList.add(
                new WhatsNew(
                        4L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        ""
                )
        );


        whatsNewDtoList.add(
                new WhatsNewDto(
                        2L,
                        "travel",
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "Alice cloe",
                        "whats_news_details1.png",
                        "hello world",
                        whatsNewList
                )
        );

//        fashion
        whatsNewList = new ArrayList<>();
        whatsNewList.add(
                new WhatsNew(
                        1L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_right_img1.png"
                )
        );

        whatsNewList.add(
                new WhatsNew(
                        2L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_right_img2.png"
                )
        );

        whatsNewList.add(
                new WhatsNew(
                        3L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_right_img3.png"
                )
        );

        whatsNewList.add(
                new WhatsNew(
                        4L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_right_img4.png"
                )
        );


        whatsNewDtoList.add(
                new WhatsNewDto(
                        3L,
                        "fashion",
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "Alice cloe",
                        "whats_news_details1.png",
                        "hello world",
                        whatsNewList
                )
        );

//        sport
        whatsNewList = new ArrayList<>();
        whatsNewList.add(
                new WhatsNew(
                        1L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_right_img1.png"
                )
        );

        whatsNewList.add(
                new WhatsNew(
                        2L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_right_img2.png"
                )
        );

        whatsNewList.add(
                new WhatsNew(
                        3L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_right_img3.png"
                )
        );

        whatsNewList.add(
                new WhatsNew(
                        4L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_right_img4.png"
                )
        );


        whatsNewDtoList.add(
                new WhatsNewDto(
                        4L,
                        "travel",
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "Alice cloe",
                        "whats_news_details1.png",
                        "hello world",
                        whatsNewList
                )
        );

//        technology
        whatsNewList = new ArrayList<>();
        whatsNewList.add(
                new WhatsNew(
                        1L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_right_img1.png"
                )
        );

        whatsNewList.add(
                new WhatsNew(
                        2L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_right_img2.png"
                )
        );

        whatsNewList.add(
                new WhatsNew(
                        3L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_right_img3.png"
                )
        );

        whatsNewList.add(
                new WhatsNew(
                        4L,
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "whats_right_img4.png"
                )
        );


        whatsNewDtoList.add(
                new WhatsNewDto(
                        5L,
                        "technology",
                        "Secretart for Economic Air plane that looks like",
                        LocalDate.of(2020, 7, 19),
                        "Alice cloe",
                        "whats_news_details1.png",
                        "hello world",
                        whatsNewList
                )
        );


        return whatsNewDtoList;

    }
}
