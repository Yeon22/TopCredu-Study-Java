package SQL;

public class 수업_20180123 {
	
	/*
	 * --미니샵프로그램 테이블 만들기
		drop table member;
		
		create table member
		(
		    id varchar2(10) primary key,
		    name varchar2(20),
		    gender varchar2(1),
		    joindate DATE DEFAULT SYSDATE
		);
		
		insert into member values('hkd', '홍길동', 'm', sysdate);
		insert into member values('lss', '이순신', 'm', sysdate);
		insert into member values('hj', '황진이', 'f', sysdate);
		insert into member values('wg', '왕건', 'm', sysdate);
		insert into member values('pms', '박문수', 'm', sysdate);
		
		drop table goods;
		
		create table goods
		(
		    goodsNo number primary key,
		    goodName varchar(20),
		    price number
		);
		
		 --to_number()는 문자열을 숫자로 변경해준다(자바에서 사용할 때) 뒤의 '999'는 숫자 3자리까지 허용 늘리는 것도 가능
		insert into goods values(to_number('5', '999'), 'mp3', 10000);
		insert into goods values(2, 'camera', 50000);
		insert into goods values(3, 'pc', 700000);
		
		select * from goods;
		
		desc orders;
		drop table orders;
		
		create table orders
		(
		    no number primary key,
		    id varchar(10),
		    orderDate DATE DEFAULT SYSDATE
		);
		
		insert into orders values(1,'hkd', sysdate);
		insert into orders values(2,'wg', sysdate);
		insert into orders values(3,'hkd', sysdate);
		
		select * from orders;
		
		drop table ordersDetail;
		
		create table ordersDetail
		(
		    num number,
		    orderNo number, --주문번호
		    goodsno number,
		    qty number,
		    price number
		);
		
		select * from ordersDetail;
		
		insert into ordersDetail values(1,1,1,1,10000);
		insert into ordersDetail values(2,1,3,1,10000);
		insert into ordersDetail values(3,2,2,2,50000);
		insert into ordersDetail values(4,3,2,1,700000);
		
		select * from member;
		
		select id, name, gender, TO_DATE(joindate, 'RRRR-MM-DD') as joindate
		from member
		where name = '황진이';
		
		select id, name, gender, TO_DATE(joindate, 'RRRR-MM-DD') as joindate
		from member
		where gender = 'f';
		
		select m.name as name, nvl(s.goodName,' ') as goodName, od.qty as qty, od.price as price
		from member m join orders o
		on m.id = o.id
		join ordersDetail od
		on o.no = od.orderNo
		join goods s
		on od.goodsno = s.goodsno;
		
		commit;
	 */
	
}
