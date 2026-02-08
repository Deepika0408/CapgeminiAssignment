package capgemini;

interface Discount {

    void calculateDiscount(double amount);
    void validateCoupon(boolean coupon);
    void applyFinalPrice();
}
class RegularCustomer implements Discount {

    double finalAmount;

    public void calculateDiscount(double amount) {
        finalAmount = amount - (amount * 0.05); 
        System.out.println("Regular discount applied");
    }

    public void validateCoupon(boolean coupon) {
        if (coupon) {
            finalAmount -= 200;
            System.out.println("Coupon discount applied");
        }
    }

    public void applyFinalPrice() {
        System.out.println("Final payable amount: " + finalAmount);
    }
}
class PremiumCustomer implements Discount {

    double finalAmount;

    public void calculateDiscount(double amount) {
        finalAmount = amount - (amount * 0.20); 
        System.out.println("Premium discount applied");
    }

    public void validateCoupon(boolean coupon) {
        if (coupon) {
            finalAmount -= 500;
            System.out.println("Additional coupon discount applied");
        }
    }

    public void applyFinalPrice() {
        System.out.println("Final payable amount: " + finalAmount);
    }
}
class CorporateCustomer implements Discount {

    double finalAmount;

    public void calculateDiscount(double amount) {
        finalAmount = amount - (amount * 0.30); 
        System.out.println("Corporate discount applied");
    }

    public void validateCoupon(boolean coupon) {
        System.out.println("Coupons not applicable");
    }

    public void applyFinalPrice() {
        System.out.println("Final payable amount: " + finalAmount);
    }
}

public class EcommerceApp {
    public static void main(String[] args) {

        Discount customer; 

        customer = new PremiumCustomer(); 
        customer.calculateDiscount(10000);
        customer.validateCoupon(true);
        customer.applyFinalPrice();
    }
}

