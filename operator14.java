import java.util.Scanner;
public class operator14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int permissionA=sc.nextInt();
        int permissionB=sc.nextInt();
        int merge=permissionA | permissionB;
        System.out.println("merge permission code= " +merge);
    }
}
