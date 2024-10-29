import java.util.*;

public class Java_loops_I {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<11){
            int N = n*i;
            System.out.printf("%d x %d = %d\n", n, i, N);
            i++;
        }
    }
}
