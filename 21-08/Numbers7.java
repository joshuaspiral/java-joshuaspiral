import java.util.Scanner;

public class Hello {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    double r = kb.nextDouble();
    System.out.println(Math.PI * r * r);
  }
}
