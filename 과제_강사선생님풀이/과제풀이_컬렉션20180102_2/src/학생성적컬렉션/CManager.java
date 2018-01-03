package 학생성적컬렉션;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class StudentComparator implements Comparator<CStudent>{
	@Override
	public int compare(CStudent arg0, CStudent arg1) {
		//평균이 큰순서대로 
		return arg0.GetInfo().fAver > arg1.GetInfo().fAver ? -1 :
				(arg0.GetInfo().fAver == arg1.GetInfo().fAver ? 0 :1);
	}
}


public class CManager {
	private Vector<CStudent> m_pVec = new Vector<CStudent>();
	
	static int StudentCount =0;
	
	public void Initialize() {
	}
	
	//매니저 동작하는 함수
	public void Progress() {
		int iInput =0;
		Scanner sin = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.추가 2.삭제 3.출력 4.검색 5.정렬 6.수정 7.종료 : ");
			iInput = sin.nextInt();
			
			if(iInput == 7)
			{
				break;
			}
			
			switch(iInput) 
			{
			case 1:
				//추가함수
				Insert();
				break;
			case 2:
				//삭제함수
				Delete();
				break;
			case 3:
				//출력
				Render();
				break;
			case 4:
				//검색
				Search();
				break;
			case 5:
				//정렬
				Sort();
				break;
			case 6:
				//수정
				Modify();
				break;
			}
		}
	}
	
	void Insert() {
		CStudent s = new CStudent();
		s.Input();
		s.Sum();		
		m_pVec.add(s);
		
		StudentCount++;
	}
	
	void Delete() {
		String strFindName = "";
		System.out.print("검색할 학생의 이름을 입력하세요 : ");
		Scanner sin = new Scanner(System.in);
		strFindName = sin.nextLine();
		
		for(int i =0; i<m_pVec.size();i++) 
		{
			CStudent st = m_pVec.get(i);
			if(st.GetInfo().strName.equals(strFindName)) {
				m_pVec.remove(i);
				break;
			}
		}
	}
	
	void Render() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i =0; i<m_pVec.size(); i++) {
			CStudent st = m_pVec.get(i);
			st.Output();
		}
	}
	
	void Search(){
		String strFindName = "";
		System.out.print("검색할 학생의 이름을 입력하세요 : ");
		Scanner sin = new Scanner(System.in);
		strFindName = sin.nextLine();
		
		for(int i =0; i<m_pVec.size();i++) 
		{
			CStudent st = m_pVec.get(i);
			if(st.GetInfo().strName.equals(strFindName)) {
				st.Output();
				break;
			}
		}
	}
	
	void Sort() {
		//소트
		Collections.sort(m_pVec,new StudentComparator());
	}
	
	void Modify() {
		String strFindName = "";
		System.out.print("검색할 학생의 이름을 입력하세요 : ");
		Scanner sin = new Scanner(System.in);
		strFindName = sin.nextLine();
		
		for(int i =0; i<m_pVec.size();i++) 
		{
			CStudent st = m_pVec.get(i);
			//학생 찾음
			if(st.GetInfo().strName.equals(strFindName)) {
				st.Input();
				st.Sum();
				break;
			}
		}
	}
}
