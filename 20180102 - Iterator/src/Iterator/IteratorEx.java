package Iterator;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

	public static void main(String[] args) {
		// 정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		v.add(5); // 5 삽입
		v.add(4); // 4 삽입
		v.add(-1); // -1 삽입
		v.add(2,100); // 4와 -1사이에 정수 100 삽입
		
		// Iterator를 이용한 모든 정수 출력하기
		Iterator<Integer> it = v.iterator(); // Iterator 객체 얻기
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		// Iterator를 이용하여 모든 정수 더하기
		int sum = 0;
		it = v.iterator(); // Iterator 객체 얻기
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : "+sum);

	}

}
