package OnlineRetail;

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {

        DeliveredOrder order = new DeliveredOrder(
                101,
                "24-06-2026",
                "TRK12345",
                "26-06-2026"
        );

        order.displayDetails();
    }
}