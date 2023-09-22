//10783	Odd Sum

import java.util.Scanner;

public class Main {

  
    public static void main(String[] args){
      int x;
      int sum;
      
      Scanner sc = new Scanner(System.in);
      x=sc.nextInt();
      for(int i=1;i<=x;i++){
          int a=sc.nextInt();
          int b=sc.nextInt();
          if(a%2==0){
              a+=1;
              
          }
          sum=0;
          for(int j=a;j<=b;j+=2){
              sum+=j;
          }
          System.out.printf("Case %d: %d\n",i,sum);
          
      }
		
    }
    
}
