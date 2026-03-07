import java.util.Scanner;
public class forloop3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int lowstockitems=0;
        int criticalitems=0;
        int totalreorderquantity=0;
        for(int i=0;i<n;i++){
            String productname=sc.next();
            int currentStock=sc.nextInt();
            int minimumstock=sc.nextInt();
            String status="";
            int recorderquantity=0;
            if(currentStock>=minimumstock){
                status="Adequate";
                recorderquantity=0;
            }
            else if(currentStock<minimumstock && currentStock>=(minimumstock/2.0)){
                status="Low Stock";
                recorderquantity=(minimumstock-currentStock)+(minimumstock/2);
                lowstockitems++;
            }
            else{
                status="Critical";
                recorderquantity=(int) ((minimumstock-currentStock)+(minimumstock*1.5));
                criticalitems++;
            }
            totalreorderquantity=totalreorderquantity+recorderquantity;
            System.out.println("Product: " + productname);
            System.out.println("Current Stock: " + currentStock);
            System.out.println("Minimum Stock: " + minimumstock);
            System.out.println("Status: " + status);
            System.out.println("Reorder Quantity: " + recorderquantity);
            System.out.println();
        }
        System.out.println("Total Products: " + n);
        System.out.println("Low Stock Items: " + lowstockitems);
        System.out.println("Critical Items: " + criticalitems);
        System.out.println("Total Reorder Quantity: " + totalreorderquantity);
        sc.close();
    }
}