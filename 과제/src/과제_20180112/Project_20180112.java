package 과제_20180112;

public class Project_20180112 {
	
	/* sql 과제
	 1. student 테이블을 생성하시오. 모든 항목 
		id varchar(10)
		name varchar(20)
		department varchar(30)
		address varchar(50)

	create table student
	(
	    id varchar(10),
	    name varchar(20),
	    department varchar(30),
	    address varchar(50)
	);


	2. student 테이블에 데이트를 입력하시오.
		20160001 홍길동 컴퓨터공학과 서울시 영등포구
		20162233 이순신 멀티미디어학과 부산시 남구
		20161177 왕건 멀티미디어학과 강원도 삼척시
	
	insert into student values (220160001, '홍길동', '컴퓨터공학과', '서울시 영등포구');
	insert into student values (220162233, '이순신', '멀티미디어학과', '부산시 남구');
	insert into student values (220161177, '왕건', '멀티미디어학과', '강원도 삼척시');


	3. 학번,이름,학과를 출력하시오.
	
	select id, name, department from student;


	4. 컴퓨터공학과 학생만 출력하시오.

	select id, name, department, address from student where department = '컴퓨터공학과';


	5. 서울시에 사는 학생만 출력하시오.
	
	select id, name, department, address from student where address like '서울시%';


	6. 멀티미어학과 학생중 강원도에 사는 학생만 출력하시오.
	
	select id, name, department, address
	from student
	where address like '강원도%'
	and department = '멀티미디어학과';


	7. 학번순으로 정렬해서 출력하시오. 오름차순
	
	select * from student 
	order by id;


	8. 이름순으로 정렬해서 출력하시오. 내림차순
	
	select * from student 
	order by name desc;
	
	
	
	9. 학과별, 학번별로 정렬해서 출력하시오. 모두 오름차순.

	select * from student
	order by department asc, id asc;


	
	10. student2 테이블을 만들고, 데이터를 입력해서
		20160021 김유식 컴퓨터공학과 인천시 북구
		20162288 을지문덕 멀티미디어학과 제주시 남구
		20161177 이황 멀티미디어학과 서울시 강남구
		student, student를 합쳐서 서울시에 사는 사람을 출력하시오.
		
	create table student2
	(
	    id varchar(10),
	    name varchar(20),
	    department varchar(30),
	    address varchar(50)
	);

	insert into student2 values (220160021, '김유식', '컴퓨터공학과', '인천시 북구');
	insert into student2 values (220162288, '을지문덕', '멀티미디어학과', '제주시 남구');
	insert into student2 values (220161177, '이황', '멀티미디어학과', '서울시 남구');

	select id, name, department, address 
	from student 
	where address like '서울시%'
	union all
	select id, name, department, address
	from student2
	where address like '서울시%';
	*/
	
}
