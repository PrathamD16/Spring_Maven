package com.example.hello_springboot;

import com.example.hello_springboot.account.Account;
import com.example.hello_springboot.configuration.AccoungConfig;
import com.example.hello_springboot.dao.AccountDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.hello_springboot.account.Account;

@SpringBootApplication
public class HelloSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringbootApplication.class, args);
		System.out.println("Hello from spring boot");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AccoungConfig.class);
		AccountDao accountdao = context.getBean("accountDao", AccountDao.class);
		accountdao.addAccount();
	}

}
