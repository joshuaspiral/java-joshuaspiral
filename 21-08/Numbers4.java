import java.util.Scanner;

public class Hello {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int hours = kb.nextInt();
    int minutes = kb.nextInt();
    System.out.println(minutes * 60 + hours * 3600);
  }
}
