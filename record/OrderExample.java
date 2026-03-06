package record;

record Customer(String name) {}

record Address(String street, String city) {}

record OrderRecord(int Id, Customer customer, Address address) {}

public class OrderExample {
    public static void main(String[] args) {
        Customer cust = new Customer("Hansi");
        Address addr = new Address("ABC Nagar", "Erode");
        OrderRecord order = new OrderRecord(1, cust, addr);

        System.out.println(order);
    }
}