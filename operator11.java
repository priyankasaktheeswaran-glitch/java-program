import java.util.Scanner;
public class operator11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int baseBoxes=sc.nextInt();
        int levels=sc.nextInt();
        int capacity=baseBoxes<<levels;
        System.out.println("total capacity="+capacity);
    }
}
