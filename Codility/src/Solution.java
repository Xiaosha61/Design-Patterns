import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
    	ArrayList<Integer> newer = new ArrayList<Integer>();
    	Integer anInt;
    	int index=0;
    	int i;
    	
    	for(i=0; i<A.length; i++){
    		anInt = new Integer(A[i]);
    		if(!newer.contains(anInt)){
    			newer.add(anInt);
    			index=i;
    		}
     	}
  		return index;

    }
}