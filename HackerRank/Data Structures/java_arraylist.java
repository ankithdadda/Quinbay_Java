import java.util.*;

public class java_arraylist {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> arr= new ArrayList<ArrayList<Integer>>(n);
        
        for(int i=0;i<n;i++){            
            int d = in.nextInt();
            arr.add(new ArrayList<Integer>());
            for(int j=0;j<d;j++){
                arr.get(i).add(in.nextInt());
            }
        }

        int q = in.nextInt();

        for (int i=0; i<q; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            try{
                if (arr.get(x - 1).get(y - 1) != null) {
                    System.out.println(arr.get(x - 1).get(y - 1));
                } else {
                    System.out.println("ERROR!");
                }
            }    
            catch(Exception e){
                System.out.println("ERROR!");
            }    
        }
        in.close();
    }
}