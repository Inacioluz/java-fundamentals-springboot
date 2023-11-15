package inaciosilva.com.fundamentalsspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "inaciosilva.com")
public class FundamentalsSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundamentalsSpringBootApplication.class, args);
	}

}
