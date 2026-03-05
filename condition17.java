import java.util.Scanner;
public class condition17{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String cardTier=sc.nextLine();
        String purchaseCategory=sc.nextLine();
        double transcationAmount=sc.nextDouble();
        sc.nextLine();
        String promotionalStatus=sc.nextLine();
        double basePointsRate=1.0;
        double categoryBonus=0.0;
        double tierMultiplier=0.0;
        double promotionalMultiplier=0.0;
        String rewardsTier="";
        if(purchaseCategory.equalsIgnoreCase("Groceries")){
            categoryBonus=2.0;
        }
        else if(purchaseCategory.equalsIgnoreCase("Dining")){
            categoryBonus=2.5;
        }
        else if(purchaseCategory.equalsIgnoreCase("Travel")){
            categoryBonus=3.0;
        }
        else if(purchaseCategory.equalsIgnoreCase("Gas")){
            categoryBonus=2.0;
        }
        else{
            categoryBonus=1.0;
        }
        if(cardTier.equalsIgnoreCase("Basic")){
            tierMultiplier=1.0;
            rewardsTier="Standard";
        }
        else if(cardTier.equalsIgnoreCase("Gold")){
            tierMultiplier=1.25;
            rewardsTier="Enhanced";
        }
        else if(cardTier.equalsIgnoreCase("Platinum")){
            tierMultiplier=1.5;
            rewardsTier="Premium";
        }
        else if(cardTier.equalsIgnoreCase("Black")){
            tierMultiplier=2.0;
            rewardsTier="Elite";
        }
        if(promotionalStatus.equalsIgnoreCase("Double-Points")){
            promotionalMultiplier=2.0;
        }
        else if(promotionalStatus.equalsIgnoreCase("Triple-Points")){
            promotionalMultiplier=3.0;
        }
        else{
            promotionalMultiplier=1.0;
        }
        double pointsEarned=transcationAmount*basePointsRate*categoryBonus*tierMultiplier*promotionalMultiplier;
        double cashValue=pointsEarned*0.01;
        System.out.println("Card Tier:"+cardTier);
        System.out.println("Purchase Category:"+purchaseCategory);
        System.out.println("Transcation Amount:$"+transcationAmount);
        System.out.println("Promotional Status:"+promotionalStatus);
        System.out.println("Base Points Rate:"+basePointsRate+" points per dollar");
        System.out.println("Category Bonus:"+categoryBonus+"x");
        System.out.println("Tier Multiplier:"+tierMultiplier+"x");
        System.out.println("Promotional Multiplierr:"+promotionalMultiplier+"x");
        System.out.println("Points Earned:"+pointsEarned);
        if(cashValue==(cashValue)){
            System.out.println("Equivalent Cash Value:$"+cashValue);
        }
        else{
            System.out.println("Equivalent Cash Value:$");
            System.out.println(Math.round(cashValue * 100.0) / 100.0);
        }
        System.out.println("Rewards Tier:"+rewardsTier);
        sc.close();
    }
}