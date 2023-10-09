import java.util.Scanner;

public class Numbers2 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int num = kb.nextInt();
    System.out.println((num / 100) % 10);
  }
}
