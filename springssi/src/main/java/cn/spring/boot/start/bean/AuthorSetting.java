package cn.spring.boot.start.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by fengzirong on 2017-07-14.
 */
@Component
@ConfigurationProperties(prefix = "book")
public class AuthorSetting {

    private String author;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
