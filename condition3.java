import java.util.Scanner;

public class condition3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine(); 
        String smokingStatus = sc.nextLine();
        String preExistingConditions = sc.nextLine();
        String coverageTier = sc.nextLine();
        double basePremium = 0.0;
        double surchargeRate = 0.0;
        if (age >= 18 && age <= 30) {
            if (coverageTier.equals("Basic")) 
                basePremium = 200.0;
            else if (coverageTier.equals("Standard")) 
                basePremium = 300.0;
            else if (coverageTier.equals("Premium")) 
                basePremium = 500.0;
        } else if (age >= 31 && age <= 50) {
            if (coverageTier.equals("Basic")) 
                basePremium = 250.0;
            else if (coverageTier.equals("Standard")) 
                basePremium = 350.0;
            else if (coverageTier.equals("Premium")) 
                basePremium = 600.0;
        } else if (age >= 51 && age <= 65) {
            if (coverageTier.equals("Basic")) 
                basePremium = 350.0;
            else if (coverageTier.equals("Standard")) 
                basePremium = 450.0;
            else if (coverageTier.equals("Premium")) 
                basePremium = 700.0;
        } else if (age >= 66) {
            if (coverageTier.equals("Basic")) 
                basePremium = 400.0;
            else if (coverageTier.equals("Standard")) 
                basePremium = 550.0;
            else if (coverageTier.equals("Premium")) 
                basePremium = 800.0;
        }
        if (smokingStatus.equals("Smoker") && preExistingConditions.equals("Yes")) {
            surchargeRate = 0.70;
        } else if (smokingStatus.equals("Smoker")) {
            surchargeRate = 0.40;
        } else if (preExistingConditions.equals("Yes")) {
            surchargeRate = 0.30;
        } else {
            surchargeRate = 0.00;
        }
        double riskSurcharge = basePremium * surchargeRate;
        double totalPremium = basePremium + riskSurcharge;
        System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + smokingStatus);
        System.out.println("Pre-existing Conditions: " + preExistingConditions);
        System.out.println("Coverage Tier: " + coverageTier);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Risk Surcharge: $" + riskSurcharge);
        System.out.println("Total Monthly Premium: $" + totalPremium);
        sc.close();
    }
}