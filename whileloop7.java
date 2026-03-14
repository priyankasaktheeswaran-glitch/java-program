import java.util.Scanner;
public class whileloop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Calculator Menu:");
            System.out.println("1.Add");
            System.out.println("2.subtract");
            System.out.println("3.multiply");
            System.out.println("4.Divide");
            System.out.println("5.Exit");
            System.out.println("Choice:");
            choice=sc.nextInt();
            if(choice>=1 && choice<=4){
                System.out.println("Enter two numbers:");
                int num1=sc.nextInt();
                int num2=sc.nextInt();
                if(choice==1){
                    int add=num1+num2;
                    System.out.println("Result:"+add);
                }
                else if(choice==2){
                    int subtract=num1-num2;
                    System.out.println("Result:"+subtract);
                }
                else if(choice==3){
                    int multiply=num1*num2;
                    System.out.println("Result:"+multiply);
                }
                else if(choice==4){
                    if(num2!=0){
                        int Divide=num1/num2;
                        System.out.println("Result:"+Divide);
                    }
                }
            }
            else if(choice==5){
                System.out.println("Goodbye!");
            }
            else{
                System.out.println("Invalid");
            }
        }
        while(choice!=5);
        sc.close();
    }
}