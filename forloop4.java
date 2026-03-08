import java.util.Scanner;
public class forloop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalsales=0;
        double commissions=0;
        double maxsales=0;
        String topperformer="";
        for(int i=0;i<n;i++){
            String rep=sc.next();
            double saleamount=sc.nextDouble();
            int commissionrate=0;
            double commissionearned=0;
            double bonus=0;
            if(saleamount>150000){
                commissionrate=15;
            }
            else if(saleamount>100000){
                commissionrate=12;
            }
            else if(saleamount>80000){
                commissionrate=10;
            }
            else if(saleamount>40000){
                commissionrate=8;
            }
            else{
                commissionrate=5;
            }
            if(saleamount>150000){
                bonus=3000;
            }
            else if(saleamount>=100000){
                bonus=2000;
            }
            commissionearned=saleamount*(commissionrate/100.0);
            double totalpayout=commissionearned+bonus;
            totalsales = totalsales + saleamount;
            commissions = commissions + totalpayout;
            if(saleamount>maxsales){
                maxsales=saleamount;
                topperformer=rep;
            }
            System.out.println("Sales Rep: " + rep);
            System.out.println("Sales Amount: $" + saleamount);
            System.out.println("Commission Rate: " + commissionrate + "%");
            System.out.println("Commission Earned: $" + commissionearned);
            System.out.println("Bonus: $" + bonus);
            System.out.println("Total Payout: $" + totalpayout);
            System.out.println();
        }
        System.out.println("Total Sales Reps: " + n);
        System.out.println("Total Sales: $" + totalsales);
        System.out.println("Total Commissions: $" + commissions);
        System.out.println("Top Performer: " + topperformer);
        sc.close();
    }
}
