package SQL_Oracle;

public class 수업_20180117 {
	
	/*
	 * SET SERVEROUTPUT ON; --프로시져 출력 가능하게 해주는 명령어

		DECLARE
		    vno     NUMBER(4);
		    vname   VARCHAR2(10);
		BEGIN
		    SELECT employee_id, first_name INTO vno, vname
		    FROM employees
		    WHERE employee_id = 200;
		    
		    DBMS_OUTPUT.PUT_LINE(vno||' '||vname);
		END;
		
		DECLARE
		    v_empid     employees.employee_id % TYPE;
		    v_salary    employees.salary % TYPE;
		BEGIN
		    SELECT employee_id, salary INTO v_empid, v_salary
		    FROM employees
		    WHERE employee_id = &id;
		    
		    DBMS_OUTPUT.PUT_LINE(v_empid||' == '||v_salary);
		END;
		
		
		create table pl_test
		(
		    no number,
		    name varchar2(10)
		);
		
		create sequence pl_seq;
		
		BEGIN
		    INSERT INTO pl_test VALUES (pl_seq.NEXTVAL, &name);
		END;
		/
		
		select * from pl_test;
		
		commit;
		
		
		create table pl_test2
		(
		    no number,
		    name varchar2(10),
		    addr varchar2(10)
		);
		
		DECLARE
		    v_no NUMBER := '&no';
		    v_name VARCHAR2(10) := '&name';
		    v_addr VARCHAR2(10) := '&addr';
		BEGIN
		    INSERT INTO pl_test2 VALUES (v_no, v_name, v_addr);
		END;
		/
		
		select * from pl_test2;
		
		BEGIN
		    UPDATE pl_test
		    SET name = 'BBB'
		    WHERE no = 2;
		END;
		/
		
		select * from pl_test;
		
		BEGIN
		    DELETE FROM pl_test
		    WHERE no = 2;
		END;
		/
		
		DECLARE
		    vno    employees.employee_id % TYPE;
		    vname  employees.first_name % TYPE;
		    vsal   employees.salary % TYPE;
		BEGIN
		    SELECT employee_id, first_name, salary INTO vno, vname, vsal
		    FROM employees
		    WHERE employee_id = 180;
		    DBMS_OUTPUT.PUT_LINE(vno||'---'||vname||'---'||vsal);
		END;
		/
		
		DECLARE
		    v_row employees % ROWTYPE;
		BEGIN
		    SELECT * INTO v_row
		    FROM employees
		    WHERE employee_id = 180;
		    DBMS_OUTPUT.PUT_LINE(v_row.employee_id||'==='||v_row.first_name||'==='||v_row.salary);
		END;
		/
		
		DECLARE
		    v_empid     employees.employee_id % TYPE;
		    v_ename     employees.first_name % TYPE;
		    v_deptno    departments.department_id % TYPE;
		    v_dname     departments.department_name % TYPE;
		BEGIN
		    SELECT e.employee_id, e.first_name, d.department_id, d.department_name
		    INTO v_empid, v_ename, v_deptno, v_dname
		    FROM employees e, departments d
		    WHERE e.employee_id = 180
		    AND e.department_id = d.department_id;
		    
		    DBMS_OUTPUT.PUT_LINE(v_empid||'---'||v_ename||'---'||v_deptno||'---'||v_dname);
		END;
		/
		
		SET verify OFF
		DECLARE
		    v_no1 NUMBER := &no1;
		    v_no2 NUMBER := &no2;
		    v_sum NUMBER ;
		BEGIN
		    v_sum := v_no1 + v_no2;
		    DBMS_OUTPUT.PUT_LINE('첫번째 수 : '||v_no1||' , 두번째 수 : '||v_no2||' , 합은 : '||v_sum||' 입니다');
		END;
		/
		
		DECLARE
		    TYPE emp_record_type IS RECORD
		    ( emp_id employees.employee_id % TYPE,
		      f_name employees.first_name % TYPE,
		      e_sal  employees.salary % TYPE);
		    v_rec1 emp_record_type;
		BEGIN
		    SELECT employee_id, first_name, salary INTO v_rec1
		    FROM employees
		    WHERE employee_id = 180;
		    DBMS_OUTPUT.PUT_LINE(v_rec1.emp_id||'--'||v_rec1.f_name||'--'||v_rec1.e_sal);
		END;
		/

	 */

}
