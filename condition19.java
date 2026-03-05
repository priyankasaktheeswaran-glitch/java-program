import java.util.Scanner;
public class condition19{
    public static void main(String[]args){
        Scanner  sc = new Scanner(System.in);
        String movieFormat=sc.nextLine();
        String showTime=sc.nextLine();
        String seatCategory=sc.nextLine();
        String customerType=sc.nextLine();
        double baseTicketPrice=12.0;
        double formatSurcharge=0.0;
        double seatUpgradeFee=0.0;
        int timeBasedAdjustment=0;
        double customerDiscount=0;
        String concessionVoucher="No";
        String pricingCategory="";
        if(movieFormat.equalsIgnoreCase("2D")){
            formatSurcharge=0.0;
        }
        else if(movieFormat.equalsIgnoreCase("3D")){
            formatSurcharge=5.0;
        }
        else if(movieFormat.equalsIgnoreCase("IMAX")){
            formatSurcharge=8.0;
        }
        else if(movieFormat.equalsIgnoreCase("4DX")){
            formatSurcharge=10.0;
        }
        if(seatCategory.equalsIgnoreCase("Standard")){
            seatUpgradeFee=0.0;
        }
        else if(seatCategory.equalsIgnoreCase("Premium")){
            seatUpgradeFee=4.0;
        }
        else if(seatCategory.equalsIgnoreCase("Recliner")){
            seatUpgradeFee=7.0;
        }
        if(showTime.equalsIgnoreCase("Matinee")){
            timeBasedAdjustment=-30;
        }
        else if(showTime.equalsIgnoreCase("Evening")){
            timeBasedAdjustment=0;
        }
        else if(showTime.equalsIgnoreCase("Prime-Time")){
            timeBasedAdjustment=+20;
        }
        else if(showTime.equalsIgnoreCase("Late-Night")){
            timeBasedAdjustment=-20;
        }
        if(customerType.equalsIgnoreCase("Adult")){
            customerDiscount=0;
        }
        else if(customerType.equalsIgnoreCase("Senior")){
            customerDiscount=25;
        }
        else if(customerType.equalsIgnoreCase("Student")){
            customerDiscount=15;
        }
        else if(customerType.equalsIgnoreCase("Child")){
            customerDiscount=30;
        }
        double baseWithSurcharges=baseTicketPrice+formatSurcharge+seatUpgradeFee;
        double adjustedPrice=baseWithSurcharges*(1+timeBasedAdjustment/100.0);
        double finalPrice=adjustedPrice*(1-customerDiscount/100.0);
        if(showTime.equalsIgnoreCase("Matinee") || !customerType.equalsIgnoreCase("Adult")){
            concessionVoucher="Yes";
        }
        else{
            concessionVoucher="No";
        }
        if (finalPrice<10.0) {
            pricingCategory="Value";
        } else if (finalPrice>=10.0 && finalPrice<=20.0) {
            pricingCategory="Standard";
        } else if (finalPrice>20.0 && finalPrice<=30.0) {
            pricingCategory="Premium";
        } else {
            pricingCategory="Luxury";
        }
        System.out.println("Movie Format:"+movieFormat);
        System.out.println("Show Time:"+showTime);
        System.out.println("Seat Category:"+seatCategory);
        System.out.println("Customer Type:"+customerType);
        System.out.println("Base Ticket Price:$"+baseTicketPrice);
        System.out.println("Format Surcharge:$"+formatSurcharge);
        System.out.println("Seat Upgrade Fee:$"+seatUpgradeFee);
        System.out.println("Time-Based Adjustment:"+timeBasedAdjustment+"%");
        System.out.println("Customer Discount:"+customerDiscount+"%");
        System.out.println("Final Ticket Price:$"+finalPrice);
        System.out.println("Concession Voucher:"+concessionVoucher);
        System.out.println("Pricing Category:"+pricingCategory);
        sc.close();
    }
}