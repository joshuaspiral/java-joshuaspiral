import java.util.*;

public class Arrays2 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int size = kb.nextInt();
    double[] heights = new double[size];
    for (int i = 0; i < size; i++) {
      heights[i] = kb.nextDouble();
    }
    Arrays.sort(heights);

    if (size % 2 != 0) {
      System.out.println(heights[size / 2]);
    } else {
      int Midpoint = size / 2;
      System.out.println((heights[Midpoint] + heights[Midpoint - 1]) / 2);
    }
  }
}
