import java.util.*;

public class try_catch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int x = 0;
            x = n1/n2;
            System.out.print(x);
        }catch (ArithmeticException e) {
            System.out.print("java.lang.ArithmeticException: / by zero");
        } catch (InputMismatchException e) {
            System.out.print("java.util.InputMismatchException");
        } finally {
            in.close();
        }
    }
}