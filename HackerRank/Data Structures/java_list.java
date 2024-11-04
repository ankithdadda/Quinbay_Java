import java.util.*;

public class java_list {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            list.add(in.nextInt());
        }
        int m= in.nextInt();
         
        for(int i=0;i<m;i++){
            String b = in.next();
            if(b.equals("Delete")){
                int x = in.nextInt();
                list.remove(x);
            }
            else{
                int x = in.nextInt();
                int y = in.nextInt();
                list.add(x,y);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}