import java.util.Scanner;

public class Hello {
  public static void main(String[] args) {
    Scanner keyb = new Scanner(System.in);
    String name = keyb.nextLine();
    System.out.println("Hello " + name + "!");
  }
}
