import java.util.*;

public class Conditionals2 {
  public static void main(String[] args) {
    Scanner keyb = new Scanner(System.in);
    int year = keyb.nextInt();
    if (year % 4 == 0 || ((year % 100 == 0) && (year % 400 == 0))) {
      System.out.println("Leap year!;");
    } else {
      System.out.println("No");
    }
  }
}
