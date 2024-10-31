import java.util.Scanner;

public class java_string_compare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        for(int i=0;i<=s.length()-k;i++){
            String j = s.substring(i,i+k);
            if(smallest.compareTo(j)>=0){
                smallest = j;
            }

            if(largest.compareTo(j)<=0){
                largest = j;
            }
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}