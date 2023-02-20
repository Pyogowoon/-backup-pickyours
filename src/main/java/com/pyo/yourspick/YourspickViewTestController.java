package com.pyo.yourspick;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


public class YourspickViewTestController {


    @GetMapping("/")
    public String index(){

        return "index";
    }
    @GetMapping("user/signin")
    public String signin(){

        return "user/signin";
    }
    @GetMapping("/user/join")
    public String join(){

        return "user/join";
    }

    @GetMapping("/board/board")
    public String board(){

        return "board/board";
    }

    @GetMapping("/board/post")
    public String post(){

        return "board/post";
    }
}
