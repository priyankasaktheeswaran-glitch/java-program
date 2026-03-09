import java.util.Scanner;
public class forloop10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double subtotal=0;
        int totalitems=0;
        double tax=0;
        double servicecharger=0;
        double grandtotal=0;
        for(int i=0;i<n;i++){
            String itemName=sc.next();
            double price=sc.nextDouble();
            int quantity=sc.nextInt();
        
            double rate=price*quantity;
            subtotal=subtotal+rate;
            totalitems=totalitems+quantity;

            System.out.println("Item:"+itemName);
            System.out.println("Price:$"+price+"x"+quantity);
            System.out.println("Subtotal:$"+rate);
            System.out.println();
        }
        tax=subtotal*0.08;
        servicecharger=subtotal*0.10;
        grandtotal=subtotal+tax+servicecharger;

        System.out.println("Total items:"+totalitems);
        System.out.println("Subtotal:$"+subtotal);
        System.out.println("Tax:$"+tax);
        System.out.printf("Service charge(10%%):$%.1f%n",servicecharger);
        System.out.println("Grand Total:$"+grandtotal);
        sc.close();
    }
}