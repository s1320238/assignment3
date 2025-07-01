import java.util.Scanner;
public class DiceGame {
  public static void main(String[] a) {
    run();
  }
  
  public static void run() {
     int a,b;
     String name;
     name=Greeting();
    
     a=dice();
     b=dice();
     System.out.println("Rolling the dice...\ndice1: "+a+"\ndice2: "+b+"\ntotal　"+(a+b));
    if(a+b>=8) System.out.println(name+" won");
    else System.out.println(name+" lost");
  }
public static int dice() {
    return (int)(Math.random()*6+1);
}
  public static String Greeting() {
    System.out.println("What is your name? ");
    Scanner scanner=new Scanner(System.in);
    String name=scanner.nextLine();
    System.out.println("Hello, "+name+"!");
    return name;
  }
}
