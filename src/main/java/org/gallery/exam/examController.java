package org.gallery.exam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class examController {
    @GetMapping("/")
    public ResponseEntity exam(){
        String str = "안녕하세요.";
        String str2 = "반갑습니다.";
        return null;
    }
}
