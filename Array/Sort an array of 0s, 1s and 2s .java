SOLUTION--1:

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        Arrays.sort(a);
    }
}

SOLUTION---2:
    class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        // Arrays.sort(a);
        int low=0, mid=0, end=n-1;
        while(mid<=end){
            if (a[mid]==0){
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                    low++;
                    mid++;
                
            }
            else if(a[mid]==1){
                    mid++;
            }
            else{
                    int temp=a[end];
                    a[end]=a[mid];
                    a[mid]=temp;
                    end--;
            }
        }
    }
}
