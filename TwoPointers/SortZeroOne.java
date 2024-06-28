package TwoPointers;


import java.util.*;
public class SortZeroOne 
{

    public static void SortZeroOnes(int arr[])
    {
        int len=arr.length;
        int left=0;
        int right=len-1;
        while(left<right)
        {
    if(arr[left]==1 && arr[right]==0)
    {
        swap(arr,left,right);
        left++;
        right--;
    }
    if(arr[left]==0)
    {
        left++;
        }
        if(arr[right]==1)
        {
            right--;
            }
}
    }
   public static void swap(int arr[],int i, int j)
   {
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
    //     for(int i=0;i<size;i++)
    //     {
    //         if(arr[i]==0)
    //         {
    //             count++;
    //         }
    //     }
    
    //     for(int i=0;i<count;i++)
    //     {
    //         if(i<count)
    //         {
    //          arr[i]=0;
    //         }
        
    //     else{
    //          arr[i]=1;
    //     }
    // }
         SortZeroOnes(arr);

        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+ " ");
        }

 

        
        
    }
    
}
