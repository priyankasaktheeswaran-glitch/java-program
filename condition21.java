import java.util.Scanner;

public class condition21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String locationZone = sc.nextLine();
        double parkingDuration = sc.nextDouble();
        sc.nextLine();
        String vehicleType = sc.nextLine();
        String membershipStatus = sc.nextLine();
        
        double baseHourlyRate = 5.0;
        double zonePremium = 0.0;
        double vehicleSizeSurcharge = 0.0;
        double dailyCap = 0.0;
        String rateCategory = "";
        String dailyCapApplied = "No";

        if (locationZone.equalsIgnoreCase("Downtown")) {
            zonePremium = 50;
            dailyCap = 150.0;
            rateCategory = "Premium";
        } else if (locationZone.equalsIgnoreCase("Business-District")) {
            zonePremium = 30;
            dailyCap = 120.0;
            rateCategory = "Premium";
        } else if (locationZone.equalsIgnoreCase("Airport")) {
            zonePremium = 100;
            dailyCap = 180.0;
            rateCategory = "Luxury";
        } else if (locationZone.equalsIgnoreCase("Residential")) {
            zonePremium = 0;
            dailyCap = 60.0;
            rateCategory = "Standard";
        }

        if (vehicleType.equalsIgnoreCase("Motorcycle")) {
            vehicleSizeSurcharge = -2.0;
        } else if (vehicleType.equalsIgnoreCase("SUV")) {
            vehicleSizeSurcharge = 3.0;
        } else if (vehicleType.equalsIgnoreCase("Oversized")) {
            vehicleSizeSurcharge = 5.0;
        } else if (vehicleType.equalsIgnoreCase("Sedan")) {
            vehicleSizeSurcharge = 0.0;
        }

        double hourlyRate = (baseHourlyRate * (1 + zonePremium / 100.0)) + vehicleSizeSurcharge;
        double rawFee = hourlyRate * parkingDuration;

        int membershipDiscount = 0;
        if (membershipStatus.equalsIgnoreCase("Monthly")) {
            membershipDiscount = 20;
        } else if (membershipStatus.equalsIgnoreCase("Annual")) {
            membershipDiscount = 25;
        } else if (membershipStatus.equalsIgnoreCase("VIP")) {
            membershipDiscount = 30;
        }

        double feeToDiscount = rawFee;
        if (parkingDuration >= 24.0) {
            feeToDiscount = dailyCap;
            dailyCapApplied = "Yes";
        }

        double finalFee = feeToDiscount * (1 - membershipDiscount / 100.0);

        System.out.println("Location Zone: " + locationZone);
        System.out.println("Parking Duration: " + parkingDuration + " hours");
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Membership Status: " + membershipStatus);
        
        System.out.println("Base Hourly Rate: $" + String.format("%.1f", baseHourlyRate));
        System.out.println("Zone Premium: " + (int)zonePremium + "%");
        System.out.println("Vehicle Size Surcharge: $" + String.format("%.1f", vehicleSizeSurcharge));
        System.out.println("Membership Discount: " + membershipDiscount + "%");
        System.out.println("Total Parking Fee: $" + String.format("%.1f", finalFee));
        
        System.out.println("Daily Cap Applied: " + dailyCapApplied);
        System.out.println("Rate Category: " + rateCategory);

        sc.close();
    }
}