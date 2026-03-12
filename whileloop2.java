import java.util.Scanner;
public class whileloop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int count=0;
        while(true){
                System.out.println("Enter number(0 to stop):");
                int number=sc.nextInt();
            if(number==0){
                break;
            }
            sum=sum+number;
            count++;
        }
        System.out.println("Total sum:"+sum);
        System.out.println("Count:"+count);
        sc.close();
    }
}
           