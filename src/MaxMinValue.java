
public class MaxMinValue {
    public static void main (String[]arg)
    {
        int arr[]={2,98,107,88,6,3,66};
        int l = arr.length;
        int max =arr[0];
        int min =arr[0];
        System.out.print("Array elements : ");
        for(int i =0;i<=l-1;i++)
        {
            System.out.print(arr[i]+" ");
            if(arr[i]>=max)
                max =arr[i];
            if(arr[i]<=min)
                min =arr[i];
        }
        System.out.println("\nMaximum value is : "+max);
        System.out.println("Minimum value is : "+min);
    }

}
