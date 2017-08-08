package cn.spring.boot.start.test;

import cn.spring.boot.start.bean.AuthorSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fengzirong on 2017-07-14.
 */
@RestController
@SpringBootApplication
public class TestProperties {

//    @Value("${book.author}")
//    private String bookAuthor;
//    @Value("$(book.name)")
//    private String bookName;

    @Autowired
    private AuthorSetting authorSetting;

    @RequestMapping("/")
    String index(){
         return "book name is:"+authorSetting.getAuthor()+" and book author is :"+authorSetting.getName();
    }

    public static void main(String args[]){
        SpringApplication.run(TestProperties.class,args);
    }
}
