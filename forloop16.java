import java.util.Scanner;
public class forloop16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int passcount=0;
        int failcount=0;
        double totalscore=0;
        int highestScore=0;
        for(int i=0;i<n;i++){
            String studentName=sc.next();
            int correctanswers=sc.nextInt();
            int wronganswers=sc.nextInt();
            int unattempted=sc.nextInt();
            String result="";
            int score=(correctanswers*4)-(wronganswers*3)+(unattempted*0);
            if(score>=32){
                result="Pass";
                passcount++;
            }
            else{
                result="Fail";
                failcount++;
            }
            totalscore=totalscore+score;
            highestScore=Math.max(score,highestScore);
            System.out.println("Student:"+studentName);
            System.out.println("Correct:"+correctanswers);
            System.out.println("Wrong:"+wronganswers);
            System.out.println("Unattempted:"+unattempted);
            System.out.println("Score:"+score);
            System.out.println("Result:"+result);
            System.out.println();
        }
        
        double average=totalscore/n;
        System.out.println("Total Students: " + n);
        System.out.println("Pass Count: " + passcount);
        System.out.println("Fail Count: " + failcount);
        System.out.println("Class Average: " + average);
        System.out.println("Highest Score: " + highestScore);
        sc.close();
    }
}
