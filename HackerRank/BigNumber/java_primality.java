import java.io.*;
import java.math.BigInteger;

public class java_primality {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        BigInteger N = new BigInteger(n);
        
        if(N.isProbablePrime(10)){
            System.out.print("prime"); 
        }
        else{
            System.out.print("not prime"); 
        }
        bufferedReader.close();
    }
}
