import java.util.Scanner;
public class forloop11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double originaltotal=0;
        double finalTotal=0;
        String group="";

        for(int i=0;i<n;i++){
           String seatType=sc.next();
           String customerType=sc.next();
           double baseprice=0;
           int discount=0;
           if(seatType.equalsIgnoreCase("Regular")){
            baseprice=12.0;
           }
           else if(seatType.equalsIgnoreCase("Premium")){
            baseprice=18.0;
           }
           else if(seatType.equalsIgnoreCase("Recliner")){
            baseprice=25.0;
           }
           if(customerType.equalsIgnoreCase("Senior")){
                discount=25;
            }
            else if(customerType.equalsIgnoreCase("Child")){
                discount=30;
            }
            else{
                discount=0;
            }
           double finalPrice=baseprice*(1-discount/100.0);
           originaltotal=originaltotal+baseprice;
           finalTotal=finalTotal+finalPrice;
           System.out.println("Ticket:"+customerType+"-"+seatType);
           System.out.println("Base Price:$"+baseprice);
           System.out.println("Discount:"+discount+"%");
           System.out.println("Final Price:$"+finalPrice);
           System.out.println();
        }
        if(n>=5){
            finalTotal=finalTotal*0.90;
            group="Yes";
        }
        else{
            group="No";
        }
        double totaldiscount=originaltotal-finalTotal;
        System.out.println("Total tickets:"+n);
        System.out.println("original total:$"+originaltotal);
        System.out.printf("Total discount:$%.1f%n",totaldiscount);
        System.out.println("Final Total:$"+finalTotal);
        System.out.println("Group:"+group);
        sc.close();
    }
}