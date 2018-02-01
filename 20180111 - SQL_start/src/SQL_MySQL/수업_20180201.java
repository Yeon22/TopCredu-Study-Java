package SQL_MySQL;

public class 수업_20180201 {
	
	/*
	 * -- 데이터베이스 생성
		create database company;
		
		-- company 데이터베이스 사용
		use company;
		
		create table products
		(
			id int not null auto_increment primary key,
		    name varchar(50) not null,
		    modelnumber varchar(15) not null,
		    series varchar(30) not null
		);
		
		select * from products;
		
		insert into products(name, modelnumber, series) 
		values('eric', '1234567', 'Artist');
		
		insert into products(name, modelnumber, series) 
		values('Jeff', '1234568', 'Artist');
		
		insert into products(name, modelnumber, series) 
		values('American', '1234569', 'American Deluxe');
		
		select * from products
		where series = 'Artist';
		
		select * from products
		where id >1 and id < 5;
		
		-- 3번째부터 2개
		select * from products order by name desc limit 2,2;
		-- 1번째부터 2개만 조회
		select * from products order by name desc limit 2;
		
		-- 데이터 수정
		update products set name = 'david' where id = 1;
		
		select * from products;
		
		-- 데이터 삭제
		delete from products where id=1;
		
		-- 테이블 삭제
		drop table products;
		
		-- DB삭제
		drop database company;
		
		commit;
		
		
		create database sampledb;
		
		use sampledb;
		
		create table test
		(
			id varchar(10),
		    name varchar(10)
		);
		
		insert into test values('1', 'kkk');
		
		select * from test;
		

	 */

}
