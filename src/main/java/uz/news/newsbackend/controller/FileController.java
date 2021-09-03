package uz.news.newsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.news.newsbackend.service.FileService;

@RestController
@RequestMapping("api/v1/files")
public class FileController {

    @Autowired
    FileService fileService;

    @GetMapping("{filename}")
    public byte[] getImage(@PathVariable String filename) {
        return fileService.getById(filename);
    }
}
