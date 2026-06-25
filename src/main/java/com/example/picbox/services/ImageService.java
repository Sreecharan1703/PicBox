package com.example.picbox.services;
import org.springframework.stereotype.Service;
@Service
public class ImageService {
    public String encodeImageToBase64(byte[] imageData) {
        return java.util.Base64.getEncoder().encodeToString(imageData);
    }
}
