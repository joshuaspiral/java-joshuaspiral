import java.util.Scanner;

public class Numbers6 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    double celsius = kb.nextDouble();
    System.out.println(celsius * 9 / 5 + 32);
  }
}
