package SQL;

public class 수업_20180115 {
	
	/*
	
	insert into student (name, department, address) values ('아무개', '프로그래밍학과', '구로구 구로동');
	select * from student;

	select NVL(id, '00000000'), name
	from student;

	select DECODE(id, '220160001', '1', '2'), name
	from student;

	select first_name, department_id,
	        DECODE(department_id, '10', 'Team-1', '20', 'Team-2', '30', 'Team-3', 'N/A') "TEAM"
	from employees
	where department_id <50 order by first_name;

	select first_name, department_id, 
	        case when department_id between 10 and 50 then 'Team-1'
	             when department_id between 60 and 100 then 'Team-2'
	            when department_id between 110 and 150 then 'Team-3'
	            else 'N/A'
	        end "TEAM"
	from employees;

	select count(*), count(commission_pct)
	from employees;

	select count(*), sum(salary)
	from employees;

	select count(*), sum(salary), avg(salary)
	from employees;

	select max(salary), min(salary), max(hire_date), min(hire_date)
	from employees;

	select department_id, count(*), sum(salary)
	from employees
	group by department_id;

	select department_id, job_id, count(*), sum(salary)
	from employees
	group by department_id, job_id
	order by 1,2;

	select department_id, count(*), sum(salary)
	from employees
	having sum(salary) > 20000
	group by department_id;

	select department_id, job_id, count(*), sum(salary)
	from employees
	where department_id > 50
	group by rollup(department_id, job_id);

	select department_id, job_id, count(*), sum(salary)
	from employees
	where department_id > 50
	group by cube(department_id, job_id);

	select department_id, manager_id, count(*)
	from employees
	where department_id > 100
	group by grouping sets(department_id, manager_id);



	--카티션곱 Cross Join 조인에 조건이 없다.
	--크로스 조인
	select employees.first_name, departments.department_name
	from employees cross join departments;

	--join 이큐조인
	--표준sql문법, ANSI SQL문법
	select employees.first_name, departments.department_name
	from employees join departments
	on employees.department_id = departments.department_id;

	select e.first_name, d.department_name
	from employees e join departments d
	on e.department_id = d.department_id;

	--비표준문법, 많이쓰인다. EQUI조인(이큐조인)
	select e.first_name, d.department_name
	from employees e, departments d
	where e.department_id = d.department_id;

	--조인조건 추가, and를 where로 바꿔도 정상 작동
	select employees.first_name, departments.department_name
	from employees join departments
	on employees.department_id = departments.department_id
	and employees.department_id = 110;

	select employees.first_name, departments.department_name
	from employees join departments
	on employees.department_id = departments.department_id
	where employees.department_id = 110 or employees.department_id = 90;

	--비표준문법, 조인과 조건추가
	select e.first_name, d.department_name
	from employees e, departments d
	where e.department_id = d.department_id
	and e.department_id = 110;


	select e.first_name, d.department_name, j.job_title
	from employees e join departments d
	on e.department_id = d.department_id
	join jobs j
	on e.job_id = j.job_id;

	--Non-Equi join
	drop table student;

	create table student(
	    no NUMBER,
	    name VARCHAR2(15),
	    subject_id NUMBER,
	    score NUMBER
	);

	create table grade(
	    grade char(4),
	    min_score number,
	    max_score NUMBER
	);

	create table subject(
	    subject_id NUMBER,
	    subject_name VARCHAR2(30)
	);

	insert into subject values (10, 'Computer Engineering');
	INSERT INTO subject VALUES (20, 'Music');
	INSERT INTO subject VALUES (30, 'English');
	INSERT INTO subject VALUES (40, 'History');
	INSERT INTO subject VALUES (50, 'Math');

	select * from subject;

	COMMIT;

	INSERT INTO student VALUES (1000, 'JAMES', 10, 98);
	INSERT INTO student VALUES (1000, 'FORD', 10, 91);
	INSERT INTO student VALUES (1000, 'ALLEN', 20, 89);
	INSERT INTO student VALUES (1000, 'STEVE', 34, 83);
	INSERT INTO student VALUES (1000, 'MILLER', 40, 78);

	select * from student;

	INSERT INTO grade VALUES ('A+', 96, 100);
	INSERT INTO grade VALUES ('A0', 90, 95);
	INSERT INTO grade VALUES ('B+', 86, 89);
	INSERT INTO grade VALUES ('B0', 80, 85);
	INSERT INTO grade VALUES ('C+', 76, 79);
	INSERT INTO grade VALUES ('C0', 70, 75);
	INSERT INTO grade VALUES ('D+', 66, 69);
	INSERT INTO grade VALUES ('D0', 60, 65);
	INSERT INTO grade VALUES ('F', 0, 59);

	select * from grade;

	delete grade
	where grade = 'F';

	--Non EQUI Join
	select s.name, b.subject_name, g.grade
	from student s join subject b
	on s.subject_id = b.subject_id
	join grade g
	on s.score between g.min_score and g.max_score;

	--OUTER JOIN
	select s.name, b.subject_name
	from student s right outer join subject b
	on s.subject_id = b.subject_id;

	select s.name, b.subject_name
	from student s left outer join subject b
	on s.subject_id = b.subject_id;

	select s.name, b.subject_name
	from student s full outer join subject b
	on s.subject_id = b.subject_id;

	*/

}
