package kr.bit.mi.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class BitmiprjSpringbootApplication {

	public static void main(String[] args)
	{
		ApplicationContext ctx = SpringApplication.run(BitmiprjSpringbootApplication.class, args);

		System.out.println("Spring Boot");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);

		for(String beanName : beanNames){
			System.out.println("[kskim]" + beanName);
		}

	}
}
