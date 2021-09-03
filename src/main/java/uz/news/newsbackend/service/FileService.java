package uz.news.newsbackend.service;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileService {

    String getImagePath() {
        List<byte[]> imageList = new ArrayList<>();
        return "";
    }


    public byte[] getById(String filename) {

        File file = new File("src/main/resources/assets/files/"+filename);
        try {
            return Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            return null;
        }
    }
}
