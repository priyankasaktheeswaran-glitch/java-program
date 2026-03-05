import java.util.Scanner;
public class condition16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String roomCategory=sc.nextLine();
        String season=sc.nextLine();
        int nightsBooked=sc.nextInt();
        sc.nextLine();
        String loyaltyTier=sc.nextLine();
        double baseRatePerNight=0.0;
        double seasonalMultiplier=1.0;
        double extendedStayDiscount=0.0;
        double loyaltyDiscount=0.0;
        String complimentaryUpgrades="None";
        if(roomCategory.equalsIgnoreCase("Standard")){
            baseRatePerNight=150.0;
        }
        else if(roomCategory.equalsIgnoreCase("Deluxe")){
            baseRatePerNight=300.0;
        }
        else if(roomCategory.equalsIgnoreCase("Suite")){
            baseRatePerNight=500.0;
        }
        else if(roomCategory.equalsIgnoreCase("Presidential")){
            baseRatePerNight=1000.0;
        }
        if(season.equalsIgnoreCase("Off-Peak")){
            seasonalMultiplier=0.7;
        }
        else if(season.equalsIgnoreCase("Regular")){
            seasonalMultiplier=1.0;
        }
        else if(season.equalsIgnoreCase("Peak")){
            seasonalMultiplier=1.5;
        }
        else if(season.equalsIgnoreCase("Holiday")){
            seasonalMultiplier=2.0;
        }
        if(nightsBooked>=15){
            extendedStayDiscount=20;
        }
        else if(nightsBooked>=8){
            extendedStayDiscount=10;
        }
        else if(nightsBooked>=5){
            extendedStayDiscount=5;
        }
        else{
            extendedStayDiscount=0;
        }
        if(loyaltyTier.equalsIgnoreCase("Member")){
            loyaltyDiscount=10;
            complimentaryUpgrades="Free breakfast";
        }
        else if(loyaltyTier.equalsIgnoreCase("Gold")){
            loyaltyDiscount=15;
            complimentaryUpgrades="Free breakfast and spa access";
        }
        else if(loyaltyTier.equalsIgnoreCase("Platinum")){
            loyaltyDiscount=20;
            complimentaryUpgrades="Concierge service,airport transfer,and fine dining";
        }
        double seasonalRate=baseRatePerNight*seasonalMultiplier;
        double discountRate=seasonalRate*(1-extendedStayDiscount/100.0)*(1-loyaltyDiscount/100.0);
        double totalCost=discountRate*nightsBooked;

        System.out.println("Room Category:"+roomCategory);
        System.out.println("Season:"+season);
        System.out.println("Nights Booked:"+nightsBooked);
        System.out.println("Loyalty Tier:"+loyaltyTier);
        System.out.println("Base Rate Per Night:$"+baseRatePerNight);
        System.out.println("Seasonal Multiplier:"+seasonalMultiplier+"x");
        System.out.println("Extended Stay Discount:"+extendedStayDiscount+"%");
        System.out.println("Loyalty Discount:"+loyaltyDiscount+"%");
        System.out.println("Nightly Rate:$"+discountRate);
        System.out.println("Total Booking Cost:$"+totalCost);
        System.out.println("Complimentary Upgrades:"+complimentaryUpgrades);
        sc.close();
    }
}