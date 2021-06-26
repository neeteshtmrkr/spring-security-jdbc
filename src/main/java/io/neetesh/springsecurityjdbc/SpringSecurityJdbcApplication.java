package io.neetesh.springsecurityjdbc;

import io.neetesh.springsecurityjdbc.Repo.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJdbcApplication.class, args);
    }

}
