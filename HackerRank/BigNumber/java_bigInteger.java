import java.io.*;
import java.util.*;
import java.math.*;

public class java_bigInteger {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n1 = bufferedReader.readLine();
        String n2 = bufferedReader.readLine();
        
        BigInteger N1 = new BigInteger(n1);
        BigInteger N2 = new BigInteger(n2);
        BigInteger N= N1.add(N2);
        System.out.println(N);
        
        N= N1.multiply(N2);
        System.out.println(N);
    }
}