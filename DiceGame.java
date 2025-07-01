import java.util.Scanner;
public class Dicegame {
  public static void main(String[] a) {
    run();
  }
  
  public static void run() {
     int a,b;
     String name;
     name=Greeting();
    
     a=dice();
     b=dice();
     System.out.println("dice1: "+a+"\ndice2: "+b+"\ntotal　"+(a+b));
    if(a+b>=8) System.out.println("You won");
    else System.out.println("You lost");
  }
public static int dice() {
    return (int)(Math.random()*6+1);
}
  public static String Greeting() {
    System.out.println("What is your name? ");
    Scanner scanner=new Scanner(System.in);
    String name=scanner.nextLine();
    return name;
  }
}
