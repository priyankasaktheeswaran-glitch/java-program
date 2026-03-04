import java.util.Scanner;
public class condition15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int userCount=sc.nextInt();
        sc.nextLine();
        String licenseType=sc.nextLine();
        String supportLevel=sc.nextLine();
        int year=sc.nextInt();
        double basePricePerUser=0.0;
        double volumeDiscount=0.0;
        double supportFee=0.0;
        double multiYear=0.0;
        String pricingTier="";
        if(licenseType.equalsIgnoreCase("Standard")){
            basePricePerUser=60.0;
        }
        else if(licenseType.equalsIgnoreCase("Professional")){
            basePricePerUser=120.0;
        }
        else if(licenseType.equalsIgnoreCase("Enterprise")){
            basePricePerUser=200.0;
        }
        if (userCount >= 1 && userCount <= 50) {
            volumeDiscount = 0;
        }
        else if(userCount>=51 && userCount<=200){
            volumeDiscount=15;
        }
        else if(userCount>=201 && userCount<=500){
            volumeDiscount=20;
        }
        else if(userCount>=501 && userCount<=1000){
            volumeDiscount=25;
        }
        else{
            volumeDiscount=35;
        }
        if(supportLevel.equalsIgnoreCase("Basic")){
            supportFee=10.0;
        }
        else if(supportLevel.equalsIgnoreCase("Priority")){
            supportFee=30.0;
        }
        else if(supportLevel.equalsIgnoreCase("Premium")){
            supportFee=80.0;
        }

        if(year==2){
            multiYear=5;
        }
        else if(year==3){
            multiYear=10;
        }
        else if(year==5){
            multiYear=20;
        }
        else{
            multiYear=0;
        }
        double discountedBase=basePricePerUser*(1-volumeDiscount/100.0);
        double annualPerUser=(discountedBase+supportFee)*(1-multiYear/100.0);
        double totalAnnual=annualPerUser*userCount;
        double contractValue=year*totalAnnual;
        if(userCount<200){
            pricingTier="Small Business";
        }
        else if(userCount>=200 && userCount<=1000){
            pricingTier="Mid-Market";
        }
        else if(userCount>=1000){
            pricingTier="Enterprise";
        }

        System.out.println("User Count:"+userCount);
        System.out.println("License Type:"+licenseType);
        System.out.println("Support Level:"+supportLevel);
        System.out.println("Contract Duration:"+year+"year");
        System.out.println("Base Price Per User:$"+basePricePerUser);
        System.out.println("Volume Discount:"+volumeDiscount+"%");
        System.out.println("Support Fee Per User:$"+supportFee);
        System.out.println("Multi-Year Discount:"+multiYear+"%");
        System.out.println("Annual Cost Per User:$"+annualPerUser);
        System.out.println("Total Annual Cost:$"+totalAnnual);
        System.out.println("Total Contract Value:$"+contractValue);
        System.out.println("Pricing Tier:"+pricingTier);
        sc.close();
    }
}


