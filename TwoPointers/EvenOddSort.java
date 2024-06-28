package TwoPointers;
import java.util.*;
public class EvenOddSort
{
    public static void EvenOddFront(int arr[])
    {  int len=arr.length;
       int first=0;
       int last=len-1;
    while(first<last)
    {

      if(arr[first]%2 !=0 && arr[last]%2==0)
        {
            swap(arr, first , last);
            first++;
            last--;
        }

        if(arr[first]%2==0)
        {
            first++;
        }
        if(arr[last]%2!=0)
        {
            last--;
        }
 }
    
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
}
   

 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements of array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        EvenOddFront(arr);
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    }

