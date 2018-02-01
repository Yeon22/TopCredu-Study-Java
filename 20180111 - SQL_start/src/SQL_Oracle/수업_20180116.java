package SQL_Oracle;

public class 수업_20180116 {

	/*
	 * --SELF JOIN(재귀조인)
		select a.employee_id "사원번호", a.first_name "부하직원이름",
		        b.employee_id "상사사번", b.first_name "상사이름"
		from employees a join employees b
		on a.manager_id = b.employee_id
		and a.department_id > 80;
		
		
		--Sub Query(서브쿼리)
		select employee_id, first_name, salary
		from employees
		where salary < (select salary from employees where first_name = 'Donald');
		
		select employee_id, first_name, salary
		from employees
		where salary = (select salary from employees where first_name = 'Donald');
		
		select employee_id, first_name, salary, hire_date
		from employees
		where hire_date >= (select hire_date from employees where first_name = 'Donald');
		
		select e.employee_id, e.first_name, e.hire_date, d.department_name
		from employees e join departments d
		on e.department_id = d.department_id
		and hire_date = (select hire_date from employees where first_name = 'Donald');
		
		select first_name, salary
		from employees
		where salary > (select avg(NVL(salary,0)) from employees where department_id = 100);
		
		-- >ANY(최소값 반환), <AMY(최대값 반환), <ALL(최소값 반환), >ALL(최대값 반환)
		select first_name, salary
		from employees
		where salary > ALL (select salary from employees where department_id = 110);
		
		select department_id, first_name, salary
		from employees
		where (department_id, salary) IN (select department_id, MAX(salary) from employees group by department_id)
		order by 1;
		
		select first_name "사원이름", (select department_name from departments d where e.department_id = d.department_id) "부서이름"
		from employees e;
		
		
		--avg평균 구할 때 null값 빼고 구해주는게 좋다.
		--계산이 달라질 수 있다.
		--100 + 200 + null/3
		--100 + 200 + 0/3
		
		
		--from절 서브쿼리
		select A.department_id , B.first_name , A.salary
		from (select department_id , max(salary) as salary
		      from employees
		      group by department_id) A join employees B
		on A.department_id = B.department_id
		where A.salary = B.salary;
		
		
		--복습
		select first_name , NVL(salary,0) as salary 
		from employees;
		
		select first_name , department_id,
		    case department_id when 10 then '총무부'
		                        when 20 then '인사부'
		                        when 30 then '개발부'
		                        else '미배정'
		    end "부서"
		from employees;
		
		select first_name , department_id,
		    decode(department_id, 10, '총무부', 20, '인사부', 30, '개발부', '미배정') as "부서"
		from employees;
		
		select first_name, department_id,
		case when department_id between 10 and 30 then '전자사업'
		     when department_id between 40 and 50 then '바이오'
		     when department_id between 60 and 70 then '개발부'
		     else '미배정'
		end "부서"
		from employees;
		
		--전체 종업원 수 구하기
		select count(*) as "종업원 수" from employees;
		
		--연봉 합계
		select sum(salary) as "연봉 총액" from employees;
		
		--연봉 평균
		select avg(salary) as "연봉 평균" from employees;
		
		--최고 연봉
		select max(salary) as "최고 연봉" from employees;
		
		--부서별 총원
		select department_id, count(*) as "총원"
		from employees
		group by department_id;
		
		--부서별 연봉합계
		select department_id, sum(salary) as "연봉합계"
		from employees
		group by department_id;
		
		--부서별 연봉평균
		select department_id, avg(salary) as "연봉평균"
		from employees
		group by department_id;
		
		--부서별 최고연봉
		select department_id, max(salary) as "최고연봉"
		from employees
		group by department_id;
		
		--부서별 최저연봉
		select department_id, min(salary) as "최저연봉"
		from employees
		group by department_id;
		
		--부서별 직종별 합계
		select department_id, job_id, sum(salary) as "연봉합계"
		from employees
		group by department_id, job_id;
		
		
		--뷰는 자주사용되는걸 미리 만들어서 사용한다.
		--조인이 심해지거나 복잡한 자주 사용되는 쿼리를 뷰를 통해서 효과가 좋다.
		--네트워크 트래픽을 줄일 수 있다. 성능이 향상
		--뷰는 가상의 출력물 분신술
		create view view1
		as
		select first_name, salary, department_id
		from employees;
		
		select first_name, salary from view1;
		
		select first_name, salary from employees;
		
		--네트워크 트래픽 감소
		--view
		--stored procedure => 함수처럼 호출해서 사용
		--보안에도 좋다.(읽기 전용이기 때문에)
		
		--복합 view
		create view view2
		as 
		select subject.subject_name, student.name
		from subject join student
		on subject.subject_id = student.subject_id;
		
		select * from view2;
		
		
		--시퀀스 자동증가
		create table board
		(
		    no number not null,
		    title varchar(20) not null,
		    writer varchar(20) not null,
		    wDate char(8) not null
		);
		
		--시퀀스 만들기
		create sequence board_no
		increment by 1
		minvalue 0
		start with 0;
		
		insert into board values (board_no.nextval, '오라클은 무엇입니까?', '홍길동', '20161221');
		
		select * from board;
		
		insert into board values (board_no.nextval, 'sql이란?', '이순신', '20161221');
		
		--시퀀스 삭제
		drop sequence board_no;
		
		
		--테이블 delete drop
		delete board; --내용만 날라가고 테이블은 남는다. commit전에는 rollback으로 복구가능.
		
		drop table board; --테이블까지 전부 날라감.
		
		--테이블 복사
		create table employees2
		as
		select * from employees;
		
		select * from employees2;
		
		--테이블의 구조만 가져오고 데이터 안 가져오기
		create table employees3
		as
		select * from employees
		where 1 = 2;
		
		select * from employees3;
		
		
		--DML (Data Manipulation Language)
		--데이터 처리 언어
		--select(검색), insert(입력), update(수정), delete(삭제)
		
		--DDL (Data Definition Language)
		--데이터 정의 언어
		--create(생성), alter(수정), drop(삭제)
		
		--DCL
		
		select * from student;
		
		--수정
		update student
		set score = 100, name = '홍길동'
		where name = 'JAMES';
		
		--삭제
		delete from student --from은 붙여도 되고 생략해도 된다.
		where name = '홍길동';

	 */
	
}
