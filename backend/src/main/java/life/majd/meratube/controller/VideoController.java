package life.majd.meratube.controller;

import life.majd.meratube.service.S3Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/video")
public class VideoController {

    S3Service s3Service;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public String uploadFile(MultipartFile file) {
        return s3Service.uploadFile(file);
    }
}
