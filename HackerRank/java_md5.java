import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

public class java_md5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        
        try {
            byte[] b = line.getBytes();
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(b);
            
            byte[] digest = m.digest();
            String hexString = DatatypeConverter.printHexBinary(digest).toLowerCase();
        
            System.out.println(hexString);
        } catch (NoSuchAlgorithmException e) {
        }
    }
}
