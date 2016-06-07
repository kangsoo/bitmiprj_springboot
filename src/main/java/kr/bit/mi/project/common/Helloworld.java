package kr.bit.mi.project.common;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

    @RequestMapping("/")
    public String index(){
        return "Hello world~";
    }

    @RequestMapping("/display")
    public String display(){
        return "Hello world~ display~ we are the world~";
    }

}
