package br.com.ifba;

import br.com.ifba.client.SpringClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.ifba.user.repository")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        //SpringClient.main(args);
    }
}