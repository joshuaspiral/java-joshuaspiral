import java.util.*;

public class Conditionals3 {
  public static void main(String[] args) {
    Scanner keyb = new Scanner(System.in);
    String PhoneNumber = keyb.nextLine();
    String[] elts = (PhoneNumber.split(" "));
    if (elts.length == 3) {
      if (elts[0].equals("852")) {
        if ((elts[1].length() == 4) && (elts[2].length() == 4)) {
          System.out.println("valid");
        } else {
          System.out.println("invalid");
        }
      }
    } else {
      System.out.println("invalid");
    }

  }
}
