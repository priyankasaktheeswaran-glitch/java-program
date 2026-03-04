import java.util.Scanner;
public class condition12{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        sc.nextLine();
        String vechicleType=sc.nextLine();
        String drivingRecord=sc.nextLine();
        String coverageLevel=sc.nextLine();
        double basePremium=0.0;
        double ageFactor=0.0;
        double vechicleRisk=0.0;
        double recordAdjustment=0.0;
        String riskCategory="";
        if(coverageLevel.equalsIgnoreCase("Basic")){
            basePremium=500.0;
        }
        else if(coverageLevel.equalsIgnoreCase("Standard")){
            basePremium=800.0;
        }
        else if(coverageLevel.equalsIgnoreCase("Comprehensive")){
            basePremium=1500.0;
        }
        if(age>=16 && age<=21){
            ageFactor=1.8;
        }
        else if(age>=22 && age<=25){
            ageFactor=1.5;
        }
        else if(age>=26 && age<=40){
            ageFactor=1.0;
        }
        else if(age>=41 && age<=60){
            ageFactor=0.9;
        }
        else{
            ageFactor=1.1;
        }
        if(vechicleType.equalsIgnoreCase("Sedan")){
            vechicleRisk=1.0;
        }
        else if(vechicleType.equalsIgnoreCase("SUV")){
            vechicleRisk=1.2;
        }
        else if(vechicleType.equalsIgnoreCase("Sports")){
            vechicleRisk=1.5;
        }
        else if(vechicleType.equalsIgnoreCase("Truck")){
            vechicleRisk=1.1;
        }
        else{
            vechicleRisk=0.0;
        }
        if(drivingRecord.equalsIgnoreCase("Clean")){
            recordAdjustment=-10;
        }
        else if(drivingRecord.equalsIgnoreCase("Minor-Violations")){
            recordAdjustment=+25;
        }
        else if(drivingRecord.equalsIgnoreCase("Major-Violations")){
            recordAdjustment=+50;
        }
        else{
            recordAdjustment=0;
        }
        double adjustedPremium=basePremium*ageFactor*vechicleRisk;
        double annualPremium=adjustedPremium*(1+recordAdjustment/100.0);
        double monthlyPremium=annualPremium/12.0;
        double combinedFactor = ageFactor * vechicleRisk;
        if (drivingRecord.equalsIgnoreCase("Major-Violations") || combinedFactor > 2.0) {
            riskCategory = "Very High";
        } 
        else if (drivingRecord.equalsIgnoreCase("Minor-Violations") || combinedFactor > 1.5) {
            riskCategory = "High";
        } 
        else if (combinedFactor >= 1.2) {
            riskCategory = "Medium";
        } 
        else {
            riskCategory = "Low";
        }
        System.out.println("Driver Age:"+age);
        System.out.println("Vehicle Type:"+vechicleType);
        System.out.println("Driving Record:"+drivingRecord);
        System.out.println("Coverage Level:"+coverageLevel);
        System.out.println("Base Premium:$"+basePremium);
        System.out.println("Age Factor:"+ageFactor+"x");
        System.out.println("Vehicle Risk Factor:"+vechicleRisk+"x");
        System.out.println("Record Adjustment:"+(int)recordAdjustment+"%");
        System.out.println("Monthly Premium:$"+(double)Math.round(monthlyPremium*100)/100);
        System.out.println("Annual Premium:$"+(double)Math.round(annualPremium*100)/100);
        System.out.println("Risk Category:"+riskCategory);
        sc.close();
    }
}