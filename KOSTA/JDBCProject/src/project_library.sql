create table members(
    m_id varchar2(30) constraint members_id_PK primary key,
    m_pass varchar2(30) not null,
    m_name varchar2(20) not null,
    birth date,
    phone varchar2(11),
    borr_count number(1) default 0
);

create table books(
    b_code number(3) constraint books_code_PK primary key,
    b_name varchar2(60) not null,
    author varchar2(30) not null,
    pub varchar2(30) not null,
    pub_date date not null,
    cover varchar2(30),
    category varchar2(20) not null,
    b_status varchar2(12) default '대출가능'
    --borr_code constraint books_borr_code_fk references borrows(borr_code)
);

create table borrows(
    borr_code number(4) constraint borrows_code_PK primary key,
    b_code constraint borrows_book_code_FK references books(b_code),
    m_id constraint borrows_member_id_FK references members(m_id),
    borr_date date default sysdate,
    return_date date default sysdate + 14,
    borr_status varchar2(12)
);

create sequence borrows_code_seq
    start with 1000;

create sequence books_children_seq
    start with 100;
    
create sequence books_essay_seq
    start with 200;

create sequence books_novel_seq
    start with 300;

insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_novel_seq.nextval, '달러구트 꿈 백화점', '이미예', '팩토리나인', '20/07/08', 'covers/lmyd.png', '소설');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_novel_seq.nextval, '달러구트 꿈 백화점', '이미예', '팩토리나인', '20/07/08', 'covers/lmyd.png', '소설');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_novel_seq.nextval, '아몬드', '손원평', '창비', '17/03/31', 'covers/swpa.png', '소설');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_novel_seq.nextval, '보건교사 안은영', '정세랑', '민음사', '20/09/11', 'covers/jsrb.png', '소설');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_novel_seq.nextval, '시선으로부터,', '정세랑', '문학동네', '20/06/05', 'covers/jsrs.png', '소설');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_novel_seq.nextval, '소년이 온다', '한강', '창비', '14/05/19', 'covers/hks.png', '소설');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_novel_seq.nextval, '기억 1', '베르나르 베르베르', '열린책들', '20/05/30', 'covers/BRNK1.png', '소설');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_novel_seq.nextval, '심판', '베르나르 베르베르', '열린책들', '20/09/05', 'covers/BRNS.png', '소설');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_novel_seq.nextval, '데미안', '헤르만 헤세', '민음사', '09/01/20', 'covers/hrmd.png', '소설');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_novel_seq.nextval, '페인트', '이희영', '창비', '19/04/19', 'covers/lhyp.png', '소설');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_novel_seq.nextval, '피프티 피플', '정세랑', '창비', '16/11/21', 'covers/jsrf.png', '소설');

insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_essay_seq.nextval, '애쓰지 않고 편안하게', '김수현', '놀', '20/05/14', 'covers/ksha.png', '에세이');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_essay_seq.nextval, '나는 나로 살기로 했다', '김수현', '마음의숲', '20/03/16', 'covers/kshn.png', '에세이');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_essay_seq.nextval, '보통의 언어들', '김이나', '위즈덤하우스', '20/05/27', 'covers/kinb.png', '에세이');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_essay_seq.nextval, '여행의 이유', '김영하', '문학동네', '19/04/17', 'covers/kyhy.png', '에세이');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_essay_seq.nextval, '언어의 온도', '이기주', '말글터', '16/08/19', 'covers/lkju.png', '에세이');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_essay_seq.nextval, '배움의 발견', '타라 웨스트오버', '열린책들', '20/01/05', 'covers/trwb.png', '에세이');

insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_children_seq.nextval, '추리 천재 엉덩이 탐정 1', '트롤', '아이세움', '16/08/10', 'covers/trc1.png', '어린이');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_children_seq.nextval, '추리 천재 엉덩이 탐정 2', '트롤', '아이세움', '16/11/25', 'covers/trc2.png', '어린이');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_children_seq.nextval, '추리 천재 엉덩이 탐정 3', '트롤', '아이세움', '17/03/30', 'covers/trc3.png', '어린이');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_children_seq.nextval, '아홉 살 마음 사전', '박성우', '창비', '17/03/10', 'covers/pswa.png', '어린이');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_children_seq.nextval, '만복이네 떡집', '김리리', '비룡소', '10/05/28', 'covers/krrm.png', '어린이');
insert into books(b_code, b_name, author, pub, pub_date, cover, category) 
values(books_children_seq.nextval, '장군이네 떡집', '김리리', '비룡소', '20/04/29', 'covers/krrj.png', '어린이');


-- 회원가입
insert into members(m_id, m_pass, m_name, birth, phone)
values('hun2', '훈이12', '훈이', '15/03/02', '010-3333-2222');

-- 도서명으로 검색
select b_code, b_name, author, pub, pub_date, 
    nvl(cover, '이미지없음'), b_status,
    decode(return_date, null, '-', return_date) 반납예정일
from books left outer join borrows using(b_code)
where b_name like '%달러구트%';

where b_name like '%'||?||'%';

-- 작가명으로 검색
select b_code, b_name, author, pub, pub_date, 
    nvl(cover, '이미지없음'), b_status,
    decode(return_date, null, '-', return_date) 반납예정일
from books left outer join borrows using(b_code)
where author like '%세랑%';

where author like '%'||?||'%';

-- 전체 도서 조회
select b_code, b_name, author, pub, pub_date, 
    nvl(cover, '이미지없음'), b_status,
    decode(return_date, null, '-', return_date) 반납예정일
from books left outer join borrows using(b_code);

-- 카테고리별 조회
-- 소설
select b_code, b_name, author, pub, pub_date, 
    nvl(cover, '이미지없음'), b_status,
    decode(return_date, null, '-', return_date) 반납예정일
from books left outer join borrows using(b_code)
where category = '소설';
-- 에세이
select b_code, b_name, author, pub, pub_date, 
    nvl(cover, '이미지없음'), b_status,
    decode(return_date, null, '-', return_date) 반납예정일
from books left outer join borrows using(b_code)
where category = '에세이';
-- 어린이
select b_code, b_name, author, pub, pub_date, 
    nvl(cover, '이미지없음'), b_status,
    decode(return_date, null, '-', return_date) 반납예정일
from books left outer join borrows using(b_code)
where category = '어린이';