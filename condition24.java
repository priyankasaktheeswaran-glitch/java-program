import java.util.Scanner;

public class condition24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distanceMiles = sc.nextDouble();
        double orderValue = sc.nextDouble();
        sc.nextLine(); 
        String timeSlot = sc.nextLine();
        String weatherCondition = sc.nextLine();

        double baseDeliveryFee = 3.0;
        double distanceSurcharge = distanceMiles * 1.0;

        double peakTimeSurcharge = 0.0;
        if (timeSlot.equalsIgnoreCase("Lunch")) {
            peakTimeSurcharge = 2.5;
        } else if (timeSlot.equalsIgnoreCase("Dinner")) {
            peakTimeSurcharge = 2.0;
        } else if (timeSlot.equalsIgnoreCase("Late-Night")) {
            peakTimeSurcharge = 1.5;
        }

        double weatherSurcharge = 0.0;
        if (weatherCondition.equalsIgnoreCase("Rain")) {
            weatherSurcharge = 2.0;
        } else if (weatherCondition.equalsIgnoreCase("Snow")) {
            weatherSurcharge = 3.0;
        } else if (weatherCondition.equalsIgnoreCase("Storm")) {
            weatherSurcharge = 5.0;
        }

        double orderValueDiscount = 0.0;
        if (orderValue >= 75.0) {
            orderValueDiscount = 5.0;
        } else if (orderValue >= 50.0) {
            orderValueDiscount = 3.0;
        } else if (orderValue >= 30.0) {
            orderValueDiscount = 2.0;
        }

        double calculatedFee = baseDeliveryFee + distanceSurcharge + peakTimeSurcharge + weatherSurcharge - orderValueDiscount;
        double finalDeliveryFee = Math.max(calculatedFee, 2.99);

        int deliveryTime = (int) (distanceMiles * 8);
        if (timeSlot.equalsIgnoreCase("Lunch") || timeSlot.equalsIgnoreCase("Dinner")) {
            deliveryTime += 10;
        }
        
        if (weatherCondition.equalsIgnoreCase("Rain")) {
            deliveryTime += 5;
        } else if (weatherCondition.equalsIgnoreCase("Snow")) {
            deliveryTime += 10;
        } else if (weatherCondition.equalsIgnoreCase("Storm")) {
            deliveryTime += 15;
        }

        String servicePriority = "Standard";
        if (orderValue > 60.0) {
            servicePriority = "Express";
        } else if (timeSlot.equalsIgnoreCase("Dinner") || timeSlot.equalsIgnoreCase("Lunch")) {
            servicePriority = "High";
        }

        System.out.println("Delivery Distance: " + distanceMiles + " miles");
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Weather Condition: " + weatherCondition);
        System.out.println("Base Delivery Fee: $" + baseDeliveryFee);
        System.out.println("Distance Surcharge: $" + distanceSurcharge);
        System.out.println("Peak Time Surcharge: $" + peakTimeSurcharge);
        System.out.println("Weather Surcharge: $" + weatherSurcharge);
        System.out.println("Order Value Discount: $" + orderValueDiscount);
        System.out.println("Final Delivery Fee: $" + finalDeliveryFee);
        System.out.println("Estimated Delivery Time: " + deliveryTime + " minutes");
        System.out.println("Service Priority: " + servicePriority);

        sc.close();
    }
}