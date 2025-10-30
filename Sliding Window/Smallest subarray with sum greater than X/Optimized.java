// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int WindowStart=0;
        int WindowEnd=0;
        int len=0;
        boolean check=true;
        int Length=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            WindowEnd=i;
            sum+=arr[i];
            if(sum>x){
                check=false;
                while(sum>x && WindowEnd>=WindowStart){
                   len= WindowEnd-WindowStart+1;
                   Length=Math.min(Length,len);
                  sum-=arr[WindowStart];
                   WindowStart++;
                   
                }
            }
        }
        if(check) return 0;
        return Length;
        
    }
}
