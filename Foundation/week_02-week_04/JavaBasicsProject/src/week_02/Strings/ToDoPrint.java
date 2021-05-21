package week_02.Strings;

public class ToDoPrint {
  public static void main(String[] args) {
    String todoText = "\n - Buy milk";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText applying indention

    // Expected output:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    StringBuilder sb = new StringBuilder();
    sb.append("My todo:").append(todoText).append("\n - Download games").append("\n\t - Diablo");

    System.out.println(sb);
  }
}
