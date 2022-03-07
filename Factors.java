import java.util.Scanner;

class Factors {
    
    public static void mian ( String []) {
    
    Scanner s = new Scanner(System.in);
      System.out.println("enter n values");
      int n = s.nextInt();
      
      for ( int i=1;i<=0;i++ ) {
          
          if (n%i==0)
          {
              System.out.print(i+" ");
          }
      }
}
}