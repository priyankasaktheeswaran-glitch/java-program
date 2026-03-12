import java.util.Scanner;
public class whileloop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Original:");
        int number=sc.nextInt();
        int rev=0;
        int temp=number;
        while(temp!=0){
            int last=temp%10;
            rev=rev*10+last;
            temp/=10;
        }
        System.out.println("revesed:"+rev);
        sc.close();
    }
}
