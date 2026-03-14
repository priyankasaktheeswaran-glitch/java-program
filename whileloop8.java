import java.util.Scanner;
public class whileloop8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number:");
        int num=sc.nextInt();
        int digit=0;
        int sum=0;
        int temp=num;
        while(temp>0){
            digit=temp%10;
            sum=sum+digit;
            temp/=10;
        }
        System.out.println("Sum of digits:"+sum);
        sc.close();   
    }
}
