package com.roo.demo;

import com.roo.demo.entity.Author;
import com.roo.demo.entity.BookBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Test01SpringBoot02Application {

//	@Value(value="${book.author}")
//	private String bookAuthor;
//	@Value(value="${book.name}")
//	private String bookName;
//	@Value(value="${book.price}")
//	private String bookPrice;

	//如果在实体类中(实体类不是在创建工程是的目录或子目录下)使用@Component和@ConfigurationProperties注解，则无法使用自动注入注解
	@Autowired
	private BookBean bookBean;
	@Autowired
	private Author author;
	public static void main(String[] args) {
		SpringApplication.run(Test01SpringBoot02Application.class, args);
	}
	@RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
	String index() {
//		return "GitGbf's First Spring Boot Project With IDEA \r\nBook Name = " + bookName
//				+ " Book Author = " + bookAuthor + " Book Price = " + bookPrice;
		return "Book Name = " + bookBean.getName() + " Book Author = " + bookBean.getAuthor() + " Book Price = "
				+ bookBean.getPrice() + " Author Name = " + author.getName() + " Author Gender = " + author.getGender()
				+ " Author Age = " + author.getAge();
	}
}
