package first.project.first_spring_project.Services;

public class OrderService {

    public PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(1000);
    }
}
