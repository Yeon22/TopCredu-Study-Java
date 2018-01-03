package 학생성적컬렉션;

import java.util.Scanner;

public class CStudent {
	private CInfo m_tStudent;
	Scanner sin = new Scanner(System.in);
	
	CStudent(){
		m_tStudent = new CInfo();
	}
	
	//학생정보입력
	public void Input() {
		System.out.print("이름 입력 : ");
		m_tStudent.strName = sin.nextLine();
		System.out.print("국어 입력 : ");
		m_tStudent.iKor = Integer.parseInt(sin.nextLine());
		System.out.print("영어 입력 : ");
		m_tStudent.iEng = Integer.parseInt(sin.nextLine());
		System.out.print("수학 입력 : ");
		m_tStudent.iMath = Integer.parseInt(sin.nextLine());
	}
	
	//학생정보출력
	public void Output() {
		System.out.print(m_tStudent.strName+"\t"+m_tStudent.iKor+"\t"+m_tStudent.iEng);
		System.out.println("\t"+m_tStudent.iMath+"\t"+m_tStudent.iTotal+"\t"+m_tStudent.fAver);
	}
	
	//합계 및 평균 구해주는 함수
	public void Sum() {
		m_tStudent.iTotal = m_tStudent.iKor+m_tStudent.iEng+m_tStudent.iMath;
		m_tStudent.fAver  = (float)m_tStudent.iTotal/3.0f;
	}
	
	public CInfo GetInfo() {
		return m_tStudent;
	}
	
}
