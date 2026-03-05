import java.util.Scanner;
public class condition18{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double packageWeight=sc.nextDouble();
        sc.nextLine();
        String destinationZone=sc.nextLine();
        String shippingSpeed=sc.nextLine();
        String packageSize=sc.nextLine();
        double baseShippingRate=0.0;
        double weightSurcharge=packageWeight*1.0;
        double zoneMultiplier=1.0;
        double sizeSurcharge=0.0;
        int deliveryDays=0;
        String serviceLevel="";
        if(shippingSpeed.equalsIgnoreCase("Economy")){
            baseShippingRate=5.0;
        }
        else if(shippingSpeed.equalsIgnoreCase("Standard")){
            baseShippingRate=10.0;
        }
        else if(shippingSpeed.equalsIgnoreCase("Express")){
            baseShippingRate=25.0;
        }
        else if(shippingSpeed.equalsIgnoreCase("Overnight")){
            baseShippingRate=50.0;
        }
        if(destinationZone.equalsIgnoreCase("Local")){
            zoneMultiplier=1.0;
        }
        else if(destinationZone.equalsIgnoreCase("Regional")){
            zoneMultiplier=1.2;
        }
        else if(destinationZone.equalsIgnoreCase("National")){
            zoneMultiplier=1.5;
        }
        else if(destinationZone.equalsIgnoreCase("International")){
            zoneMultiplier=3.0;
        }
        if(packageSize.equalsIgnoreCase("Oversized")){
            sizeSurcharge=30.0;
        }
        else if(packageSize.equalsIgnoreCase("Large")){
            sizeSurcharge=15.0;
        }
        else if(packageSize.equalsIgnoreCase("Medium")){
            sizeSurcharge=5.0;
        }
        else if(packageSize.equalsIgnoreCase("Small")){
            sizeSurcharge=0;
        }
        double baseCost=(baseShippingRate+weightSurcharge)*zoneMultiplier;
        double totalCost=baseCost+sizeSurcharge;
        if(shippingSpeed.equalsIgnoreCase("Economy")){
            if(destinationZone.equalsIgnoreCase("Local")){
                deliveryDays=7;
            }
            else if(destinationZone.equalsIgnoreCase("Regional")){
                deliveryDays=7;
            }
            else if (destinationZone.equalsIgnoreCase("National")){ 
                deliveryDays = 10;
            }
            else if (destinationZone.equalsIgnoreCase("International")){
                deliveryDays = 21;
            }
        }
        else if(shippingSpeed.equalsIgnoreCase("Standard")){
            if(destinationZone.equalsIgnoreCase("Local")){
                deliveryDays=3;
            }
            else if(destinationZone.equalsIgnoreCase("Regional")){
                deliveryDays=5;
            }
            else if (destinationZone.equalsIgnoreCase("National")){ 
                deliveryDays=7;
            }
            else if (destinationZone.equalsIgnoreCase("International")){
                deliveryDays=14;
            }
        }
        else if(shippingSpeed.equalsIgnoreCase("Express")){
            if(destinationZone.equalsIgnoreCase("Local")){
                deliveryDays=1;
            }
            else if(destinationZone.equalsIgnoreCase("Regional")){
                deliveryDays=2;
            }
            else if (destinationZone.equalsIgnoreCase("National")){ 
                deliveryDays=3;
            }
            else if (destinationZone.equalsIgnoreCase("International")){
                deliveryDays=5;
            }
        }
        else{
            deliveryDays=1;
        }
        if (totalCost < 20) {
            serviceLevel = "Basic";
        }
        else if (totalCost <= 50) {
            serviceLevel = "Standard";
        }
        else if (totalCost <= 100) {
        serviceLevel = "Premium";
        } 
        else {
        serviceLevel = "Elite";
        }
        System.out.println("Package Weight: " + packageWeight + "kg");
        System.out.println("Destination Zone: " + destinationZone);
        System.out.println("Shipping Speed: " + shippingSpeed);
        System.out.println("Package Size: " + packageSize);
        System.out.printf("Base Shipping Rate: $%.1f\n", baseShippingRate);
        System.out.printf("Weight Surcharge: $%.1f\n", weightSurcharge);
        System.out.printf("Total Shipping Cost: $%.1f\n", totalCost);
        System.out.println("Estimated Delivery: " + deliveryDays + " days");
        System.out.println("Service Level: " + serviceLevel);
        
        sc.close();
    }
}
        
