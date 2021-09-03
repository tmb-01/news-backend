package uz.news.newsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.news.newsbackend.service.FileService;

@RestController
@RequestMapping("api/v1/files")
@CrossOrigin
public class FileController {

    @Autowired
    FileService fileService;

    @GetMapping("{filename}")
    public byte[] getImage(@PathVariable String filename) {
        return fileService.getById(filename);
    }
}
