create table r_mem(
    m_id varchar2(30) constraint r_mem_id_PK primary key,
    m_pass varchar2(30) not null,
    m_name varchar2(20) not null,
    birth date,
    phone varchar2(15),
    borr_count number(1) default 0,
    rsv_count number(1) default 0
);

create table r_book(
    b_code number(3) constraint r_book_code_PK primary key,
    b_name varchar2(60) not null,
    author varchar2(30) not null,
    pub varchar2(30) not null,
    pub_date date not null,
    cover varchar2(30),
    category varchar2(20) not null,
    b_status varchar2(12) default '대출가능',
    rsv_status varchar2(12)
);

create table r_borr(
    borr_code number(4) constraint r_borr_code_PK primary key,
    b_code constraint r_borr_book_code_FK references r_book(b_code),
    m_id constraint r_borr_mem_id_FK references r_mem(m_id),
    borr_date date default sysdate,
    return_date date default sysdate + 14,
    borr_status varchar2(12),
    rsv_member constraint r_borr_rsv_member_FK references r_mem(m_id)
);

create sequence r_borr_code_seq
    start with 1000;

create sequence r_children_seq
    start with 100;
    
create sequence r_essay_seq
    start with 200;

create sequence r_novel_seq
    start with 300;
    
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_novel_seq.nextval, '달러구트 꿈 백화점', '이미예', '팩토리나인', '20/07/08', 'covers/lmyd.png', '소설');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_novel_seq.nextval, '달러구트 꿈 백화점', '이미예', '팩토리나인', '20/07/08', 'covers/lmyd.png', '소설');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_novel_seq.nextval, '아몬드', '손원평', '창비', '17/03/31', 'covers/swpa.png', '소설');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_novel_seq.nextval, '보건교사 안은영', '정세랑', '민음사', '20/09/11', 'covers/jsrb.png', '소설');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_novel_seq.nextval, '시선으로부터,', '정세랑', '문학동네', '20/06/05', 'covers/jsrs.png', '소설');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_novel_seq.nextval, '소년이 온다', '한강', '창비', '14/05/19', 'covers/hks.png', '소설');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_novel_seq.nextval, '기억 1', '베르나르 베르베르', '열린책들', '20/05/30', 'covers/BRNK1.png', '소설');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_novel_seq.nextval, '심판', '베르나르 베르베르', '열린책들', '20/09/05', 'covers/BRNS.png', '소설');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_novel_seq.nextval, '데미안', '헤르만 헤세', '민음사', '09/01/20', 'covers/hrmd.png', '소설');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_novel_seq.nextval, '페인트', '이희영', '창비', '19/04/19', 'covers/lhyp.png', '소설');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_novel_seq.nextval, '피프티 피플', '정세랑', '창비', '16/11/21', 'covers/jsrf.png', '소설');

insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_essay_seq.nextval, '애쓰지 않고 편안하게', '김수현', '놀', '20/05/14', 'covers/ksha.png', '에세이');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_essay_seq.nextval, '나는 나로 살기로 했다', '김수현', '마음의숲', '20/03/16', 'covers/kshn.png', '에세이');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_essay_seq.nextval, '보통의 언어들', '김이나', '위즈덤하우스', '20/05/27', 'covers/kinb.png', '에세이');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_essay_seq.nextval, '여행의 이유', '김영하', '문학동네', '19/04/17', 'covers/kyhy.png', '에세이');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_essay_seq.nextval, '언어의 온도', '이기주', '말글터', '16/08/19', 'covers/lkju.png', '에세이');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_essay_seq.nextval, '배움의 발견', '타라 웨스트오버', '열린책들', '20/01/05', 'covers/trwb.png', '에세이');

insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_children_seq.nextval, '추리 천재 엉덩이 탐정 1', '트롤', '아이세움', '16/08/10', 'covers/trc1.png', '어린이');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_children_seq.nextval, '추리 천재 엉덩이 탐정 2', '트롤', '아이세움', '16/11/25', 'covers/trc2.png', '어린이');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_children_seq.nextval, '추리 천재 엉덩이 탐정 3', '트롤', '아이세움', '17/03/30', 'covers/trc3.png', '어린이');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_children_seq.nextval, '아홉 살 마음 사전', '박성우', '창비', '17/03/10', 'covers/pswa.png', '어린이');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_children_seq.nextval, '만복이네 떡집', '김리리', '비룡소', '10/05/28', 'covers/krrm.png', '어린이');
insert into r_book(b_code, b_name, author, pub, pub_date, cover, category) 
values(r_children_seq.nextval, '장군이네 떡집', '김리리', '비룡소', '20/04/29', 'covers/krrj.png', '어린이');

insert into r_mem(m_id, m_pass, m_name, birth, phone)
values('hun22', '훈이12', '훈이', '15/03/02', '010-3333-2222');

insert into r_mem(m_id, m_pass, m_name, birth, phone)
values('jj99', '짱구12', '짱구', '15/05/05', '010-5555-5555');

-- 대출중인 도서 view
create or replace view r_borrowing_view
as
select * from r_borr where borr_status = '대출중';

select * from r_borrowing_view;

-- 전체 도서 조회
select b_code, b_name, author, pub, pub_date, 
    nvl(cover, '이미지없음') cover, b_status,
    decode(return_date, null, '-', return_date) return_date,
    rsv_status
from r_book left outer join r_borrowing_view using(b_code);

