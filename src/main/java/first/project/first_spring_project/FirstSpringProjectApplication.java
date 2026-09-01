package first.project.first_spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.core.env.Environment;
// import first.project.first_spring_project.learningClasses.FirstService;
// import first.project.first_spring_project.learningClasses.MyFirstClass;
// import first.project.first_spring_project.Services.OrderService;
// import first.project.first_spring_project.Services.PaypalService;
// import first.project.first_spring_project.Services.StripePamentService;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstSpringProjectApplication.class, args);

		// var ctx = SpringApplication.run(FirstSpringProjectApplication.class, args);
		// MyFirstClass myFirstClass = ctx.getBean("firstBean", MyFirstClass.class);
		// System.out.println(myFirstClass.sayHero());
		// FirstService firstService = ctx.getBean(FirstService.class);
		// firstService.sayHero();
		// Environment env = ctx.getBean(Environment.class);
		// System.out.println(env.getProperty("os.name"));
		// System.out.println(env.getProperty("my.custom.property"));
		// System.out.println(firstService.getjavaVersion());
		// System.out.println(firstService.getOsName());
		// OrderService orderService = new OrderService(new StripePamentService());
		// orderService.placeOrder();
		// OrderService orderService2 = new OrderService(new PaypalService());
		// orderService2.placeOrder();
	}

}