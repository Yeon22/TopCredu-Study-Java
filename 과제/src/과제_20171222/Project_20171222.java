package 과제_20171222;

public class Project_20171222 {

	public static void main(String[] args) {
//		1.전화번호(010-1234-5678)에서 국번(010)을 추출하시오.
		String phoneNo = "010-1234-5678";
		System.out.println("국번은 "+phoneNo.subSequence(0, 3)+"입니다.");
		
		
//		2.전화번호(010-1234-5678)에서 '-'을 제거하시오.
//		=>01012345678 로 변경하기
		String arr[] = phoneNo.split("-");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		
//		3. 상품코드(E20160001)에서 상품카테고리('E')를 추출하시오.
		String code = "E20160001";
		System.out.println("상품 카테고리 "+code.charAt(0)+"입니다.");
		
		
//		4. 상품코드(E20160001)에서 년도('2016')를 추출하시오.
		System.out.println("년도는 "+code.subSequence(1, 5)+"입니다.");
		
		
//		5. 주소록 문자열을 분리하시오.
//		홍길동,010-1111-2222,hkd@hkd.com
		String name = "홍길동";
		String hPhone = "010-1111-2222";
		String email = "hkd@hkd.com";
		String data = name+","+hPhone+","+email;
		
		String HongArray[] = data.split(",");
		for(int i=0; i<HongArray.length; i++) {
			System.out.println(HongArray[i]);
		}

	}

}
