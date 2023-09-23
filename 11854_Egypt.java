//11854	Egypt
import java.util.Scanner;

public class Main {

  
    public static void main(String[] args){
    
      int a,b,c;
      
      Scanner sc = new Scanner(System.in);
     
      while(sc.hasNext()){
          a=sc.nextInt();
          b=sc.nextInt();
          c=sc.nextInt();
          if(a<=0 || b<=0 || c<=0 ){
              break;
          }else{
              if((a*a+b*b)==(c*c) ||(c*c+b*b)==(a*a) || (c*c+a*a)==(b*b)){
                  System.out.println("right");
              }else{
                  System.out.println("wrong");
              }
          }
          
          
      }
    }
    
}
