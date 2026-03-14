import java.util.Scanner;
public class whileloop9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(true){
            if(num>=1){
                if(num%i==0){
                    System.out.println(num+" is prime");
                    break;
                }
            }
            else if(num<=1){
                System.out.println(num+ " is not a prime");
                }    
            }
        }
    }