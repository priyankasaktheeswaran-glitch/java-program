import java.util.Scanner;
public class condition1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int performanceRating=sc.nextInt();
        int yearsOfService=sc.nextInt();
        sc.nextLine();
        String departmentType = sc.nextLine();
        double baseSalary = sc.nextDouble();
        double bonusPercentage = 0.0;
        String status="NotEligible";
        if(performanceRating >= 3 ){
            status="Eligible";
        if(departmentType.equalsIgnoreCase("Critical")){
            if(performanceRating==5 && yearsOfService>=5){
                bonusPercentage=25.0;
            }
            else if(performanceRating==4 && yearsOfService>=10){
                bonusPercentage=22.0;
            }
            else if(performanceRating==4){
                bonusPercentage=15.0;
            }
            else if(performanceRating==3){
                bonusPercentage=10.0;
            }
        }
        else if (departmentType.equalsIgnoreCase("Non-Critical")) {
            if (performanceRating == 5) {
                bonusPercentage = 18.0;
            } 
            else if (performanceRating == 4) {
                bonusPercentage = 12.0;
            }
            else if (performanceRating == 3) {
               bonusPercentage = 8.0;
            }
        }
    }
    double bonusAmount=baseSalary*(bonusPercentage/100);
    System.out.println("Performance Rating: " + performanceRating);        
    System.out.println("Years of Service: " + yearsOfService);
    System.out.println("Department: " + departmentType);
    System.out.println("Bonus Percentage: " + (int)bonusPercentage + "%");        
    System.out.println("Bonus Amount: $" + bonusAmount);
    System.out.println("Status: " + status);
    sc.close();
    }
}