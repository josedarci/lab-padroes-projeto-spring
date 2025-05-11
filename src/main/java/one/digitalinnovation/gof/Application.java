package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Classe principal do projeto Spring Boot.
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "one.digitalinnovation.gof.service")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
