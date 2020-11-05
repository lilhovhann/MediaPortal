package io.project.app.mediaportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@EnableMongoRepositories("io.project.app.mediaportal.repositories")
@ComponentScan(basePackages = {"io.project"})
@EntityScan("io.project.app.mediaportal.models")
public class OrangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrangeApplication.class, args);
              
	}

}
