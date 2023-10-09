import java.util.*;
import java.io.File;

public class Mayday {
  public static void main(String[] args) throws Exception {
    Scanner data = new Scanner(new File("input"));
    while (data.hasNext()) {
      String line = data.nextLine();
      String checksum = line.substring(14, 16);
      String payload = line.substring(14);
      int total = 0;
      for (int i = 0; i < payload.length() - 1; i++) {
        String part = payload.substring(i, i + 2);
        total += Integer.parseInt(part, 16);
        // char ch = (char) Integer.parseInt(part, 16);
        // System.out.print(ch);
      }
      System.out.println(Integer.toHexString(total % 256) == checksum);
    }
  }
}
