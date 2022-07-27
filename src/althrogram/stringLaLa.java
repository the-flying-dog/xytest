package althrogram;

import java.util.HashMap;

class stringLala {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        int answer=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int start=0,end=0;end<len;end++){
            Character current=s.charAt(end);
            if(map.containsKey(current)){
                start=Math.max(map.get(current)+1,start);
            }
            map.put(current,end);
            answer=Math.max(end-start+1,answer);
        }
        return answer;
    }
}

