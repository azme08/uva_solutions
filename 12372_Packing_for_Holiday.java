//12372 Packing for Holiday
import java.util.Scanner;

public class Main {

  
    public static void main(String[] args){
      
       int t;
       
        Scanner sc=new Scanner(System.in);
        
        t=sc.nextInt();
        
       int cases=1;
       while(t-->0){
           int a=sc.nextInt();
           int b=sc.nextInt();
           int c=sc.nextInt();
           
           if(a<=20 && b<=20 && c<=20){
               System.out.println("Case "+cases++ + ": "+"good\n");
           }
           else{
               System.out.println("Case "+cases++ + ": "+"bad\n");
           }
       }
   
    }
    
}
