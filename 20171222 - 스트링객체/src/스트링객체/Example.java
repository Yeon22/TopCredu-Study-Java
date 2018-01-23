package 스트링객체;

public class Example {

	public static void main(String[] args) {
		String s = "홍길동";
		String str = new String("이순신");
		
		System.out.println(s);
		System.out.println(str);
		
		String a = "             hello world             ";
		//문자열의 갯수
		System.out.println(a.length());
		
		String s1 = a.trim(); //앞뒤 공백 제거
		System.out.println(s1.length());
		
		String filename = "movie.jpg";
		
		for(int i=0; i<filename.length(); i++) {
			if(filename.charAt(i)=='.') {
				System.out.println("점의 위치 : "+i);
			}
		}
		
		//상품코드, f00001(f: food) e001(e: electronic)
		String goodsCode = "f00001";
		if(goodsCode.charAt(0)=='f') {
			System.out.println("food입니다.");
		} else if(goodsCode.charAt(0)=='e') {
			System.out.println("electronic입니다.");
		}
		
		// "f0001" f->l
		String goodsCode2 = goodsCode.replace("f", "l");
		System.out.println(goodsCode2);
		
		System.out.println(filename.replace("jpg", "gif"));
		System.out.println(filename);
		
		String id = "hkd";
		String name = "홍길동";
		String job = "의적";
		
		String data = id+","+name+","+job;
		System.out.println(data);
		
		String result[] = data.split(",");
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
		String result2[] = filename.split("\\.");
		for(int i=0; i<result2.length; i++) {
			System.out.println(result2[i]);
		}
		
		//주민등록번호에서 뒷부분 구하기
		String jumin = "123456789";
		System.out.println(jumin.substring(6));
		//주민등록번호 생일 가져오기
		System.out.println(jumin.subSequence(0, 6)); // 0~5까지 가져와진다.
		
		String text = "abcd";
		System.out.println(text.toUpperCase());
		String text2 = "ABCD";
		System.out.println(text2.toLowerCase());
		
		//문자열 역순으로 출력하기
		StringBuffer text3 = new StringBuffer("abcd");
		System.out.println(text3.reverse());
		
	}

}
