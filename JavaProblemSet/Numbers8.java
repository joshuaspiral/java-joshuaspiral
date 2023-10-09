import java.util.Scanner;

public class Numbers8 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int a = kb.nextInt();
    double theta = kb.nextDouble();
    theta = theta * Math.PI / 180;
    System.out.println(a / Math.cos(theta));
    System.out.println(a * Math.tan(theta));
  }
}
