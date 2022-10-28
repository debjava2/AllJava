import java.util.ArrayList;

public class First10PrimeNumber {
public static void main(String[] args) {
	
	int co=20;
	ArrayList list=new ArrayList();
	for(int i=1;i<20 ;i++) {
		int count =0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count<=2) {
			list.add(i);
		}
	}
	System.out.println(list);
}
}
