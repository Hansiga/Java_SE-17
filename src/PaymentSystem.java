interface Payment {
    double calculateFee(double amount);
}

// UPI Payment
class UPI implements Payment {
    public double calculateFee(double amount) {
        return amount * 0.01;   // 1%
    }
}

// Credit Card Payment
class CreditCard implements Payment {
    public double calculateFee(double amount) {
        return amount * 0.025;  // 2.5%
    }
}

// NetBanking Payment
class NetBanking implements Payment {
    public double calculateFee(double amount) {
        return 50;   // Flat fee
    }
}

public class PaymentSystem {

    public static void main(String[] args) {

        double amount = 1000;

        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new NetBanking();

        System.out.println("UPI Fee: " + p1.calculateFee(amount));
        System.out.println("Credit Card Fee: " + p2.calculateFee(amount));
        System.out.println("NetBanking Fee: " + p3.calculateFee(amount));
    }
}