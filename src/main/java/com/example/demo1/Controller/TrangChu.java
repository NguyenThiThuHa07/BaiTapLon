package com.example.demo1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class TrangChu {
    @GetMapping("/trangchu")
    public String home(){
        return "TrangChu/Trangchu";
    }
}
