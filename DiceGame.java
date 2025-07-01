public class Dicegame {
  public static void main(String[] a) {
    run();
  }
  
  public static void run() {
     int a,b;

     a=dice();
     b=dice();
     System.out.println("dice1: "+a+"\ndice2: "+b+"\ntotal　"+(a+b));
  }
public static int dice() {
    return (int)(Math.random()*6+1);
}
}
