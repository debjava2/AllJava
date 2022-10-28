import java.util.*;

public class FindNumberForSum {
	
	public static void main(String[] args) {
		System.out.println(FindNumberForSum.getAns());
	}
public static Map<Integer, Integer> getAns() {
	int arr[]= {2,3,7,4,8};
	int target=7;
	Map<Integer,Integer> map=new HashMap<>();
	Map<Integer,Integer> ans=new HashMap<>();
	int delta=0;
	for(int i=0;i<arr.length;i++) {
		delta=target-arr[i];
		if(map.containsKey(delta)) {
			 ans.put(i, map.get(delta));
			 return ans;
			
		}else {
			map.put(arr[i], i);
		}
	}
	return ans;
}
}
