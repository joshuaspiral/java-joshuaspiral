import java.util.Scanner;

public class Numbers5 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int seconds = kb.nextInt();
    int hours = seconds / 3600;
    System.out.println(hours);
    System.out.println((seconds - (hours * 3600)) / 60);
  }
}
