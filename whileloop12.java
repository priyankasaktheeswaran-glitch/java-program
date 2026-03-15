
import java.util.Scanner;
public class whileloop12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=0;
        int rev=0;
        while(num!=0){
            temp=num%10;
            rev=rev*10+temp;
            num/=10;
        }
        System.out.println(+rev);
        sc.close();
    }
}
