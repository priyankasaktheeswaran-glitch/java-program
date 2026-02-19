import java.util.Scanner;
public class basic20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ads=sc.nextInt();
        int sponsor=sc.nextInt();
        int affiliate=sc.nextInt();
        int tax=sc.nextInt();
        int Production=sc.nextInt();
        int income=ads+sponsor+affiliate-tax-Production;
        System.out.println("Final Youtube Income ="+income);
    }
}
