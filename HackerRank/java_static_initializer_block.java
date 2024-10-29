import java.util.Scanner;

public class java_static_initializer_block {
    static int B, H;
    static boolean flag = true;
    static{
        Scanner s = new Scanner(System.in);
        B = s.nextInt();
        H = s.nextInt();
        s.close();
        try{
            if(B<1 || H<1){
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
        }
        catch(Exception e){
            System.out.print(e);
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
