import java.util.*;

public class Arrays3 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int size = kb.nextInt();
    double[] heights = new double[size];
    for (int i = 0; i < size; i++) {
      heights[i] = kb.nextDouble();
    }
    int total = 0;
    for (int i = 0; i < size; i++) {
      if (heights[i] % 2 == 0) {
        total += heights[i];
      }
    }
    System.out.println(total);
  }
}
