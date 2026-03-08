import java.util.Scanner;
public class forloop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long totalUnits = 0;
        double totalRevenue = 0;
        for(int i = 0; i < n; i++) {
            String id = sc.next();
            int units = sc.nextInt();
            double bill = 0;
            String category = "";
            if(units <= 100) {
                bill = units * 0.10;
                category = "Low Usage";
            } 
            else if(units <= 200) {
                bill = units * 0.13;
                category = "Low Usage";
            } 
            else if(units <= 300) {
                bill = units * 0.16;
                category = "Medium Usage";
            } 
            else {
                bill = units * 0.20;
                category = "High Usage";
            }
            totalUnits += units;
            totalRevenue += bill;
            System.out.println("Consumer ID:"+id);
            System.out.println("Units Consumed:"+units);
            System.out.println("Bill Amount:$"+bill);
            System.out.println("Category:"+category);
            System.out.println();
        }
        System.out.println("Total Consumers:"+n);
        System.out.println("Total Units Consumed:"+totalUnits);
        System.out.println("Total Revenue:$"+totalRevenue);
        System.out.println("Average Bill:$"+(totalRevenue/n));
        sc.close();
    }
}