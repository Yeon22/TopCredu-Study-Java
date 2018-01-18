package SQL;

public class 수업_20180111 {
	
	/*
	 
	--DESC 명령어로 구조부터 파악하기
	DESC employees;  --특정 테이블에 어떤 칼럼이 있는지 조회 DESC


	--데이터베이스에서 조회를 하는방법들을 배워나간다.


	--SELECT 명령어로 데이터를 조회합니다.


	--컬럼들을 조회할 수 있다.


	--select [컬럼명 또는 표현식] from [테이블명 또는 뷰 명];
	select employee_id from employees; 

	select * from employees; --* 모든걸 조회해라


	--직원아이디랑 email를 검색하시오.
	select employee_id,email from employees;

	select employee_id , first_name , last_name

	from employees;


	--리터럴 문자 이용해보기 숫자면 정수 1~100  문자나 문자열 'A' "안녕"
	select employee_id , first_name ,'안녕하세요'

	from employees;


	--출력 할 때 컬럼에 별명을 사용할수 있다. 디비에서 사용하는 SQL 디비용 프로그래밍언어다.
	select employee_id "직원명" , first_name AS "성"

	from employees;

	select first_name , last_name from employees;


	--연결 연산자로 컬럼들을 붙인다.
	select first_name || last_name from employees; --데이터를 합쳐서 가지고 왔다.

	select first_name ||' '|| last_name from employees;

	select department_id from employees;



	--중복된 값을 제거하고 출력하기
	select distinct department_id from employees;

	*/

}
