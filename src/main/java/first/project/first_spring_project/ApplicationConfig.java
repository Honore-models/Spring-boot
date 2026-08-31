package first.project.first_spring_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import first.project.first_spring_project.Services.MyFirstClass;

@Configuration
public class ApplicationConfig {

    @Bean("firstBean")
    public MyFirstClass myFirstClass() {
        return new MyFirstClass();
    }

}
