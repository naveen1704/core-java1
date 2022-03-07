class EvenOddArray {
    
    public static void main (String args []) {
        
         int sum=0 , even=0, odd=0;
         
         int arr[] = { 10, 15,25,30 ,5,20};
         
         for (int i=0 ; i<arr.length;i++)
         {
             if ( i%2==0)
              even+=arr[i];
              
              else 
              
              odd+=arr[i];
              
         }
          System.out.println("sum of the even array is:"+even);
          System.out.println("sum of the odd array is:" +odd);
          
    }
}