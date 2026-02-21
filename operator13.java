import java.util.Scanner;
public class operator13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int connectionValue=sc.nextInt();
        int applianceMask=sc.nextInt();
        if((connectionValue & applianceMask)!=0){
            System.out.println("Active");
        }
        else{
            System.out.println("Inactive");
        }
    }
}
