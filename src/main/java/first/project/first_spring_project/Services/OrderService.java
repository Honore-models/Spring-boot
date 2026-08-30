package first.project.first_spring_project.Services;

public class OrderService {

    public void placeOrder() {

        var stripePayment = new StripePamentService();
        stripePayment.processPayment(1000);

    }

}
