import java.util.Scanner;
public class forloop18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        double averagetemperatue=0;
        double highesttemperature=0;
        double lowesttemperature=0;
        double totaltemperatue=0;
        int hothours=0;
        int coldhours=0;
        for(int i=0;i<n;i++){
            int containshour=sc.nextInt();
            double temperature=sc.nextDouble();
            String status="";
            if(temperature>=40 || temperature<=0){
                status="Extreme";
            }
            else if(temperature>=32 && temperature<=40){
                status="Hot";
            }
            else if(temperature>=10 && temperature<=32){
                status="Normal";
            }
            else if(temperature>=0 && temperature<=10){
                status="Cold";
            }
            if(temperature>=32){
                hothours++;
            }
            else if(temperature<=10){
                coldhours++;
            }
            int maxhour=0;
            if(containshour<maxhour && temperature>=40){
                highesttemperature++;
            }
            else{
                lowesttemperature++;
            }
            totaltemperatue=totaltemperatue+temperature;
            System.out.println("Hour:"+containshour);
            System.out.println("Temperature:"+temperature+" C");
            System.out.println("Status:"+status);
        }
            averagetemperatue=totaltemperatue/n;
            System.out.println("Total reading:"+n);
            System.out.printf("Average temperature:%.2f%n",averagetemperatue);
            System.out.println("Highest temp:"+highesttemperature+"C");
            System.out.println("Lowest temp:"+lowesttemperature+"C");
            System.out.println("Hot hours:"+hothours);
            System.out.println("cold hours:"+coldhours);
            sc.close();
    }
}