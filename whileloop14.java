import java.util.Scanner;
public class whileloop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number;
        int temp = number;
        int digits = 0;
        double sum = 0;
        int countTemp = number;
        while (countTemp != 0) {
            countTemp /= 10;
            digits++;
        }
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + Math.pow(digit, digits);
            temp /= 10;
        }
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
        sc.close();
    }
}