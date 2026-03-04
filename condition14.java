import java.util.Scanner;
public class condition14{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String MembershipTier=sc.nextLine();
        int months=sc.nextInt();
        sc.nextLine();
        String accessLevel=sc.nextLine();
        String addOns=sc.nextLine();
        double baseMonthlyFee=0.0;
        double contractDiscount=0.0;
        double accessFee=0.0;
        double addOnFee=0.0;
        String membershipCategory="";
        if(MembershipTier.equalsIgnoreCase("Basic")){
            baseMonthlyFee=40.0;
        }
        else if(MembershipTier.equalsIgnoreCase("Premium")){
            baseMonthlyFee=80.0;
        }
        else if(MembershipTier.equalsIgnoreCase("Elite")){
            baseMonthlyFee=120.0;
        }
        else if(MembershipTier.equalsIgnoreCase("VIP")){
            baseMonthlyFee=150.0;
        }
        if(months==6){
            contractDiscount=10;
        }
        else if(months==12){
            contractDiscount=15;
        }
        else if(months==24){
            contractDiscount=25;
        }
        else{
            contractDiscount=0;
        }
        if(accessLevel.equalsIgnoreCase("Single-Location")){
            accessFee=0.0;
        }
        else if(accessLevel.equalsIgnoreCase("Regional")){
            accessFee=20.0;
        }
        else if(accessLevel.equalsIgnoreCase("Nationwide")){
            accessFee=50.0;
        }
        if(addOns.equalsIgnoreCase("None")){
            addOnFee=0.0;
        }
        else if(addOns.equalsIgnoreCase("Personal-Training")){
            addOnFee=100.0;
        }
        else if(addOns.equalsIgnoreCase("Classes")){
            addOnFee=50.0;
        }
        else if(addOns.equalsIgnoreCase("Full-Package")){
            addOnFee=200.0;
        }
        double discountBase=baseMonthlyFee*(1-contractDiscount/100.0);
        double monthlyTotal=discountBase+accessFee+addOnFee;
        double contractTotal=monthlyTotal*months;
        double monthtomonthtotal=(baseMonthlyFee+accessFee+addOnFee)*months;
        double Savings=monthtomonthtotal-contractTotal;
        if (MembershipTier.equalsIgnoreCase("Basic")) {
            membershipCategory = "Budget";
        }
        else if (MembershipTier.equalsIgnoreCase("VIP")) {
            membershipCategory = "Luxury";
        } 
        else if (monthlyTotal > 150) {
            membershipCategory = "Premium";
        } 
        else {
            membershipCategory = "Standard";
        }
        System.out.println("Membership Tier: " + MembershipTier);
        System.out.println("Contract Length: " + months + " months");
        System.out.println("Access Level: " + accessLevel);
        System.out.println("Add-Ons: " + addOns);
        System.out.println("Base Monthly Fee: $" + baseMonthlyFee);
        System.out.println("Contract Discount: " + (int)contractDiscount + "%");
        System.out.println("Access Fee: $" + accessFee);
        System.out.println("Add-On Fee: $" + addOnFee);
        System.out.println("Monthly Total: $" + monthlyTotal);
        System.out.println("Contract Total: $" + contractTotal);
        System.out.println("Savings vs Month-to-Month: $" + Savings);
        System.out.println("Membership Category: " + membershipCategory);

        sc.close();
    }
}
