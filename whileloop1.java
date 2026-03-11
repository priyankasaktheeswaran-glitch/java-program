import java.util.Scanner;
public class whileloop1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String correctpassword=sc.nextLine();
        int attemtsremaining=3;
        boolean accessgranted=false;
        while(attemtsremaining>0 && !accessgranted){
            System.out.println("Enter password:");
            String attempt=sc.nextLine();
            if(attempt==correctpassword){
                System.out.println("Access granted!");
                accessgranted=true;
            }
            else{
                attemtsremaining--;
                if(attemtsremaining>=0){
                    System.out.println("Incorrect! Attempts remaining: " + attemtsremaining);
                }
                else{
                    System.out.println("Account locked!");
                }
            }
        }
        sc.close();
    }
}