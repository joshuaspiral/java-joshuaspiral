import java.util.*;

public class Arrays4 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int size = 10;
    char[] names = new char[size];
    double[] heights = new double[size];
    double[] SortedHeights = heights.clone();
    for (int i = 0; i < size; i++) {
      names[i] = kb.next().charAt(0);
      heights[i] = kb.nextDouble();
    }
    Arrays.sort(SortedHeights);
    double target = SortedHeights[4];
    System.out.println(target);
    System.out.println(Arrays.toString(heights));
    for (int i = 0; i < size; i++) {
      if (heights[i] == target)
        System.out.println(names[i]);
    }
  }
}
