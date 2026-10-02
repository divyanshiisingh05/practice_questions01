import java.util.Scanner;

public class Question_01{
 public static void main(String[] args) {
    Scanner Sc= new Scanner(System.in);
    System.out.println("Enter your units:");
    int unit= Sc.nextInt();
    if(unit<=100){
        System.out.println("Your bill is :"+ unit*5);
    }
    else if(unit >100 && unit <=200){
        System.out.println("Your bill is :"+ (100*5+ (unit-100)*7));
    }
    else if (unit>200 && unit<=400){
        System.out.println("Your bill is :"+ (100*5+ 100*7 + ((unit-200)*10)));
    }
    else{
        System.out.println("Your bill is :"+ (100*5+ 100*7 + 200*10 + ((unit-400)*15)));
    }
    Sc.close();
 }    
 }
