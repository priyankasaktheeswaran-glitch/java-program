import java.util.Scanner;
public class basic18{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int registration=sc.nextInt();
            int sponsorship=sc.nextInt();
            int stall=sc.nextInt();
            int stage=sc.nextInt();
            int celebrity=sc.nextInt();
            int marketing=sc.nextInt();
            int fund=registration+sponsorship+stall-stage-celebrity-marketing;
            System.out.println("Remaining Fund  = " + fund);
    }
}