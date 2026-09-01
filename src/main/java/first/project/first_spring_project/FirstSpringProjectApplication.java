package first.project.first_spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import first.project.first_spring_project.Services.FirstService;
import first.project.first_spring_project.Services.MyFirstClass;

// import first.project.first_spring_project.Services.OrderService;
// import first.project.first_spring_project.Services.PaypalService;
// import first.project.first_spring_project.Services.StripePamentService;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(FirstSpringProjectApplication.class, args);

		MyFirstClass myFirstClass = ctx.getBean("firstBean", MyFirstClass.class);
		System.out.println(myFirstClass.sayHero());

		FirstService firstService = ctx.getBean(FirstService.class);
		firstService.sayHero();

		// OrderService orderService = new OrderService(new StripePamentService());
		// orderService.placeOrder();

		// OrderService orderService2 = new OrderService(new PaypalService());
		// orderService2.placeOrder();
	}

}