import java.util.Scanner;
public class condition8{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String locationTier=sc.nextLine();
        int squareFootage=sc.nextInt();
        int propertyAge=sc.nextInt();
        int amenityScore=sc.nextInt();
        double basePricePerSqFt = 0;
        double adjustment = 0;
        double amenityBonusRate = 0;
        String marketCategory = "Stable";
        if(locationTier.equalsIgnoreCase("prime")){
            basePricePerSqFt=400.0;
        }
        else if(locationTier.equalsIgnoreCase("urban")){
            basePricePerSqFt=300.0;
        }
        else if(locationTier.equalsIgnoreCase("suburban")){
            basePricePerSqFt=180.0;
        }
        else if(locationTier.equalsIgnoreCase("rural")){
            basePricePerSqFt=100.0;
        }
        if(propertyAge>=0 && propertyAge<=5){
            adjustment=0;
        }
        else if(propertyAge<=15){
            adjustment=-5;
            if(locationTier.equalsIgnoreCase("prime")){
                adjustment=-10;
            }
        }
        else if(propertyAge<=30){
            adjustment=-15;
            if(locationTier.equalsIgnoreCase("prime") || locationTier.equals("urban")){
                adjustment=-20;
            }
        }
        else{
            adjustment=-25;
            if(locationTier.equalsIgnoreCase("prime")){
                adjustment=-35;
            }
        }
        if(amenityScore>=80){
            amenityBonusRate=0.10;
        }
        else if(amenityScore>=60){
            amenityBonusRate=0.05;
        }
        else if(amenityScore>=40){
            amenityBonusRate=0.02;
        }
        else{
            amenityBonusRate=0.00;
        }
        double baseValue=squareFootage*basePricePerSqFt;
        double adjustedValue=baseValue*(1+adjustment/100.0);
        double amenityBonusAmount = adjustedValue * amenityBonusRate;
        double finalValue=adjustedValue+amenityBonusAmount;
        if (propertyAge > 30 || locationTier.equalsIgnoreCase("Rural")) {
            marketCategory = "Slow";
        } 
        else if ((locationTier.equalsIgnoreCase("Prime") || locationTier.equalsIgnoreCase("Urban")) && propertyAge <= 15) {
            marketCategory = "Hot";
        } 
        else if (locationTier.equalsIgnoreCase("Suburban")) {
            marketCategory = "Stable";
        }
        System.out.println("Location Tier:"+locationTier);
        System.out.println("Square Footage:"+squareFootage+"sq ft");
        System.out.println("Property Age:"+propertyAge+"years");
        System.out.println("Amenity Score:"+amenityScore);
        System.out.println("Base Price Per Sq Ft:$"+basePricePerSqFt);
        System.out.println("Age Adjustment:"+(int)adjustment+"%");
        System.out.println("Amenity Bonus Rate:$"+amenityBonusAmount);
        System.out.println("Estimated Property value :$"+finalValue);
        System.out.println("Market Category:"+marketCategory);
    }
}
