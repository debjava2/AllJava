@FunctionalInterface
interface College {
	int marks(int a,int b);
}
public class ParametirizeLamdsExp {
	
	public static void main(String[] args) {
		College college=(int a,int b)->{
			int c=a+b;
			return c;
		};
		System.out.println(college.marks(10,5));
	}
}
