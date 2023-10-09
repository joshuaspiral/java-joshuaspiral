import java.util.*;

public class Arrays1 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int size = kb.nextInt();
    double[] heights = new double[size];
    for (int i = 0; i < size; i++) {
      heights[i] = kb.nextDouble();
    }
    double total = 0;
    ;
    double min = Double.POSITIVE_INFINITY;
    double max = 0;
    for (int i = 0; i < size; i++) {
      total += heights[i];
      if (min > heights[i]) {
        min = heights[i];
      } else if (max < heights[i]) {
        max = heights[i];
      }
    }
    System.out.println(total / size);
    System.out.println(max - min);
  }
}
