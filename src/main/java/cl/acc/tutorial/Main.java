package cl.acc.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableAsync
@ComponentScan(basePackages = {"cl.acc.tutorial"})
@PropertySource(
        value = {"classpath:/application.properties"},
        ignoreResourceNotFound = true)
@EnableJpaRepositories(basePackages = {"cl.acc.tutorial.repository"})
@EntityScan(basePackages = {"cl.acc.tutorial.entity"})
public class Main extends SpringBootServletInitializer implements WebApplicationInitializer{

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Main.class);
    }
}
