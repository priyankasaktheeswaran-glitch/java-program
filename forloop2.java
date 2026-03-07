import java.util.Scanner;
public class forloop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double totalScore=0;
        int highestScore=0;
        int passed=0;
        int failed=0;
        for(int i=0;i<n;i++){
          String studentName=sc.next();
          int score=sc.nextInt();  
          String grade="";
          String status="";
          if(score>=85 && score<=100){
            grade="A";
          }
          else if(score>=70 && score<=84){
            grade="B";
          }
          else if(score>=60 && score<=69){
            grade="C";
          }
          else if(score>=50 && score<=59){
            grade="D";
          }
          else{
            grade="F";
          }
          if(score>=60){
            status="Pass";
            passed++;
          }
          else{
            status="Fail";
            failed++;
          }
          totalScore=totalScore+score;
          if(score>highestScore){
            highestScore=score;
          }
          System.out.println("Student:"+studentName);
          System.out.println("Score:"+score);
          System.out.println("Letter Grade:"+grade);
          System.out.println("Status:"+status);
          System.out.println();
        }
        double average=totalScore/n;
        System.out.println("Total Students:"+n);
        System.out.printf("Class Average:%.2f%n",average);
        System.out.println("Highest Score:"+highestScore);
        System.out.println("Students passed:"+passed);
        System.out.println("Students Failed:"+failed);
        sc.close();
    }
}

        