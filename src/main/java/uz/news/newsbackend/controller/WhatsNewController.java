package uz.news.newsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.news.newsbackend.entity.SocialMedia;
import uz.news.newsbackend.entity.WhatsNew;
import uz.news.newsbackend.payload.WhatsNewDto;
import uz.news.newsbackend.service.SocialMediaService;
import uz.news.newsbackend.service.WhatsNewService;

import java.util.List;

@RestController
@RequestMapping("api/v1/whats-new")
public class WhatsNewController {

    @Autowired
    WhatsNewService whatsNewService;

    @GetMapping
    public List<WhatsNewDto> getAll() {
        return whatsNewService.getAll();
    }
}
