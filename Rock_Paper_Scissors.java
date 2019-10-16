import java.util.Scanner;

public class Rock_Paper_Scissors
{
    public static void main(String[] args){
     //Rock = 1, Paper = 2, Scissors = 3
     Scanner Sc = new Scanner(System.in);
     
     String Con = "y";
     System.out.println("Rock Paper Scissors, BITCH !");
     System.out.println("----------------------------");
      //System.out.println("");
     
      while("y".equals(Con)){
          System.out.println("");
      System.out.println("Chose Rock, Paper or Scissors!");
       System.out.print("Rock = [1], Paper = [2], Scissors = [3] ");
       int In = Sc.nextInt();
       System.out.println("");
       if(In == 1) System.out.println("You Threw Rock");
       else if(In == 2)System.out.println("You Threw Paper");
       else if(In == 3)System.out.println("You Threw Scissors");
       int Out = (int)(Math.random()*3)+1;
      System.out.println("");
            if(Out == 1) System.out.println("I Threw Rock");
       else if(Out == 2)System.out.println("I Threw Paper");
       else if(Out == 3)System.out.println("I Threw Scissors");
       System.out.println("");
       if(Game(In,Out) == 1)System.out.println("You Win");
       else if(Game(In,Out) == 2)System.out.println("We Tied");
       else System.out.println("You Lose");
       System.out.println("");
       System.out.println("Foolish Mortal, do you wish to play again?");
       System.out.print("yes or no [y,n] ");
       
       Con = Sc.nextLine();
       Con = Sc.nextLine();
       
    }
    System.out.println("");
    if("n".equals(Con)){ 
     
        System.out.println("THEN DIE!"); 
     System.out.println("*death noises*");   
    }
    else System.out.println("What are you, Dyslexic?");
    
    }
    
    public static int Game(int in, int out){
        //1 = win, 2 = draw, 3 = loss
        // rock == 1, paper = 2, scissors = 3
        if(out == in) return 2;
        else if(in ==3 && out == 2)return 1;
         else if(in == 2 && out == 1)return 1;
        else if(in == 1 && out == 3)return 1;
        else return 3;
        
        //return 0;
    }
}
