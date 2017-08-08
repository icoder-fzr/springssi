package cn.spring.boot.start;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fengzirong on 2017-05-14.
 */

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication app = new SpringApplication(SampleController.class);
        app.run(args);
    }
}
