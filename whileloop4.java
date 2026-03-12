import java.util.Scanner;
public class whileloop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long fact=1;
        int i=number;
        while(i>0){
            fact*=i;
            i--;  
        }
        System.out.println("Factorial of " +number+ " is: "+fact);
        sc.close();
    }
}
