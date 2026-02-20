import java.util.Scanner;
public class operator15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int signalValue=sc.nextInt();
        int toggleMask=sc.nextInt();
        int signal=signalValue^toggleMask;
        System.out.println("Toggled Signal="+signal);
    }
}
