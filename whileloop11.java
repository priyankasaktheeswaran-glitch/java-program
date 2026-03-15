import java.util.Scanner;
public class whileloop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int gcd=sc.nextInt();
        int temp=0;
        while(gcd!=0){
            temp=gcd;
            gcd=num%gcd;
            num=temp;
        }
        System.out.println(+num);
        sc.close();
    }
}
