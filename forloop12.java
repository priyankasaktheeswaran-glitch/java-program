import java.util.Scanner;
public class forloop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalRevenue=0;
        double averagefee=0;
        int peakhour=0;
        for(int i=0;i<n;i++){
            String vehicleType=sc.next();
            double hoursparked=sc.nextDouble();
            double hourlyRate=0;
            double parkingfee=0;
            String capapplied="";
            double dailycap=0;
            if(vehicleType.equalsIgnoreCase("Car")){
                hourlyRate=3.0;
                dailycap=30.0;

            }
            else if(vehicleType.equalsIgnoreCase("Motorcycle")){
                hourlyRate=2.0;
                dailycap=20.0;
            }
            else if(vehicleType.equalsIgnoreCase("Truck")){
                hourlyRate=5.0;
                dailycap=60.0;
            }
            else if(vehicleType.equalsIgnoreCase("Bus")){
                hourlyRate=7.0;
                dailycap=100.0;
            }
            parkingfee=hoursparked*hourlyRate;
            double finalfee=Math.min(parkingfee,dailycap);
            if(parkingfee>dailycap){
                capapplied="Yes";
            }
            else{
                capapplied="No";
            }
            if(hoursparked>8){
                hoursparked=peakhour;
                peakhour++;
            }
            totalRevenue=totalRevenue+parkingfee;
            averagefee=totalRevenue/n;
            System.out.println("Vehicle:"+vehicleType);
            System.out.println("Hours parked:"+hoursparked);
            System.out.println("Hourly rate:$"+hourlyRate);
            System.out.println("Parking feee:$"+finalfee);
            System.out.println("Cap applied:"+capapplied);
            System.out.println();
        }
        System.out.println("Total vehicles:"+n);
        System.out.println("Total Revenue:$"+totalRevenue);
        System.out.println("Average fee:$"+averagefee);
        System.out.println("Peak Hour Vehicles(>8hours):"+peakhour);
        sc.close();
    }
}
        