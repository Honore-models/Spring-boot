package first.project.first_spring_project.learningClasses;

public class StripePamentService implements PaymentService {

    public void processPayment(int amount) {
        System.out.println("STRIPE PAYMENT SERVICE");
        System.out.println("Processing payment of amount: " + amount);
    }

}
