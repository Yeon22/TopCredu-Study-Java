package 과제_20180117;

public class Project_20180117 {
	
	/*
	 * 1. employees에서 전화번호를 515-333-444 형식으로 출력하시오.
    	select replace(phone_number, '.', '-') "전화번호"
    	from employees;
    
    
		2. 2005년에 입사한 직원들을 출력하시오.
    	select first_name, hire_date
    	from employees
    	where hire_date between '2005/01/01' and '2005/12/31'
    	order by hire_date;

	3. manager별로 부하직원 숫자를 카운트 하시오.
    	select manager_id, count(*) "부하직원 수"
    	from employees
    	group by manager_id;

	4. 3번의 결과에서 부하직원 숫자가 3명 이상인 경우만 출력하시오.
    	select manager_id, count(*)
    	from employees
    	having count(*) >= 3
    	group by manager_id
    	order by manager_id;

	5. 직원명, 근무하는 국가명을 출력하시오. => 몇개의 테이블을 조인해야 할지 고민해보세요.
    	select e.first_name, e.last_name, c.country_name
    	from employees e join departments d
    	on e.department_id = d.department_id
    	join locations l
    	on d.location_id = l.location_id
    	join countries c
    	on l.country_id = c.country_id;
	 */

}
