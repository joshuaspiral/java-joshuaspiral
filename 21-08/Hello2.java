import java.util.Scanner;

public class Hello {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String name = kb.nextLine();
    System.out.print("Hello, " + name + "!");
  }
}
