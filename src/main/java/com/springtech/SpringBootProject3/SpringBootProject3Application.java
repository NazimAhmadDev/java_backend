package com.springtech.SpringBootProject3;


import com.springtech.SpringBootProject3.Address.user_address;
import com.springtech.SpringBootProject3.Model.Address_Details;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringBootProject3Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootProject3Application.class, args);
		
		user_address useradd = context.getBean(user_address.class);

		Address_Details ad = new Address_Details();

		ad.setId(2L);
		ad.setName("vishal kumar");
		ad.setAddress("#xyz");
		ad.setCity("panchkula");
		ad.setState("Chandigarh");
		ad.setZip(140060);
		ad.setPhone_number(567123890);
		ad.setEmail("vishal@gmail.com");
		ad.setBook_name("ThreeStage");
		ad.setBook_type("Mystery");

		Address_Details ad2 = useradd.save(ad);
		System.out.println(ad2);

	}
}
