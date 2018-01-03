package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Student{ // 학생을 표현하는 클래스
	int id;
	String tel;
	
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
}

public class HashMapStudentEx {

	public static void main(String[] args) {
		// 학생 이름과 Student 객체를 쌍으로 저장하는 HashMap 컬렉션 생성
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		// 3명의 학생 저장
		map.put("황기태", new Student(1, "010-111-1111"));
		map.put("한원선", new Student(2, "010-222-2222"));
		map.put("이영희", new Student(3, "010-333-3333"));
		
		System.out.println("HashMap의 요소 개수 : "+map.size());
		
		// 모든 학생 출력, map에 들어 있는 모든 (key, value) 쌍 출력
		// key 문자열을 가진 집합 Set 컬렉션 리턴
		Set<String> names = map.keySet();
		
		// key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next(); // 다음 키. 학생 이름
			Student student = map.get(name);
			System.out.println(name + " : " + student.id + " : " + student.tel);
		}
	}

}
