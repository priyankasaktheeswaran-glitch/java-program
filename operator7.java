import java.util.Scanner;
public class operator7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int carValue=sc.nextInt();
        int premiumMember=sc.nextInt();
        if(carValue>999 || premiumMember==1){
            System.out.println("Free Shiping");
        }
        else{
            System.out.println("Charges Applied");
        }
    }
}