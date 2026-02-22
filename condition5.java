import java.util.Scanner;

public class condition5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gpa = scanner.nextDouble();
        double familyIncome = scanner.nextDouble();
        int extracurricularScore = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String scholarshipType = scanner.nextLine();
        boolean isEligible = false;
        double awardAmount = 0.0;
        String awardCategory = "None";
        if (gpa >= 2.5) {
            if (scholarshipType.equalsIgnoreCase("Merit")) {
                if (gpa >= 3.8 && extracurricularScore >= 80) {
                    isEligible = true;
                    awardAmount = 25000.0;
                    awardCategory = "Full";
                } else if (gpa >= 3.5 && extracurricularScore >= 70) {
                    isEligible = true;
                    awardAmount = 15000.0;
                    awardCategory = "Partial";
                } else if (gpa >= 3.0 && extracurricularScore >= 60) {
                    isEligible = true;
                    awardAmount = 8000.0;
                    awardCategory = "Minimal";
                }
            } 
            else if (scholarshipType.equalsIgnoreCase("Need-Based")) {
                if (familyIncome <= 30000.0 && gpa >= 3.5) {
                    isEligible = true;
                    awardAmount = 30000.0;
                    awardCategory = "Full";
                } else if (familyIncome <= 50000.0 && gpa >= 3.0) {
                    isEligible = true;
                    awardAmount = 18000.0;
                    awardCategory = "Partial";
                } else if (familyIncome <= 70000.0 && gpa >= 2.8) {
                    isEligible = true;
                    awardAmount = 10000.0;
                    awardCategory = "Minimal";
                }
            } 
            else if (scholarshipType.equalsIgnoreCase("Sports")) {
                if (extracurricularScore >= 85 && gpa >= 3.0) {
                    isEligible = true;
                    awardAmount = 22000.0;
                    awardCategory = "Full";
                } else if (extracurricularScore >= 75 && gpa >= 2.8) {
                    isEligible = true;
                    awardAmount = 20000.0;
                    awardCategory = "Partial";
                } else if (extracurricularScore >= 65 && gpa >= 2.5) {
                    isEligible = true;
                    awardAmount = 12000.0;
                    awardCategory = "Minimal";
                }
            }
        }
        System.out.println("GPA: " + gpa);
        System.out.println("Family Income: $" + familyIncome);
        System.out.println("Extracurricular Score: " + extracurricularScore);
        System.out.println("Scholarship Type: " + scholarshipType);
        System.out.println("Eligibility: " + (isEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Award Amount: $" + awardAmount);
        System.out.println("Award Category: " + awardCategory);
        scanner.close();
    }
}