import java.util.*;

public class java_strings {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int sum = A.length() + B.length();
        System.out.println(sum);
        
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        String a = A.substring(0,1).toUpperCase() + A.substring(1);
        String b = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(a+" "+b);
    }
}



