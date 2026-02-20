import java.util.Scanner;
public class operator3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int workingHours=sc.nextInt();
        int attendencePercentage=sc.nextInt();
        if(workingHours>=40 && attendencePercentage>=90){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
