import java.util.Scanner;

public class condition7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int heartRate = sc.nextInt();
        sc.nextLine(); 
        String bloodPressure = sc.nextLine();
        double temperature = sc.nextDouble();
        sc.nextLine(); 
        String symptomSeverity = sc.nextLine();

        String[] bpParts = bloodPressure.split("/");
        int systolic = Integer.parseInt(bpParts[0]);
        int diastolic = Integer.parseInt(bpParts[1]);

        String triagePriority;
        int waitTime;
        String recommendedAction;

        if (heartRate < 50 || heartRate > 130 || systolic > 180 || systolic < 90 || 
            temperature > 103 || temperature < 96 || symptomSeverity.equals("Life-Threatening")) {
            
            triagePriority = "Critical";
            waitTime = 0;
            recommendedAction = "Immediate Emergency Care";

        } else if ((heartRate >= 50 && heartRate <= 60) || (heartRate >= 110 && heartRate <= 130) || 
                   (systolic >= 160 && systolic <= 180) || (systolic >= 90 && systolic <= 100) || 
                   (temperature >= 101 && temperature <= 103) || (temperature >= 96 && temperature <= 97) || 
                   symptomSeverity.equals("Severe")) {
            
            triagePriority = "Urgent";
            waitTime = (heartRate < 60 || systolic < 100) ? 20 : 15;
            recommendedAction = "Priority Medical Attention";

        } else if (symptomSeverity.equals("Moderate")) {
            triagePriority = "Standard";
            waitTime = 45;
            recommendedAction = "Standard Examination";

        } else {
            triagePriority = "Non-Urgent";
            waitTime = 90;
            recommendedAction = "Routine Check-up";
        }

        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println("Symptom Severity: " + symptomSeverity);
        System.out.println("Triage Priority: " + triagePriority);
        System.out.println("Estimated Wait Time: " + waitTime + " minutes");
        System.out.println("Recommended Action: " + recommendedAction);

        sc.close();
    }
}