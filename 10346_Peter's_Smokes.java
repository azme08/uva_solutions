//10346	Peter's Smokes
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
      
       Scanner sc = new Scanner(System.in);
	
     while(sc.hasNext()){
         int n=sc.nextInt();
         
         if(n==-1) break;
         int k=sc.nextInt();
         int ans=n;
         int buts=n;
         while(buts>=k){
             ans+=buts/k;
             buts=(buts/k)+(buts%k);
         }
         System.out.println(ans);
     }
         
        
    }
    
}
