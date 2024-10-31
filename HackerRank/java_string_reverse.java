import java.util.Scanner;

public class java_string_reverse {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        String A=scan.next();
        scan.close();
        String s = "";
        for(int i=0;i<A.length();i++){
            char c = A.charAt(i);
            s = c+s;
        }
        
        if(s.compareTo(A)==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



