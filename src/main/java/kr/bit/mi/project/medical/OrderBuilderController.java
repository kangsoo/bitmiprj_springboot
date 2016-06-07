package kr.bit.mi.project.medical;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderBuilderController {

    @RequestMapping("/ordertest")
    public String checkOrderValidation(){
        return "checkOrderValidation";
    }
}
