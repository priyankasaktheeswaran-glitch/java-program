import java.util.Scanner;
public class condition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int creditScore = sc.nextInt();
        double annualIncome = sc.nextDouble();
        double dtiRatio = sc.nextDouble();
        sc.nextLine(); 
        String loanType = sc.nextLine();
        String decision = "Rejected";
        double maxLoanAmount = 0.0;
        if (creditScore >= 600 && dtiRatio <= 50.0) {
            if (creditScore >= 750) {
                if (dtiRatio <= 30.0) {
                    decision = "Approved";
                    if (loanType.equals("Home")) maxLoanAmount = annualIncome * 4;
                    else if (loanType.equals("Business")) maxLoanAmount = annualIncome * 3;
                    else if (loanType.equals("Personal")) maxLoanAmount = annualIncome * 1;
                } else if (dtiRatio <= 40.0) {
                    if (loanType.equals("Business")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 3;
                    } else {
                        decision = "Needs Review";
                        if (loanType.equals("Home")) maxLoanAmount = annualIncome * 3;
                        else if (loanType.equals("Personal")) maxLoanAmount = annualIncome * 0.5;
                    }
                }
            } else if (creditScore >= 700) {
                if (dtiRatio <= 40.0) {
                    if (loanType.equals("Business")) {
                        decision = "Approved";
                        maxLoanAmount = annualIncome * 3;
                    } else {
                        decision = "Needs Review";
                        if (loanType.equals("Home")) maxLoanAmount = annualIncome * 3;
                        else if (loanType.equals("Personal")) maxLoanAmount = annualIncome * 0.5;
                    }
                }
            } else if (creditScore >= 650) {
                if (dtiRatio <= 40.0) {
                    decision = "Needs Review";
                    if (loanType.equals("Home")) maxLoanAmount = annualIncome * 3;
                    else if (loanType.equals("Personal")) maxLoanAmount = annualIncome * 0.5;
                    else if (loanType.equals("Business")) maxLoanAmount = annualIncome * 2;
                }
            }
        }
        System.out.println("Credit Score: " + creditScore);
        System.out.println("Annual Income: $" + annualIncome);
        System.out.println("Debt-to-Income Ratio: " + dtiRatio + "%");
        System.out.println("Loan Type: " + loanType);
        System.out.println("Decision: " + decision);
        System.out.println("Maximum Loan Amount: $" + maxLoanAmount);

        sc.close();
    }
}
