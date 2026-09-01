package first.project.first_spring_project.learningClasses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean("firstBean")
    public MyFirstClass myFirstClass() {
        return new MyFirstClass();
    }

    @Bean
    public FirstService firstService() {
        return new FirstService(new MyFirstClass());
    }

    @Bean("secondBean")
    public MyFirstClass mySecondClass() {
        return new MyFirstClass();
    }

}
