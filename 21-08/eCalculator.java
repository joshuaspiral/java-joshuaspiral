import java.util.Scanner;

public class Numbers {
  public static void main(String[] args) {
    double e = 0;
    int n = 0;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter value for n: ");
    n = keyboard.nextInt();
    for (int i = 0; i<n;i++) {
      e += 1.0/Double.valueOf(factorial(i));
    }
    System.out.println(e);
  }   

  public static double factorial(int x) {
    if (x <= 0) {
      return 1;
    }
    long t = x;
    for (int i = x - 1; i > 0; i--) {
      t = t * i;
    }
    return t;
  }
}
