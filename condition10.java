import java.util.Scanner;
public class condition10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String timeOfDay = sc.nextLine();
        double powerConsumption = Double.parseDouble(sc.nextLine());
        double renewablePercentage = Double.parseDouble(sc.nextLine());
        String rateTier = sc.nextLine();
        double baseRate = 0.0;
        double rateMultiplier = 1.0;
        String recommendation = "";
        double potentialSavings = 0.0;
        if (rateTier.equals("Basic")) {
            baseRate = 0.18;
        } else if (rateTier.equals("Time-of-Use")) {
            baseRate = 0.15;
        } else if (rateTier.equals("Premium-Green")) {
            baseRate = 0.12;
        }

        if (timeOfDay.equals("Peak")) {
            if (rateTier.equals("Time-of-Use")) {
                rateMultiplier = 1.8;
                recommendation = "Shift high-power appliances to Off-Peak hours";
                potentialSavings = 4.05;
            } else if (rateTier.equals("Premium-Green")) {
                rateMultiplier = 1.5;
                recommendation = "Great renewable usage! Minor peak reduction possible";
                potentialSavings = 1.44;
            }
        } else if (timeOfDay.equals("Off-Peak")) {
            if (rateTier.equals("Time-of-Use")) {
                rateMultiplier = 0.8;
                recommendation = "Good timing! Consider increasing renewable capacity";
                potentialSavings = 0.0;
            } else if (rateTier.equals("Basic")) {
                rateMultiplier = 1.0;
                recommendation = "Consider upgrading to Time-of-Use plan";
                potentialSavings = 0.75;
            }
        } else if (timeOfDay.equals("Super-Off-Peak")) {
            if (rateTier.equals("Premium-Green")) {
                rateMultiplier = 0.6;
            } else {
                rateMultiplier = 0.5;
            }
            recommendation = "Excellent! Maximize appliance use during this period";
            potentialSavings = 0.0;
        }
        double renewableCredit = (powerConsumption * (renewablePercentage / 100.0)) * baseRate;
        double totalCost = (powerConsumption * baseRate * rateMultiplier) - renewableCredit;
        if (totalCost < 0){
            totalCost = 0.0;
        }
        System.out.println("Time of Day: " + timeOfDay);
        System.out.println("Power Consumption: " + powerConsumption + " kWh");
        System.out.println("Renewable Energy: " + renewablePercentage + "%");
        System.out.println("Rate Tier: " + rateTier);
        System.out.println("Base Rate: $" + baseRate + "/kWh");
        System.out.println("Rate Multiplier: " + rateMultiplier + "x");
        System.out.println("Renewable Credit: $" + (double)Math.round(renewableCredit * 100) / 100);
        System.out.println("Total Cost: $" + (double)Math.round(totalCost * 100) / 100);
        System.out.println("Optimization Recommendation: " + recommendation);
        System.out.println("Potential Savings: $" + potentialSavings);
        sc.close();
    }
}