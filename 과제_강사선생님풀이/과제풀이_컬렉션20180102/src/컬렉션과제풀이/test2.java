package 컬렉션과제풀이;

import java.util.Vector;

public class test2 {

	public static void main(String[] args) {
//		3. Vector로 1에서 10까지 수를 담고 짝수만 출력하시오.
		
		Vector<Integer> vec  = new Vector<Integer>(); 
		
		for(int i =0; i<=10;i++) {
			vec.add(i);
		}
		
		for(int i =0; i<vec.size(); i++)
		{
			if(i%2==0)
			{
				System.out.println(vec.get(i));
			}
		}
	}

}
