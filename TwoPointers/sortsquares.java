package TwoPointers;
import java.util.*;
public class sortsquares 
{
public static int[] SquareSort(int arr[])
{

    int len=arr.length;
    int ans[]=new int[len];
    int first=0;
    int last=len-1;
    int i=0;

    while(first<=last)
    {

        if(Math.abs(arr[first])>Math.abs(arr[last]))
        {
           
            ans[i++]=(int)Math.pow(arr[first],2);
            first++;

        }
        else
        {
            ans[i++]=(int)Math.pow(arr[last],2);
            last--;

        }
    }
    return ans;


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
        int[] ans=SquareSort(arr);
        for(int i=0;i<size;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    
}
