import java.util.Scanner;
public class whileloop6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Balance:");
        int balance=sc.nextInt();
        int remaining=0;
        while(true){
            System.out.println("Enter withdrawal amount:");
            int withdrawalamount=sc.nextInt();
            remaining=balance-withdrawalamount;
            if(withdrawalamount<balance){
                System.out.println("Withdrawal successful! remaining balance:"+remaining);
                break;
            }
            else if(withdrawalamount>balance){
                System.out.println("Insufficient funds! Try again.");
            }
        }
        sc.close();
    }
}
    