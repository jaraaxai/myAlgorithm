package myAlgorithm;
public class BinarySearch{
    public static void main(String args[]) 
    { 
        int arr[] = {2, 3, 4, 10, 40}; 
        int n = arr.length; 
        int x = 10; 

        int result = binarySearch(arr,0,n-1,x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " +  
                                                 result); 

        int result2 = binarySearch(arr, x); 
        if (result2 == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at " +  
                                   "index " + result2); 

    } 

    //Recursive
    public static int binarySearch(int arr[], int l, int r, int x){
        if(l <= r){
            int mid = l + ( r - 1/2 );
            if(arr[mid] == x){
                return mid;
            }

            if(arr[mid] < x){
                return binarySearch(arr, mid+1, r, x);
            }
            return binarySearch(arr, l, mid-1, x);
        }

        return -1;
    }

    //Iterative
    public static int binarySearch(int[] arr, int x){
        int l = 0;
        int r = arr.length - 1;
        while(l <= r){
            int mid = l + (r - 1)/2;
            
            if(arr[mid] == x)
                return mid;
            
            if(arr[mid] < x){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        
        return -1;
    }

    
}