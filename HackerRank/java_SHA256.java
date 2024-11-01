import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter; //doesn't work for java versions 9 and above

public class java_SHA256 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        
        try {
            byte[] b = line.getBytes();
            MessageDigest m = MessageDigest.getInstance("SHA-256");
            m.update(b);
            
            byte[] digest = m.digest();
            String hexString = DatatypeConverter.printHexBinary(digest).toLowerCase();
        
            System.out.println(hexString);
        } catch (NoSuchAlgorithmException e) {
        }
    }
}
