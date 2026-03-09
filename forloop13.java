import java.util.Scanner;
public class forloop13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int eligibledonors=0;
        int rejecteddonors=0;
        for(int i=0;i<n;i++){
            String donorName=sc.next();
            int age=sc.nextInt();
            double weight=sc.nextDouble();
            double hemoglobin=sc.nextDouble();
            String status="Eligible";
            String reason="";
           if (age<18||age>65) {
                status = "Not Eligible";
                reason = "Age above 65 years";
            } 
            else if (weight<50.0) {
                status = "Not Eligible";
                reason = "Weight below 50";
            } 
            else if (hemoglobin<12.5) {
                status = "Not Eligible";
                reason = "Hemoglobin below 12.5";
            }
            if (status.equals("Eligible")) {
                eligibledonors++;
            } else {
                rejecteddonors++;
            }
            
            System.out.println("Donor:"+donorName);
            System.out.println("Age:"+age+" years");
            System.out.println("Weight:"+weight+" kg");
            System.out.println("Hemoglobin:"+hemoglobin+" g/dL");
            System.out.println("Status:"+status);
            if(status.equals("Not Eligible")){
                System.out.println("Reason:"+reason);
            }
            System.out.println();
        }
        double eligiblerate=(eligibledonors*100.0)/n;
        System.out.println("Total Donors:"+n);
        System.out.println("Eligible Donors:"+eligibledonors);
        System.out.println("Rejected Donors:"+rejecteddonors);
        System.out.println("Eligibility Rate:"+eligiblerate+"%");
        sc.close();
    }
}
