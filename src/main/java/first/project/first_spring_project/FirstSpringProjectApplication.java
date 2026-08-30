package first.project.first_spring_project;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import first.project.first_spring_project.Services.OrderService;
import first.project.first_spring_project.Services.StripePamentService;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		// SpringApplication.run(FirstSpringProjectApplication.class, args);
		OrderService orderService = new OrderService(new StripePamentService());
		orderService.placeOrder();
	}

}