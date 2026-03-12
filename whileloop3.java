import java.util.Scanner;
public class whileloop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempt=0;
        int secretnumber=sc.nextInt();
        while(true){
            System.out.println("Guess the number(1100):");
            int number=sc.nextInt();
            attempt++;
            if(number==secretnumber){
                System.out.println("Correct! Attempt:"+attempt);
                break;
            }
            else{
                if(number<=secretnumber){
                System.out.println("Too low!");
                }
                else{
                System.out.println("Too high!");
                }
            }
        }
        sc.close();
    }
}