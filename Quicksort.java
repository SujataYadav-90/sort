/*
 * This program is done by Quicksort algorithm.
 * It selects one element as pivot element.
 * Arranges all smaller elements to the left of pivot element.
 * Arranges all greater elements to the right of pivot element.
 */public class QuickSort {  
public static void main(String[] args) {  
        int i;  
        int[] arr={100,23,110,75,69,34,78,34};  
        quickSort(arr, 0, 9);  
        System.out.println("\n The sorted array is: \n");  
        for(i=0;i<10;i++)  
        System.out.println(arr[i]);  
    }  
    public static int partition(int a[], int beg, int end)  
    {  
          
        int left, right, temp, loc, flag;     
        loc = left = beg;  
        right = end;  
        flag = 0;  
        while(flag != 1)  
        {  
            while((a[loc] <= a[right]) && (loc!=right))  
            right--;  
            if(loc==right)  
            flag =1;  
            else if(a[loc]>a[right])  
            {  
                temp = a[loc];  
                a[loc] = a[right];  
                a[right] = temp;  
                loc = right;  
            }  
            if(flag!=1)  
            {  
                while((a[loc] >= a[left]) && (loc!=left))  
                left++;  
                if(loc==left)  
                flag =1;  
                else if(a[loc] <a[left])  
                {  
                    temp = a[loc];  
                    a[loc] = a[left];  
                    a[left] = temp;  
                    loc = left;  
                }  
            }  
        }  
        return loc;  
    }  
    static void quickSort(int a[], int beg, int end)  
    {  
          
        int loc;  
        if(beg<end)  
        {  
            loc = partition(a, beg, end);  
            quickSort(a, beg, loc-1);  
            quickSort(a, loc+1, end);  
        }  
    }  
}  
