import java.util.Scanner;
public class operator8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        int idProof=sc.nextInt();
        if(age>=18 && idProof==1){
            System.out.println("Allowed");
        }
        else{
            System.out.println("Denied");
        }
    }
}