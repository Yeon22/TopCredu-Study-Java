package 과제풀이_3일차;

public class test4 {

	public static void main(String[] args) {
		int x = 8;
		int y = 3;
		int result = 
				x++ 
				+ (--y)
				- (++x)
				+ (--x)
				+ (y++);
		
		System.out.println( result);

	}

}
