//11461_Square_Numbers solution
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
 
     Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0) break;
			int res = (int)Math.floor(Math.sqrt(b)) - (int)Math.ceil(Math.sqrt(a)) + 1;
			System.out.println(res);
		}
    }
    
}
