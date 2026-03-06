import java.util.Scanner;

public class condition25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dataGB = sc.nextDouble();
        int callMinutes = sc.nextInt();
        sc.nextLine();
        String internationalUsage = sc.nextLine();
        String deviceType = sc.nextLine();

        String recommendedPlan = "";
        double basePlanCost = 0.0;
        double dataOverage = 0.0;
        double callOverage = 0.0;
        double internationalFee = 0.0;
        double deviceFee = 0.0;
        double potentialSavings = 0.0;
        String planCategory = "";

        // Plan Recommendation Logic
        if (dataGB <= 3.0 && callMinutes <= 400) {
            recommendedPlan = "Basic 2GB";
            basePlanCost = 25.0;
            planCategory = "Budget";
        } else if (dataGB <= 7.0 && callMinutes <= 600) {
            recommendedPlan = "Standard 5GB";
            basePlanCost = 40.0;
            planCategory = "Standard";
            if (dataGB > 5.0) dataOverage = (dataGB - 5.0) * 5.0;
        } else if (dataGB <= 30.0 && callMinutes <= 2000) {
            recommendedPlan = "Premium Unlimited";
            basePlanCost = 70.0;
            planCategory = "Premium";
        } else {
            recommendedPlan = "Unlimited Max";
            basePlanCost = 90.0;
            planCategory = "Unlimited";
        }

        // Device Fee
        if (deviceType.equalsIgnoreCase("Smartphone") || deviceType.equalsIgnoreCase("Tablet")) {
            deviceFee = 10.0;
        } else if (deviceType.equalsIgnoreCase("Hotspot")) {
            deviceFee = 20.0;
        }

        // International Fee
        if (internationalUsage.equalsIgnoreCase("Light")) internationalFee = 5.0;
        else if (internationalUsage.equalsIgnoreCase("Moderate")) internationalFee = 15.0;
        else if (internationalUsage.equalsIgnoreCase("Heavy")) internationalFee = 30.0;

        double totalMonthlyCost = basePlanCost + dataOverage + callOverage + internationalFee + deviceFee;

        System.out.println("Data Usage: " + dataGB + " GB");
        System.out.println("Call Minutes: " + callMinutes + " minutes");
        System.out.println("International Usage: " + internationalUsage);
        System.out.println("Device Type: " + deviceType);
        System.out.println("Recommended Plan: " + recommendedPlan);
        System.out.println("Base Plan Cost: $" + basePlanCost);
        System.out.println("Data Overage: $" + dataOverage);
        System.out.println("Call Overage: $" + callOverage);
        System.out.println("International Fee: $" + internationalFee);
        System.out.println("Device Fee: $" + deviceFee);
        System.out.println("Total Monthly Cost: $" + totalMonthlyCost);
        System.out.println("Potential Savings: $" + potentialSavings);
        System.out.println("Plan Category: " + planCategory);

        sc.close();
    }
}