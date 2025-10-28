class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        ArrayList<Integer> ac=new ArrayList<>();
        for(int i=0;i<=arr.length-k;i++){
            boolean check=true;
           // int x=0;
            for(int j=i;j<i+k;j++){
              //  x=j;
                if(arr[j]<0){
                    check=false;
                    ac.add(arr[j]);
                    break;
                    
                }
            }
            if(check)ac.add(0);
        }
        return ac;
    }
}