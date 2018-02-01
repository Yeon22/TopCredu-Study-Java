package SQL_Oracle;

public class 수업_20180122 {
	
	/*
	 * --기본키와 참조키
		create table test_table
		(
		    id number(10) primary key, --중복불가, 반드시 입력
		    test_name varchar2(20),
		    email varchar2(10),
		    str varchar2(20)
		);
		
		create table test2_table
		(
		    test2_id number not null,
		    test2_str varchar(20),
		    test2_fk number(10), --외래키
		    foreign key (test2_fk)
		    REFERENCES test_table(id)
		);
		
		desc test2_table;
		
		--테이블 두개가 있으면 
		--기본키로는 id, 그리고 참조키로는 test2_fk라는 칼럼을 지정했고,
		--참조키가 참조하는 값은 references에 명시된 test_table의 id값을 참조합니다.
		
		
		--commit 완전저장
		--rollback 이전으로 돌린다.
		
		commit; --데이터 변경작업을 확정
		insert, update, delete 등
		
		rollback --변경작업 취소
		
		auto commit 자동으로 커밋(무조건 커밋이 되기 때문에 rollback 하기가 까다로울 수 있다.)
		
		
		ddl -> create, alter, drop
		dml -> select, insert, update, delete
		tcl -> commit, rollback
		
		tcl -> Transition Control Language
		
		
		foreign key : 외래키
		primary key : 테이블당 1개, 기본키 unique + not null 이 합쳐진 개념이라 보면 된다.
		unique : 중복되지 않게
		
		
		procedure의 장점
		1. 처음 실행시 컴파일 후 실행계획을 저장해서 재사용.
		    두번째 실행부터 컴파일하지 않고 바로 실행됨.
		    => 실행 속도가 빠르다.
		    
		2. 긴 내용의 쿼리가 서버에 저장되고, 실행시 이름을 호출하면 됨.
		    => 네트워크 트랙픽 감소
		    
		3. 주요 로직을 프로시져로 생성하면 보안에도 유리
		    => 보안성 비교적 높다.
		
		
		
		desc student;
		
		create table bookrent
		(
		    id varchar(10) not null,
		    title varchar(20) not null,
		    rdate char(8) not null
		);
		
		insert into bookrent values ('2015000002', 'java기초', '20161227');
		insert into bookrent values ('1234512346', '오라클기초', '20161201');
		insert into bookrent values ('1234$12345', 'c++기초', '20161202');]
		insert into bookrent values ('2018000001', 'C#기초', '20151208');
		insert into bookrent values ('2018000002', 'python기초', '20161128');
		insert into bookrent values ('2018000004', 'ruby기초', '20151231');
		
		select * from student;
		
		select * from bookrent;
		
		--학생명, 책제목, 대출일 (join)
		select student.name, bookrent.title, bookrent.rdate
		from student join bookrent
		on student.id = bookrent.id
		where student.department_id = 'A002'
		order by student.name;
		
		--A002 (컴퓨터시스템)
		--R0013 (멀티미디어)
		--R0012 (컴퓨터공학)
		
		commit;
		
		select student.name, bookrent.title, bookrent.rdate
		from student join bookrent
		on student.id = bookrent.id;
		
	 */

}
