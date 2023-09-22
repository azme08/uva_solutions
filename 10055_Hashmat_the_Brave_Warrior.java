//10055 - Hashmat the Brave Warrior
import java.util.Scanner;

public class Main {

  
    public static void main(String[] args){
      
       Scanner sc = new Scanner(System.in);
		while (sc.hasNextLong()) {
			long A = sc.nextLong();
			long B = sc.nextLong();
			System.out.println(Math.abs(A - B));
		}
   
    }
    
}

