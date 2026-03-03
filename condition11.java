import java.util.Scanner;
public class condition11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orderType = sc.nextLine();
        String loyaltyStatus = sc.nextLine();
        double orderValue = Double.parseDouble(sc.nextLine());
        String timeSlot = sc.nextLine();
        int baseDiscount = 0;
        int timeAdjustment = 0;
        double serviceFeeRate = 0.0;
        String priority = "Medium";
        int prepTime = 20;
        if (loyaltyStatus.equalsIgnoreCase("Gold")) {
            baseDiscount = 15;
        } else if (loyaltyStatus.equalsIgnoreCase("Silver")) {
            baseDiscount = 10;
        } else if (loyaltyStatus.equalsIgnoreCase("Bronze")) {
            baseDiscount = 5;
        } else {
            baseDiscount = 0;
        }
        if (timeSlot.equalsIgnoreCase("Late-Night")) {
            timeAdjustment = -5;
        } else {
            timeAdjustment = 0;
        }
        if (orderType.equalsIgnoreCase("Delivery")) {
            serviceFeeRate = 0.10;
        } else if (orderType.equalsIgnoreCase("Takeout")) {
            serviceFeeRate = 0.03;
        } else {
            serviceFeeRate = 0.0;
        }
        if (timeSlot.equalsIgnoreCase("Peak")) {
            priority = "High";
            if (orderType.equalsIgnoreCase("Delivery")) {
                prepTime = (loyaltyStatus.equalsIgnoreCase("Gold")) ? 25 : 30;
            } else {
                prepTime = 25;
            }
        } else if (timeSlot.equalsIgnoreCase("Late-Night")) {
            priority = "Low";
            prepTime = 15;
        } else {
            priority = "Medium";
            prepTime = (orderValue > 100) ? 25 : 20;
        }

        int totalDiscountPercent = baseDiscount + (timeAdjustment == -5 ? 5 : 0);
        double discountedValue = orderValue * (1 - (totalDiscountPercent / 100.0));
        double serviceFee = orderValue * serviceFeeRate;
        double finalAmount = discountedValue + serviceFee;

        System.out.println("Order Type: " + orderType);
        System.out.println("Loyalty Status: " + loyaltyStatus);
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Base Discount: " + baseDiscount + "%");
        System.out.println("Time-Based Adjustment: " + timeAdjustment + "%");
        System.out.println("Service Fee: $" + (double)Math.round(serviceFee * 100) / 100);
        System.out.println("Final Amount: $" + (double)Math.round(finalAmount * 100) / 100);
        System.out.println("Kitchen Priority: " + priority);
        System.out.println("Estimated Prep Time: " + prepTime + " minutes");

        sc.close();
    }
}