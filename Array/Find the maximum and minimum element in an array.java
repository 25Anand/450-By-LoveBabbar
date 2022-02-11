class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        Arrays.sort(a);
        long min=Integer.MIN_VALUE;
        long max=Integer.MAX_VALUE;
        min=a[0];
        max = a[a.length-1];
        pair output=new pair(min,max);
       return output;
        
    }
