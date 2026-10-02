import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter your number:");
       int n=Sc.nextInt();
       int num =n;
       int sum=0;
       int product=1;
        while(num>0){
         int digit= num%10;
         sum =sum+digit;
         product =product*digit;
         num=num/10;
        }
        System.out.println("Sum:"+ sum);
        System.out.println("Product:"+ product);
        String a=(sum%3==0)? "divisble by 3":"not divisible by 3";
        System.out.println(a);
    }
}
