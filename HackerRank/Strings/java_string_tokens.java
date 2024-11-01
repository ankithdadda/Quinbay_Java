import java.util.*;

public class java_string_tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        String s = scan.nextLine();
        scan.close();
        s = s.trim();
        String[] arr = s.split("[ !,?._'@]+");
        if(s.length()==0){
            System.out.println(0);
        }
        else{
            System.out.println(arr.length);
        }
        for(int i=0;i<arr.length;i++){
            if(!arr[i].isEmpty()){
                System.out.println(arr[i]);
            }
            
        }
    }
}

