import java.util.Scanner;
public class Question_09 {
    static Scanner Sc=new Scanner(System.in);
    static int N=0;
   static int totalpassed=0;
    static int remaining=0;
    static int queue=0;
    public static void main(String[] args) {
        System.out.println("Enter the number of signal cycles:");
        int N=Sc.nextInt();
        for (int i =1;i < =N; i++){
            System.out.println("Enter the choice"+ N + "R/Y/B");
            String choice =Sc.next();
            System.out.println("Enter the number of vehicles waiting:");
            int vehicles = Sc.nextInt();
            queue = queue + vehicles;
            int allowed = 0;
            if (choice.equals("R")) {
                allowed = 0;
            } else if (choice.equals("Y")) {
                allowed = 2;
            } else if (choice.equals("G")) {
                allowed = 10;
            }
        int passed = Math.min(queue, allowed);
            remaining = queue - passed;
            queue = remaining;
      totalpassed=totalpassed+passed;
            System.out.println("Cycle " + i + ": Passed = " + passed + ", Remaining = " + remaining);
        }
        System.out.println("Total Passed: " + totalpassed);
        System.out.println("Final Queue: " + queue);
        Sc.close();
    }
}
