import java.util.Scanner;

public class Numbers3 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int num = kb.nextInt();
    int a = num / 100;
    int b = (num / 10) % 10;
    int c = (num % 10);
    System.out.println(a + b + c);
  }
}
