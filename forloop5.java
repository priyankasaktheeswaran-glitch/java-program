import java.util.Scanner;
public class forloop5{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totaldaysanalyzed=0;
        double highestoccupancyrate=0;
        int peakdays=0;
        int daysatfull=0;
        for(int i=0;i<n;i++){
            int day=sc.nextInt();
            int roomsoccupied=sc.nextInt();
            int totalrooms=sc.nextInt();
            String status="";
            double occupancyrate=(roomsoccupied*100.0)/totalrooms;
            if(occupancyrate>=100){
                status="Full";
                daysatfull++;
            }
            else if(occupancyrate>=80 && occupancyrate<=99){
                status="High";
            }
            else if(occupancyrate>=60 && occupancyrate<=79){
                status="Moderate";
            }
            else{
                status="Low";
            }

            if(occupancyrate>=highestoccupancyrate){
                highestoccupancyrate=occupancyrate;
                peakdays=day;
            }
            totaldaysanalyzed=totaldaysanalyzed+occupancyrate;
            System.out.println("Day:"+day);
            System.out.println("Rooms Occupied:"+roomsoccupied);
            System.out.println("Total Rooms:"+totalrooms);
            System.out.println("Occupancy Rate:"+occupancyrate+"%");
            System.out.println("Status:"+status);
            System.out.println();
        }
        double average=totaldaysanalyzed/n;
        System.out.println("Total Days Analyzed"+n);
        System.out.printf("Average occupancy rate:%.2f%%%n",average);
        System.out.println("Peak occupancy days:"+"day"+ peakdays);
        System.out.println("days at full capacity:"+daysatfull);
        sc.close();
    }
}