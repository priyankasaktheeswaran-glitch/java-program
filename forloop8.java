import java.util.Scanner;
public class forloop8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int totalQty=0;
        double originalTotal=0;
        double finalTotal =0;
        double savings=0;
        for (int i=0;i<n;i++) {
            String name=sc.next();
            double price=sc.nextDouble();
            int qty=sc.nextInt();
            int discount=0;
            if (qty>=10){
                discount=20;
            }
            else if (qty>=5){
                discount=15;
            }
            else if (qty>=2){
                discount=10;
            }
            else{
                discount=0;
            }
            double subtotal=(price*qty)*(1-(discount/100.0));
            originalTotal+=(price*qty);
            finalTotal+=subtotal;
            totalQty+=qty;
            System.out.println("Product: " + name);
            System.out.println("Unit Price: $" + price);
            System.out.println("Quantity: " + qty);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Subtotal: $" + subtotal);
            System.out.println();
        }
        double totalDiscount=originalTotal-finalTotal;
        if(originalTotal>0){
            savings=(totalDiscount/originalTotal)*100;
        }
        else{
            savings=0;
        }
        System.out.println("Total Items: " + totalQty);
        System.out.printf("Original Total: $%.1f%n", originalTotal);
        System.out.printf("Total Discount: $%.2f%n", totalDiscount);
        System.out.printf("Final Total: $%.2f%n", finalTotal);
        System.out.printf("Savings: %.2f%%%n", savings);

        sc.close();
    }
}