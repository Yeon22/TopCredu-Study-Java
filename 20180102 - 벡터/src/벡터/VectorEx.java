package 벡터;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		//정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5); // 5 삽입
		v.add(4); // 4 삽입
		v.add(-1); // -1 삽입
		
		//벡터 중간에 삽입하기
		v.add(2,100); // 4와 -1 사이에 정수 100 삽입
		
		System.out.println("벡터 내의 요소 객체 수 : "+v.size());
		System.out.println("벡터의 현재 용량 : "+v.capacity());
		
		//모든 요소 정수 출력하기
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		//벡터 속의 모든 정수 더하기
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : "+sum);
	}

}
