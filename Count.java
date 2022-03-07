import java.util.Scanner;

class Count {
    
    public static void main ( String [] args) {
        
        Scanner s= new Scanner (System.in);
        System.out.println("Enter the digits");
        int Num = s.nextInt();
         int count=0;
        for(int i=1; i<=Num ;i++)
        {
            Num=Num/10;
            count++;
        }
          System.out.println(count); 
    }
} 