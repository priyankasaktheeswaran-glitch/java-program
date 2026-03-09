import java.util.Scanner;
public class forloop14{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        double totalfines=0;
        int booksoverdue=0;
        double actualFine=0;
        for(int i=0;i<n;i++){
            String bookType=sc.next();
            int dayslate=sc.nextInt();
            double dailyFine=0;
            double maxfine=0;
            String capApplied="";
            if(bookType.equalsIgnoreCase("Regular")){
                dailyFine=0.50;
                maxfine=10.0;
            }
            else if(bookType.equalsIgnoreCase("Reference")){
                dailyFine=1.00;
                maxfine=20.0;
            }
            else if(bookType.equalsIgnoreCase("Magazine")){
                dailyFine=0.25;
                maxfine=5.0;
            }
            double calculatedfine=dayslate*dailyFine;
            actualFine=Math.min(calculatedfine,maxfine);
            if(calculatedfine>maxfine){
                capApplied="Yes";
            }
            else{
                capApplied="No";
            }
            if(dayslate>0){
                booksoverdue++;
            }
            totalfines=totalfines+actualFine;
            System.out.println("Book:"+bookType);
            System.out.println("Days Late:"+dayslate);
            System.out.println("Daily Fine:$"+dailyFine);
            System.out.println("Calculated Fine:$"+calculatedfine);
            System.out.println("Actual Fine:$"+actualFine);
            System.out.println("Cap Applied:"+capApplied);
            System.out.println();
        }
        
        double averagefine=totalfines/n;
        System.out.println("Total books:"+n);
        System.out.println("Total Fines Collected:$"+totalfines);
        System.out.println("Books overdue:"+booksoverdue);
        System.out.println("Average fine:$"+averagefine);
        sc.close();
    }
}
