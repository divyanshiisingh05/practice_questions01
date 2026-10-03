import java.util.Scanner;
public class Question_08 {
    static Scanner sc = new Scanner(System.in);
    static void Loan() {
        double salary = sc.nextDouble();
        double existingEMI = sc.nextDouble();
        int creditScore = sc.nextInt();
        double loanAmount = sc.nextDouble();
        double annualInterest = sc.nextDouble();
        int months = sc.nextInt();
        if (salary >= 25000 &&
            creditScore >= 700 &&
            existingEMI <= salary * 0.40) {
            double maxEMI = (salary * 0.50) - existingEMI;
            double monthlyRate = annualInterest / 12 / 100;
            double estimatedEMI =
                loanAmount * monthlyRate *
                Math.pow(1 + monthlyRate, months) /
                (Math.pow(1 + monthlyRate, months) - 1);
            System.out.println("Loan Status: ELIGIBLE");
            System.out.printf("Maximum EMI: %.2f%n", maxEMI);
            System.out.printf("Estimated Monthly EMI: %.2f%n",
                              estimatedEMI);
        } else {
            System.out.println("Loan Status: NOT ELIGIBLE");
        }
    }
    public static void main(String[] args) {
        Loan();
        sc.close();
    }
}
