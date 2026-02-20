import java.util.Scanner;
public class operator4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int creditLimit=sc.nextInt();
        int purchaseAmount=sc.nextInt();
        int cardBloacked=sc.nextInt();
        if(purchaseAmount<=creditLimit && cardBloacked==0){
            System.out.println("Approved");
        }
        else{
            System.out.println("Declined");
        }
    }
}
