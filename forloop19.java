import java.util.Scanner;
public class forloop19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int activewarranties=0;
        int expiringsoon=0;
        int expiredwarranties=0;
        for(int i=0;i<n;i++){
            String productId=sc.next();
            String productType=sc.next();
            int monthsSincePurchase=sc.nextInt();
            int warrantyperiod=0;
            int remainingmonths=0;
            String status="";
            if(productType.equalsIgnoreCase("Computer")){
                warrantyperiod=36;
            }
            else if(productType.equalsIgnoreCase("Appliance")){
                warrantyperiod=24;
            }
            else if(productType.equalsIgnoreCase("Electronics")){
                warrantyperiod=12;
            }
            remainingmonths=warrantyperiod-monthsSincePurchase;
        
            if(remainingmonths>3){
                status="Active";
                activewarranties++;
            }
            else if(remainingmonths<1){
                status="Expiring soon";
                expiringsoon++;
            }
            else{
                status="Expired";
                expiredwarranties++;
            }
            if(remainingmonths<0){
                remainingmonths=0;
            }
            System.out.println("ProductId"+productId);
            System.out.println("Type:"+productType);
            System.out.println("Warranty period:"+warrantyperiod+"months");
            System.out.println("Months used:"+monthsSincePurchase);
            System.out.println("Remaining:"+remainingmonths+"months");
            System.out.println("Status:"+status);
            System.out.println();
        }
        System.out.println("Total products:"+n);
        System.out.println("Active warranties:"+activewarranties);
        System.out.println("Expiring soon:"+expiringsoon);
        System.out.println("Expired warranties:"+expiredwarranties);
        sc.close();
    }
}
