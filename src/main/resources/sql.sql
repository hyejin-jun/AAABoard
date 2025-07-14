create table aaa_board(
	bno number(10,0),    				-- 게시물번호 (시퀀스)
	title varchar2(200) not null,		-- 제목
	content varchar2(2000) not null,	-- 내용
	writer varchar2(50) not null,		-- 작성자 (차후에 member와 연동)
	regdate date default sysdate,		-- 작성일 (자동으로 DB날짜가 입력)
	updatedate date default sysdate		-- 수정일 (자동으로 DB날짜가 입력)
); -- board 테이블 생성


alter table aaa_board add constraint pk_board primary key (bno);

insert into aaa_board (bno, title, content, writer)
values (seq_board.nextval, '제목1', '내용1', '박원빈');
insert into aaa_board (bno, title, content, writer)
values (seq_board.nextval, '제목2', '내용2', '정성찬');
insert into aaa_board (bno, title, content, writer)
values (seq_board.nextval, '제목3', '내용3', '송은석');
insert into aaa_board (bno, title, content, writer)
values (seq_board.nextval, '제목4', '내용4', '이찬영');
insert into aaa_board (bno, title, content, writer)
values (seq_board.nextval, '제목5', '내용5', '이소희');
insert into aaa_board (bno, title, content, writer)
values (seq_board.nextval, '제목6', '내용6', '쇼타로');

select * from AAA_BOARD;
