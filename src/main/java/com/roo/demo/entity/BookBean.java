package com.roo.demo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@Configuration
@ConfigurationProperties(prefix = "book",ignoreUnknownFields = true)
//@PropertySource("classpath:book.properties")
public class BookBean {
   //因为高版本的ConfigurationProperties取消了locations属性，可以使用PropertySource注解代替，但是操作复杂些，需要手动使用Value注解
//    @Value(value = "${book.name}")
    private String name;
//    @Value(value = "${book.author}")
    private String author;
//    @Value(value = "${book.price}")
    private String price;
    private String publisher;

    public BookBean() {
    }

    public BookBean(String name, String author, String price, String publisher) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
