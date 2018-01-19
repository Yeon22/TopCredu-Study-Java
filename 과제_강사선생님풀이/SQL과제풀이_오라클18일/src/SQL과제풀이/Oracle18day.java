package SQL과제풀이;

public class Oracle18day {
	
	/*
	 * --1. depart(학과) 테이블을 생성하시오.
		--학과 ID , 학과명
		create table depart(
			depart_id number not null,
			depart_name varchar(20)
		);
		
		drop table student;
		
		
		
		create table student
		(
			st_no varchar(8),
			st_name varchar(20),
			st_depart_id number not null
		);
		
		
		
		insert into depart values(0001,'컴퓨터공학과');
		insert into depart values(0002,'전자공학과');
		
		
		
		insert into student values('20150001','홍길동',0001);	
		insert into student values('20160010','이순신',0002);
		
		
		
		--5.성이 홍씨인사람을 검색
		select * 
		from student
		where st_name LIKE('홍%');
		
		
		select st_no, st_name,depart_name
		from student s join depart d
		on s.st_depart_id = d.depart_id;
		
		
		select count(depart_name) as "학과수"
		from depart;
		
		
		select st_name
		from student
		where st_depart_id  = (select depart_id
								from depart
								where depart_name = '전자공학과');
		
		                        
		
		--2016학번 학생들을 출력하시오
		select st_name ,st_no
		from student
		where to_number(st_no) >= 20160000;
		
		
		
		
		
		--create table member
		--( id text primary key,
		-- name text,
		-- gender text,
		-- joindate text
		--);
		
		
		
		create table member
		(
			id varchar(20) not null,
			name varchar(20),
			gender char(2),
			joindate varchar(10)
		);
		
		
		
		
		create table goods
		(
			goodsNo number primary key,
			goodName varchar(20),
			price number
		);
		
		
		
		insert into goods values(1,'mp3',10000);
		insert into goods values(2,'camera',50000);
		insert into goods values(3,'pc',700000);
		
		
		
		
		
		create table orders
		( 
			no number primary key,
			id varchar(20),
			orderDate varchar(20)
		);
		
		
		insert into  orders values(1,'hkd','2001-03-27');
		insert into orders values(2,'wg','2005-04-17');
		insert into orders values(3,'hkd','2006-02-07');
		
		
		
		
		
		create table ordersDetail
		(	num number,
			orderNo number, --주문번호
			goodsNo number, -- 상품번호
			qty number--상품수량
		);
		
		
		
		insert into ordersDetail values(1,1,1,1);
		insert into ordersDetail values(2,1,3,1);
		insert into ordersDetail values(3,2,2,2);
		insert into ordersDetail values(4,3,2,1);
		
		
		
		select * from ordersDetail;
		
		
		
		
		
		
		
		select count(*) as "전체회원수"
		from member;
		
		
		
		
		select gender , count(*) as "성별 회원수"
		from member
		group by gender;
		
		
		
		
		
		
		select nvl(g.goodName,' ') as "상품명", nvl(to_char(g.goodsno),' ') as "상품번호",max(od.qty) as "상품수량"
		from goods g join ordersDetail od
		on g.goodsno = od.goodsno
		group by rollup(g.goodName,g.goodsno)
		order by "상품수량" desc;
		
		
		
		
		
		
		select m.name , s.goodName , od.qty
		from member m join orders o
		on m.id = o.id
		join ordersDetail od
		on o.no = od.orderno
		join goods s
		on od.goodsno = s.goodsno;
		
		
		
		
		
		
		
		select * from member
		where name like('홍%');
		
		
		
		
		
		
		
		--년도, 상품명, 판매갯수
		select nvl(substr(o.orderDate,1,4),' ') as "년도" , nvl(s.goodName,' ') as "상품명" ,sum(od.qty)
		from member m join orders o
		on m.id = o.id
		join ordersDetail od
		on o.no = od.orderno
		join goods s
		on od.goodsno = s.goodsno
		group by rollup(substr(o.orderDate,1,4),s.goodName);
		
		
		
		
		
		
		
		--년도별 ,판매총액
		select nvl(substr(o.orderDate,1,4),' ') as "년도" ,sum(s.price) as "판매총액"
		from member m join orders o
		on m.id = o.id
		join ordersDetail od
		on o.no = od.orderno
		join goods s
		on od.goodsno = s.goodsno
		group by rollup(substr(o.orderDate,1,4) , s.price);

	 */

}
