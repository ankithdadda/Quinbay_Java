import java.util.*;
import java.util.regex.*;

public class tag_content_extractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        String regex = "<([^>]+)>([^<>]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);

        while (testCases > 0) {
            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);
            boolean found = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }

            testCases--;
        }
        in.close();
    }
}