-- 1. 대출가능한 도서 대출
create or replace procedure r_borrow(bookCode in number, memberID in varchar2)
is
    bookStatus r_book.b_status%type;
    bookRsvStatus r_book.rsv_status%type;
    borrCount r_mem.borr_count%type;
begin
    select b_status, rsv_status
    into bookStatus, bookRsvStatus
    from r_book 
    where b_code = bookCode;
    
    select borr_count
    into borrCount
    from r_mem
    where m_id = memberID;
    
    if(bookStatus = '대출중') then dbms_output.put_line('이미 대출중인 도서입니다.');
    elsif(borrCount >= 2) then dbms_output.put_line('최대 2권까지 대출가능합니다.');
    elsif(bookStatus = '대출가능' and borrCount < 2) then
        insert into r_borr(borr_code, b_code, m_id, borr_status)
        values(r_borr_code_seq.nextval, bookCode, memberID, '대출중');
	
        update r_book
        set b_status = '대출중', rsv_status = '예약가능'
    	where b_code = bookCode;
    
    	update r_mem
    	set borr_count = borr_count + 1
    	where m_id = memberID;
 
       	dbms_output.put_line('대출이 완료되었습니다.');
    else dbms_output.put_line('대출에 실패하였습니다.');
    end if;
end;
/

-- 반납
create or replace procedure r_returnbook(mid in varchar2, bcode in number)
is
	--rsvMember r_borr.rsv_member%type;
	--bookCode r_book.b_code%type;
    borrCode r_borr.borr_code%type;
    exists_return char(1);
    exists_rsvmem char(1);
begin
    -- 반납가능한 도서가 있는지
    select 
    case when exists(select * from r_borr
                     where b_code = bcode and m_id = mid 
                     and borr_status = '대출중') then '1'
    else '0' end
    into exists_return
    from dual;
    -- 예약중인 회원이 있는지
    select
    case when exists(select rsv_member from r_borr 
                    where b_code = bcode and rsv_member = mid) then '1'
    else '0' end
    into exists_rsvmem
    from dual;
    
    -- 반납가능한 도서가 있다면
    if(exists_return = '1') then
        -- 그 도서의 대출 코드를 저장
        select borr_code
        into borrCode
        from r_borr
        where b_code = bcode and m_id = mid and borr_status = '대출중';
        
        -- 대출이력 변경
        update r_borr
        set borr_status = '반납', return_date = sysdate
        where borr_code = borrCode;
    
        -- 회원의 도서 권수 빼기
        update r_mem
        set borr_count = borr_count - 1
        where m_id = mid;
        
        dbms_output.put_line('반납이 완료되었습니다.');
        
        -- 예약자가 없으면
        if(exists_rsvmem = '0') then 
            update r_book
            set b_status = '대출가능', rsv_status = null
            where b_code = bcode;
        end if;	
        
    else dbms_output.put_line('반납 가능한 도서가 없습니다.');
    end if;

	
end;
/

-- 대출중인 책 예약
create or replace procedure rsvBook(bcode in number, mid in varchar2)
is
    rsvStatus r_book.rsv_status%type;
    borrCode r_borr.borr_code%type;
    borrowingMem r_borr.m_id%type;
    rsvCount r_mem.rsv_count%type;
    
    exists_borr char(1);
    exists_rsv char(1);
begin

    -- 책이 대출중인지
    select
    case when exists(select * from r_book 
                    where b_code = bcode and b_status = '대출중') then '1'
    else '0' end
    into exists_borr
    from dual;
    -- 예약가능상태인지
    select
    case when exists(select * from r_book 
                    where b_code = bcode and rsv_status = '예약가능') then '1'
    else '0' end
    into exists_rsv
    from dual;
    
    -- 대출중이면 예약할수있음
    if(exists_borr = '1') then
        -- 예약가능한 상태이면
        if(exists_rsv = '1') then
            -- 책의 대출코드와 대출중인 회원 아이디를 저장
            select borr_code, m_id
            into borrCode, borrowingMem
            from r_borr
            where b_code = bcode and borr_status = '대출중';
            -- 예약하는 회원의 rsv_count를 저장
            select rsv_count into rsvCount from r_mem where m_id = mid;
            
            if(borrowingMem = mid) then dbms_output.put_line('회원님이 대출중인 도서는 예약할 수 없습니다.');
            elsif(rsvCount >= 1) then dbms_output.put_line('예약은 1인당 1권만 가능합니다.');
            else
                update r_borr
                set rsv_member = mid
                where borr_code = borrCode;
                
                update r_book
                set rsv_status = '예약중'
                where b_code = bcode;

                update r_mem
                set rsv_count = rsv_count + 1
                where m_id = mid;
        
                dbms_output.put_line('예약이 완료되었습니다.');
            end if;
        else dbms_output.put_line('이미 예약중인 도서입니다.');
        end if;
    else dbms_output.put_line('대출가능한 책은 예약할 수 없습니다.');
    end if;
    
end;
/

execute R_BORROW(300, 'hun22');
execute r_returnbook('hun22', 300);
execute rsvBook(300, 'jj99');
set serveroutput on;
delete from r_mem where m_id in ('hun2', 'jj9');
select * from r_mem;
select * from r_borr;
select * from r_book;

update r_book
set b_status = '대출가능'
where b_code = 100;

select rsv_status
    from r_book
    where b_code = 301;
    
update r_borr
set rsv_member = null
where rsv_member = 'jj99';

update r_mem
set rsv_count = 0
where m_id = 'jj99';