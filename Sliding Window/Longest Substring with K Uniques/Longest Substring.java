class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> hq=new HashMap<>();
        int WindStart=0;
        int length=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            hq.put(x,hq.getOrDefault(x,0)+1);
            while(hq.size()>k){
                char y=s.charAt(WindStart);
                hq.put(y,hq.getOrDefault(y,0)-1);
                if(hq.get(y)==0)hq.remove(y);
                WindStart++;
            }
             if(hq.size()==k)length=Math.max(length,i-WindStart+1);
           
        }
        return (length==Integer.MIN_VALUE)?-1:length;
    }
}