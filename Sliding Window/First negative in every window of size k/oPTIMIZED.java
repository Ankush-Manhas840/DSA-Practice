class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        ArrayList<Integer> ac =new ArrayList<>();
        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]<0)dq.addLast(i);
            if(!dq.isEmpty() && dq.peekFirst()<i-k+1){
                dq.removeFirst();
            }
            if(i>=k-1){
                if(!dq.isEmpty()){
                    ac.add(arr[dq.peekFirst()]);
                }
                else{
                    ac.add(0);
                }
            }
        }
        return ac;
    }
}