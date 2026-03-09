import java.util.Scanner;
public class forloop15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double totaldistance=0;
        double totalrevenue=0;
        double averagefare=0;
        for(int i=0;i<n;i++){
            double distanceKM=sc.nextDouble();
            String timeofday=sc.next();
            double distancecharge=0;
            double timesurcharge=0.0;
            double totalfare=0;
            double basefare=3.00;
            distancecharge=1.00*distanceKM;
            if(timeofday.equalsIgnoreCase("Night")){
                timesurcharge=5.0;
            }
            if(timeofday.equalsIgnoreCase("Evening")){
                timesurcharge=3.0;
            }
            if(timeofday.equalsIgnoreCase("Afternoon")){
                timesurcharge=0.0;
            }
            if(timeofday.equalsIgnoreCase("Morning")){
                timesurcharge=0.0;
            }
            totalfare=basefare+distancecharge+timesurcharge;
            totaldistance=totaldistance+distancecharge;
            totalrevenue=totalrevenue+totalfare;
            System.out.println("ride:"+n);
            System.out.println("Distance:"+distanceKM+" Km");
            System.out.println("Time:"+timeofday);
            System.out.println("Base Fare:$"+basefare);
            System.out.println("Distance Charge:$"+distancecharge);
            System.out.println("Time Surcharge:$"+timesurcharge);
            System.out.println("Total fare:$"+totalfare);
        }
        averagefare=totalrevenue/n;
        System.out.println("Total ride:"+n);
        System.out.println("Total distance:"+totaldistance+" km");
        System.out.println("Total Revenue:$"+totalrevenue);
        System.out.println("Average fare:$"+averagefare);
        sc.close();
    }
}
