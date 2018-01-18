package 과제_20180118;

public class Project_20180118 {
	
	/*

	-- 1. depart(학과) 테이블을 생성하시오.
	-- 학과ID, 학과명
	create table depart
	(
	    학과ID VARCHAR2(4),
	    학과명 VARCHAR2(20)
	);


	-- 2. student 테이블을 생성하시오.
	-- 학번, 이름, 학과ID
	create table student
	(
	    학번 VARCHAR2(8),
	    이름 VARCHAR2(10),
	    학과ID VARCHAR2(4)
	);


	-- 3. 1번에 다음과 같이 데이터를 입력하시오.
	-- 0001,컴퓨터공학과
	-- 0002,전자공학과
	insert into depart values('0001', '컴퓨터공학과');
	insert into depart values('0002', '전자공학과');


	-- 4. 2번에 다음과 같이 데이터를 입력하시오.
	-- 20150001,홍길동,0001
	-- 20160010,이순신,0002
	insert into student values('20150001', '홍길동', '0001');
	insert into student values('20160010', '이순신', '0002');


	-- 5. student테이블에서 성이 '홍'씨인 사람을 검색하시오.
	select * from student
	where 이름 like '홍%';


	-- 6.다음 항목을 출력하시오.(조인)
	-- 학번, 이름, 학과명
	select s.학번, s.이름, d.학과명
	from student s join depart d
	on s.학과ID = d.학과ID;


	-- 7.학과수를 출력하시오.
	select count(학과명) "학과수"
	from depart;


	-- 8.전자공학과 학생목록을 출력하시오.(서브쿼리)
	select * from student
	where 학과ID = (select 학과ID
	                from depart
	                where 학과명 = '전자공학과');


	-- 9. 2016학번 학생들을 출력하시오.
	select * from student
	where 학번 like '2016%';


	-- 10.다음 MS-SQLServer에서 테이블,데이터 생성구문을 Oracle에 맞게 수정하여 테이블,데이터를 생성하시오.
	create table member
	( id VARCHAR2(4) primary key,
	 name VARCHAR2(8),
	 gender VARCHAR2(5),
	 joindate VARCHAR2(20)
	);

	insert into member values('hkd','홍길동','m','2001-01-01');

	insert into member values('lss','이순신','m','2003-02-01');

	insert into member values('hj','황진이','f','2002-11-13');

	insert into member values('wg','왕건','m','2005-12-21');

	insert into member values('pms','박문수','m','2006-11-09');


	create table goods
	( goodsNo NUMBER primary key,
	 goodName VARCHAR2(20),
	 price NUMBER
	);

	insert into goods values(1,'mp3',10000);

	insert into goods values(2,'camera',50000);

	insert into goods values(3,'pc',700000);


	create table orders
	( no NUMBER primary key,
	 id VARCHAR2(4),
	 orderDate VARCHAR(20)
	);

	insert into  orders values(1,'hkd','2001-03-27');

	insert into orders values(2,'wg','2005-04-17');

	insert into orders values(3,'hkd','2006-02-07');


	create table ordersDetail
	( num NUMBER,
	 orderNo NUMBER, --주문번호
	 goodsNo NUMBER, -- 상품번호
	 qty NUMBER --상품수량
	);

	insert into ordersDetail values(1,1,1,1);

	insert into ordersDetail values(2,1,3,1);

	insert into ordersDetail values(3,2,2,2);

	insert into ordersDetail values(4,3,2,1);


	-- 11. 전체회원수를 구하시오.
	select count(*) "전체회원수"
	from member;


	-- 12. 성별 회원수를 구하시오.
	-- 성별, 회원수
	select gender "성별" , count(*) "회원수"
	from member
	group by gender;


	-- 13. 가장 많이(갯수기준) 판매된 상품부터 출력하시오.
	-- 상품명 , 판매수량
	select g.goodname "상품명" , sum(od.qty) "판매수량"
	from goods g join ordersDetail od
	on g.goodsno = od.goodsno
	group by g.goodname
	order by count(od.qty) DESC;


	-- 14. 주문내역을 출력하시오.
	-- 회원명, 상품명, 주문갯수
	select m.name "회원명" , g.goodName "상품명" , od.qty "주문갯수"
	from member m join orders o
	on m.id = o.id
	join  ordersDetail od
	on o.no = od.orderNo
	join goods g
	on od.goodsNo = g.goodsNo
	order by m.name;


	-- 15. 성이 '홍'인 회원을 검색하시오.
	select name from member
	where name like '홍%';


	-- 16. 년도, 상품별 판매수량을 구하시오.
	-- 년도, 상품명, 판매갯수
	select substr(o.orderdate, 1, 4) "년도" , g.goodName "상품명" , od.qty "판매갯수"
	from orders o join ordersDetail od
	on o.no = od.orderno
	join goods g
	on od.goodsNo = g.goodsNo
	order by o.orderdate;


	-- 17. 년도별 판매 총액(금액)을 구하시오.
	-- 년도, 판매총액
	select substr(o.orderdate, 1, 4) "년도", sum(od.qty * g.price) "판매총액"
	from orders o join ordersDetail od
	on o.no = od.orderNo
	join goods g
	on od.goodsNo = g.goodsNo
	group by o.orderdate;
	
	 */
	
}
