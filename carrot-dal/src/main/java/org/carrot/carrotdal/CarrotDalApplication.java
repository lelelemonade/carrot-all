package org.carrot.carrotdal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.carrot.carrotdal.mapper")
public class CarrotDalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarrotDalApplication.class, args);
	}

}
