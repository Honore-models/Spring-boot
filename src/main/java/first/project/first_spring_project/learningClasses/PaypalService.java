package first.project.first_spring_project.learningClasses;

public class PaypalService implements PaymentService {

    @Override
    public void processPayment(int amount) {
        System.out.println("PAYPAL PAYMENT SERVICE");
        System.out.println("Processing payment of amount: " + amount);
    }

}
