import java.util.Scanner;
public class whileloop10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int firstnum=0;
        int secondnum=1;
        int i=1;
        System.out.println("Fibonacci sequence (" + number + " terms):");
        while(i<=number){
            System.out.print(firstnum + " ");
            int nextnum=firstnum+secondnum;
            firstnum=secondnum;
            secondnum=nextnum;
            i++;
        }
        sc.close();
    }
}
