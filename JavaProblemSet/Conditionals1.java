import java.util.*;

public class Conditionals1 {
  public static void main(String[] args) {
    Scanner keyb = new Scanner(System.in);
    int num = keyb.nextInt();
    if (num % 2 == 0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
  }
}
