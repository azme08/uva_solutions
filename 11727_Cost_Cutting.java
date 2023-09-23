//11727 - Cost Cutting

import java.util.Scanner;

public class Main {

  
    public static void main(String[] args){
    
      int a;
      
      Scanner sc = new Scanner(System.in);
      a=sc.nextInt();
      
      for(int i=1;i<=a;i++){
          int x=sc.nextInt();
          int y=sc.nextInt();
          int z=sc.nextInt();
          if(x>y && x<z || x>z && x<y ){
              System.out.println("Case "+i+": "+x);
          }else if(y>x && y<z || y>z && y<x ){
               System.out.println("Case "+i+": "+y);
          }else if(z>x && z<y || z>y && z<x ){
               System.out.println("Case "+i+": "+z);
          }
      }
     
     
    }
    
}
