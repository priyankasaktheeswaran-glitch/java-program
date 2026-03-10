import java.util.Scanner;
public class forloop17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int urgentrenewals=0;
        double totalrenewalrevenue=0;
        double renewalFee=0;
        for(int i=0;i<n;i++){
            String memberName=sc.next();
            String memberTpe=sc.next();
            int daysuntilexpiry=sc.nextInt();
           
            int discount=0;
            double finalFee=0;
            String priority="";
            if(memberTpe.equalsIgnoreCase("VIP")){
                renewalFee=200.0;
            }
            else if(memberTpe.equalsIgnoreCase("Premium")){
                renewalFee=100.0;
            }
            else if(memberTpe.equalsIgnoreCase("Basic")){
                renewalFee=50.0;
            }
            if(daysuntilexpiry>=45){
                discount=20;
            }
            else if(daysuntilexpiry>=30 &&daysuntilexpiry<=44){
                discount=15;
            }
            else if(daysuntilexpiry>=15 && daysuntilexpiry<=29){
                discount=10;
            }
            else{
                discount=0;
            }
            if(daysuntilexpiry>=30){
                priority="Normal";
            }
            else if(daysuntilexpiry>=10 && daysuntilexpiry<=30){
                priority="High";
            }
            else{
                priority="Urgent";
                urgentrenewals++;
                
            }
            finalFee=renewalFee*(1-discount/100.0);
            totalrenewalrevenue=totalrenewalrevenue+finalFee;
            System.out.println("Member:"+memberName);
            System.out.println("Membership:"+memberTpe);
            System.out.println("Days until Expiry:"+daysuntilexpiry);
            System.out.println("Renewal Feee:$"+renewalFee);
            System.out.println("Discount:"+discount+"%");
            System.out.println("Final Fee:$"+finalFee);
            System.out.println("Priority:"+priority);
        }
        double average=totalrenewalrevenue/n;
        System.err.println("Total Members:"+n);
        System.out.println("Urgent renewals:"+urgentrenewals);
        System.out.println("Total renewal revenue:$"+totalrenewalrevenue);
        System.out.println("Average renewal fee:$"+average);
        sc.close();
    }
}
