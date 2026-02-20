import java.util.Scanner;
public class operator1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int theoryMarks=sc.nextInt();
        int practicalMarks=sc.nextInt();
        if(theoryMarks >= 50 && practicalMarks >=50 && (theoryMarks+practicalMarks)/2 >=60 ){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }
}