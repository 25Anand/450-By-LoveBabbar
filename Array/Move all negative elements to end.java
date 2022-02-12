class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int m=0;
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>=0)
                temp[m++]=arr[i];
        }
        if(m==n||m==0)
            return;
            
        for(int i=0;i<n;i++){
            if(arr[i]<0)
                temp[m++]=arr[i];
                
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}
