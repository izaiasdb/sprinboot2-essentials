package academy.devdojo.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Aula 03 -> Já contem (EnableAutoConfiguration, ComponentScan, Configuration)
//@EnableAutoConfiguration
//@ComponentScan(basePackages = "academy.devdojo.springboot2") // Aula 03
//@ComponentScan
public class Springboot2EssentialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2EssentialsApplication.class, args);
	}

}