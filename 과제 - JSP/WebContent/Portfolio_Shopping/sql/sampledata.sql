--샘플 데이터 입력
insert into pofol_address values('152-278', '서울특별시', '구로구', '디지털로34길 55', '08378', '코오롱싸이언스밸리2차');

insert into pofol_worker values('admin', 'admin', '홍관리', '010-7777-7777');
insert into pofol_worker values('tomas', 'tomas', '자바강사', '010-8888-8888');

insert into pofol_member (id, pwd, name, zip_num, address, phone)
values ('one', '1111', '김나리', '133-100', '서울시성동구성수동1가 1번지 21호', '017-7777-7777');
insert into pofol_member (id, pwd, name, zip_num, address, phone)
values ('two', '2222', '이백합', '130-120', '서울시송파구잠실2동 리센츠 아파트 201동 505호', '011-1234-4567');

insert into pofol_product(pseq, name, kind, price1, price2, price3, content, image) values(
product_seq.nextval, '봄컬러후드티', '1', '5000', '12000', '7000', '봄색깔의 후드티입니다.', 'hoodt01.JPG');
insert into pofol_product(pseq, name, kind, price1, price2, price3, content, image, bestyn) values(
product_seq.nextval, '아이스크림후드티', '1', '10000', '20000', '10000','아이스크림 색깔의 후드티입니다.', 'hoodt02.JPG', 'n');
insert into pofol_product(pseq,  name, kind, price1, price2, price3, content, image, bestyn) values( 
product_seq.nextval, '밑단밴딩후드집업', '2', '13000', '21000', '8000', '넉넉하고 루즈한 후드집업입니다.', 'hoodzipup01.JPG', 'n');
insert into pofol_product(pseq,  name, kind, price1, price2, price3, content, image, bestyn) values(
product_seq.nextval, '레터링롱오버핏후드집업', '2', '7000', '34000', '27000', '편안하고 예쁜 후드집업입니다.', 'hoodzipup02.JPG', 'y');
insert into pofol_product(pseq,  name, kind, price1, price2, price3, content, image, bestyn) values(
product_seq.nextval, '커버낫회색', '3', '10000', '39000', '29000', '야구볼캡을 모티브로 하였습니다.', 'cap01.JPG', 'n');
insert into pofol_product(pseq,  name, kind, price1, price2, price3, content, image) values(
product_seq.nextval, '헷츠온SMB', '3', '4000', '10000', '6000', 'SMB브랜드 스냅백입니다.', 'cap02.JPG');
insert into pofol_product(pseq,  name, kind, price1, price2, price3, content, image, bestyn) values(
product_seq.nextval,  '연청데미지스판', '4', '13000', '36000', '23000', '매력적인 연청 데님팬츠입니다.', 'jin01.JPG', 'y');
insert into pofol_product(pseq,  name, kind, price1, price2, price3, content, image, bestyn) values(
product_seq.nextval, '로티데님배기팬츠', '4', '10000', '37800', '27800', '편안한 배기팬츠입니다.', 'jin02.JPG', 'y');
insert into pofol_product(pseq,  name, kind, price1, price2, price3, content, image) values(
product_seq.nextval,  '앱솔루트백팩', '5', '30000', '71120', '41120', '넉넉한 수납공간을 자랑합니다.', 'backpack01.JPG');
insert into pofol_product(pseq,  name, kind, price1, price2, price3, content, image, bestyn) values(
product_seq.nextval,  '로디나트슈레이스백팩', '5', '57000', '148000', '91000', '실용적이면서 가볍습니다.', 'backpack02.JPG','n');

insert into pofol_cart(cseq, id, pseq, quantity) values(cart_seq.nextval, 'one', 1, 1);

insert into pofol_orders(oseq, id) values(orders_seq.nextval, 'one');
insert into pofol_orders(oseq, id) values(orders_seq.nextval, 'one');
insert into pofol_orders(oseq, id) values(orders_seq.nextval, 'two');

insert into pofol_order_detail(odseq, oseq, pseq, quantity)
values(order_detail_seq.nextval, 1, 1, 1);
insert into pofol_order_detail(odseq, oseq, pseq, quantity)
values(order_detail_seq.nextval, 1, 2, 5);
insert into pofol_order_detail(odseq, oseq, pseq, quantity)
values(order_detail_seq.nextval, 2, 4, 3);
insert into pofol_order_detail(odseq, oseq, pseq, quantity)
values(order_detail_seq.nextval, 3, 3, 1);
insert into pofol_order_detail(odseq, oseq, pseq, quantity)
values(order_detail_seq.nextval, 3, 2, 1);
insert into pofol_order_detail(odseq, oseq, pseq, quantity)
values(order_detail_seq.nextval, 3, 6, 2);
insert into pofol_order_detail(odseq, oseq, pseq, quantity)
values(order_detail_seq.nextval, 3, 1, 2);

insert into pofol_qna(qseq, subject, content, id)
values(qna_seq.nextval, '테스트', '질문내용1', 'one');
insert into pofol_qna(qseq, subject, content, id)
values(qna_seq.nextval, '테스트2', '질문내용2', 'one');

delete pofol_qna;

--뷰 만들기(빠른 조회를 위해)
create or replace view pofol_cart_view
as
select o.cseq, o.id, o.pseq, m.name mname, p.name pname, o.quantity, o.indate, p.price2, o.result
from pofol_cart o, pofol_member m, pofol_product p
where o.id = m.id and o.pseq = p.pseq and result = '1';

create or replace view pofol_order_view
as
select d.odseq, o.oseq, o.id, o.indate, d.pseq, d.quantity, 
m.name mname, m.zip_num, m.address, m.phone, p.name pname, p.price2, d.result
from pofol_orders o, pofol_order_detail d, pofol_member m, pofol_product p
where o.oseq = d.oseq and o.id = m.id and d.pseq = p.pseq;



--베스트 상품
create or replace view pofol_best_pro_view
as
select pseq, name, price2, image
from( select rownum, pseq, name, price2, image
      from pofol_product
      where bestyn='y'
      order by indate desc)
where rownum <= 4;

select * from pofol_best_pro_view;


--신상품
create or replace view pofol_new_pro_view
as
select pseq, name, price2, image
from( select rownum, pseq, name, price2, image
      from pofol_product
      where useyn='y'
      order by indate desc)
where rownum <= 4;

select * from pofol_new_pro_view;

------------------------------------------------------------
desc pofol_product;
commit;