public class 01_DiscountCalculation {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        double discount = fee * discountPercent / 100.0;
        double discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}