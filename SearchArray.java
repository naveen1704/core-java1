
import java.util.Scanner;
class SearchArray{
    
    public static void main(String args[]){
      
      int arr[]={12,34,43,24,56,27};
      
      Scanner s=new Scanner(System.in);
      System.out.println("Enter search element");
      int key=s.nextInt();   
         int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println("Yes, the element is present in array");
        }
        else{
            System.out.println("No, Element is not found");
        }
        
           
    }
}