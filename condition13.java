import java.util.Scanner;
public class condition13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String studentStatus=sc.nextLine();
        int creditHours=sc.nextInt();
        sc.nextLine();
        String programType=sc.nextLine();
        String residency=sc.nextLine();
        double baseTuitionPerCredit=0.0;
        double residencyMultiplier=0.0;
        double programFee=0.0;
        double studentActivityFee=0.0;
        String FeeCategory="Reduced";
        if(programType.equalsIgnoreCase("Undergraduate")){
            baseTuitionPerCredit=350.0;
        }
        else if(programType.equalsIgnoreCase("Graduate")){
            baseTuitionPerCredit=550.0;
        }
        else if(programType.equalsIgnoreCase("Professional")){
            baseTuitionPerCredit=800.0;
        }
        if(residency.equalsIgnoreCase("In-State")){
            residencyMultiplier=1.0;
        }
        else if(residency.equalsIgnoreCase("Out-of-State")){
            residencyMultiplier=2.5;
        }
        else if(residency.equalsIgnoreCase("International")){
            residencyMultiplier=3.0;
        }
        if(studentStatus.equalsIgnoreCase("Full-Time")){
            if(programType.equalsIgnoreCase("Undergraduate")){
                programFee=500.0;
            }
            else if(programType.equalsIgnoreCase("Graduate")){
                programFee=750.0;
            }
            else if(programType.equalsIgnoreCase("Professional")){
                programFee=1200.0;
            }
        }
        else if(studentStatus.equalsIgnoreCase("Part-Time")){
            if(programType.equalsIgnoreCase("Undergraduate")){
                programFee=300.0;
            }
            else if(programType.equalsIgnoreCase("Graduate")){
                programFee=750.0;
            }
            else if(programType.equalsIgnoreCase("Professional")){
                programFee=900.0;
            }
        }
        else if(studentStatus.equalsIgnoreCase("Continuing-Education")){
            studentActivityFee = 50.0;
            programFee = 150.0;
        }
        if(studentStatus.equalsIgnoreCase("Full-Time")){
            studentActivityFee=200.0;
        }
        else if(studentStatus.equalsIgnoreCase("Part-Time")){
            studentActivityFee=100.0;
        }
        else if(studentStatus.equalsIgnoreCase("Continuing-Education")){
            studentActivityFee=50.0;
        }

        double tuitionCost=creditHours*baseTuitionPerCredit*residencyMultiplier;
        double totalFee=tuitionCost+programFee+studentActivityFee;

        if(residency.equalsIgnoreCase("In-State") && studentStatus.equalsIgnoreCase("Full-Time")){
            FeeCategory="Standard";
        }
        else if(residency.equalsIgnoreCase("Out-of-State") || residency.equalsIgnoreCase("International")){
            FeeCategory="Premium";
        }
        else{
            FeeCategory="Reduced";
        }
        System.out.println("Student Status:"+studentStatus);
        System.out.println("Credit Hours:"+creditHours);
        System.out.println("Program Type:"+programType);
        System.out.println("Residency:"+residency);
        System.out.println("Base Tuition Per Credit:$"+baseTuitionPerCredit);
        System.out.println("Residency Multiplier:"+residencyMultiplier+"x");
        System.out.println("Program Fee:$"+programFee);
        System.out.println("Student Activity Fee:$"+studentActivityFee);
        System.out.println("Total Registration Fee:$"+totalFee);
        System.out.println("Fee Category:"+FeeCategory);
        sc.close();
    }
}