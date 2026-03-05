import java.util.Scanner;
public class condition20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int storageCapacity=sc.nextInt();
        int userCount=sc.nextInt();
        sc.nextLine();
        String backupFrequency=sc.nextLine();
        String supportTier=sc.nextLine();
        
        double baseStorageCost=0.0;
        double perUserFee=0.0;
        double backupPremium=0.0;
        double supportFee=0.0;
        String recommendPlan="";
        String includedFeature="";
        if(storageCapacity>=10 && storageCapacity<=100){
            baseStorageCost=storageCapacity*0.05;
        }
        else if(storageCapacity>=101 && storageCapacity<=500){
            baseStorageCost=(100*0.05)+((storageCapacity-100)*0.05);
        }
        else if(storageCapacity>=501 && storageCapacity<=2000){
            baseStorageCost=(100*0.05)+(400*0.04)+((storageCapacity-500)*0.03);
        }
        else{
            baseStorageCost=(100*0.05)+(400*0.04)+(1500*0.03)+((storageCapacity-2000)*0.02);
        }
        if(userCount<=10){
            perUserFee=userCount*5.0;
        }
        else if(userCount<=50){
            perUserFee=userCount*4.0;
        }
        else{
            perUserFee=userCount*3.0;
        }
        if(backupFrequency.equalsIgnoreCase("Hourly")){
            backupPremium=0.15+(0.50*userCount);
        }
        else if(backupFrequency.equalsIgnoreCase("Real-Time")){
            backupPremium=0.50+(0.01*userCount);
        }
        if(supportTier.equalsIgnoreCase("Community")){
            supportFee=0;
        }
        else if(supportTier.equalsIgnoreCase("Standard")){
            supportFee=20.0;
        }
        else if(supportTier.equalsIgnoreCase("Priority")){
            supportFee=75.0;
        }
        else if(supportTier.equalsIgnoreCase("Enterprise")){
            supportFee=200.0;
        }
        double monthlyTotal=baseStorageCost+perUserFee+backupPremium+supportFee;
        double annual=monthlyTotal*12*0.9;

        if(userCount==1){
            recommendPlan="Personal";
            includedFeature="Basic storage, file sync";
        }
        else if(userCount<=20){
            recommendPlan="Team";
            includedFeature="Version history, file sharing, basic analytics";
        }
        else if(userCount<=100){
            recommendPlan="Business";
            includedFeature=" Advanced sharing, team analytics, priority support";
        }
        else{
            recommendPlan="Enterprise";
            includedFeature="Advanced security, compliance tools, dedicated support, API access";
        }
        System.out.println("Storage Capacity:"+storageCapacity+" GB");
        System.out.println("User Count:"+userCount);
        System.out.println("Backup Frequency:"+backupFrequency);
        System.out.println("Support Tier:"+supportTier);
        System.out.println("Base Storage Cost:$"+baseStorageCost);
        System.out.println("Per-User Fee:$"+perUserFee);
        System.out.println("Backup Premium:$"+backupPremium);
        System.out.println("Support Fee:$"+supportFee);
        System.out.println("Monthly Subscription:$"+monthlyTotal);
        System.out.println("Annual:$"+annual+" (save 10%)");
        System.out.println("Recommended Plan:"+recommendPlan);
        System.out.println("Included Features:"+includedFeature);
        sc.close();
    }
    
}
