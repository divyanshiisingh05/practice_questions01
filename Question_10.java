import java.util.Scanner;
public class Question_10 {
     static Scanner Sc=new Scanner(System.in);
     static int N=0;// no. of matches
     static int team_score=0;  
     static int oponent_score=0;
     static int win=0;
     static int loss=0;
     static int points=0;
     static int ties=0;
     static int highest_score=0;
     public static void main(String[] args) {
         System.out.println("Enter the number of matches played:");
         int N=Sc.nextInt(); 
 for(int i=1;i<=N; i++){    
              System.out.println("Enter your team score:");
            int score=Sc.nextInt();
            team_score+=score;
            if(score>highest_score){
                highest_score=score;
            }
            System.out.println("Enter your opponent score:");
            int oponent_score=Sc.nextInt();

            if(score >oponent_score){
            win++;
            points+=2;
         }
            else if(score==oponent_score){
            ties++;
            points+=1;
         }
            else{
                loss++; 
     }
}       
System.out.println("your total score:"+team_score);
System.out.println("your point:"+ points);
System.out.println("highest score is:"+ highest_score);
System.out.println("Wins: " + win);
System.out.println("Losses: " + loss);
System.out.println("Ties: " + ties);
}   
}
