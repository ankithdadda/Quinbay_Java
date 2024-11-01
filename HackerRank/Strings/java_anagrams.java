import java.util.Scanner;

public class java_anagrams {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();
        
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        
        bubbleSort(aChars);
        bubbleSort(bChars);

        for (int i = 0; i < aChars.length; i++) {
            if (aChars[i] != bChars[i]) {
                return false;
            }
        }
        return true;
    }
    
    static void bubbleSort(char[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    char temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;   
                }
            }
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}