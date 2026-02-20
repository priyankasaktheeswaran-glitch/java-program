import java.util.Scanner;
public class operator10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        int voltage=sc.nextInt();
        if(units>500 || voltage==1){
            System.out.println("Alert");
        }
        else{
            System.err.println("Normal");
        }
    }
}