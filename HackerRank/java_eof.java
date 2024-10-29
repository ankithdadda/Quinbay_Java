import java.util.Scanner;

public class java_eof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 1;
        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(N + " " + line);
            N++;
        }
        scanner.close();
    }
}