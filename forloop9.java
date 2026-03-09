import java.util.Scanner;
public class forloop9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int totalduration=0;
        int totalcalories=0;
        double averagecalories=0;
        String fitnesslevel="";

        for(int i=0;i<n;i++){
            String exerciseType=sc.next();
            int durationMinutes=sc.nextInt();
            int calories=0;
            String intensity="";
            if(exerciseType.equalsIgnoreCase("Running")){
                calories=10*durationMinutes;
                intensity="High";
            }
            else if(exerciseType.equalsIgnoreCase("Swimming")){
                calories=12*durationMinutes;
                intensity="High";
            }
            else if(exerciseType.equalsIgnoreCase("Cycling")){
                calories=8*durationMinutes;
                intensity="Moderate";
            }
            else if(exerciseType.equalsIgnoreCase("Gym")){
                calories=7*durationMinutes;
                intensity="Moderate";
            }
            else if(exerciseType.equalsIgnoreCase("Walking")){
                calories=4*durationMinutes;
                intensity="Low";
            }
            totalduration=totalduration+durationMinutes;
            totalcalories=totalcalories+calories;
            if(totalcalories>=1000){
                fitnesslevel="Advanced";
            }
            else if(totalcalories>=300 && totalcalories<=1000){
                fitnesslevel="Intermediate";
            }
            else{
                fitnesslevel="Beginner";
            }

            System.out.println("Session:"+exerciseType);
            System.out.println("Duration:"+durationMinutes+" Minutes");
            System.out.println("Calories Burned:"+calories);
            System.out.println("Intensity:"+intensity);
            System.out.println();
        }
        averagecalories=totalcalories/n;
        System.out.println("Totalworkouts:"+n);
        System.out.println("Total Duration:"+totalduration);
        System.out.println("total calories:"+totalcalories);
        System.out.println("average calories per session:"+averagecalories);
        System.out.println("fitness level:"+fitnesslevel);
        sc.close();
    }
}
