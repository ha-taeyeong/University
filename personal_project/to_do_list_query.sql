-- 테이블 생성 쿼리
CREATE TABLE `User` (
	`user_no`	NUMERIC	NOT NULL,
	`user_id`	VARCHAR(100)	NULL,
	`user_pw`	VARCHAR(100)	NULL,
	`user_name`	VARCHAR(100)	NULL,
	`user_birth`	VARCHAR(100)	NULL,
	`user_gender`	VARCHAR(1)	NULL,
	`reg_dt`	DATE	NOT NULL,
	`reg_id`	VARCHAR(100)	NOT NULL,
	`reg_ip`	VARCHAR(100)	NOT NULL,
	`mod_dt`	DATE	NULL,
	`mod_id`	VARCHAR(100)	NULL,
	`mod_ip`	VARCHAR(100)	NULL,
	`del_yn`	VARCHAR(1)	NOT NULL
);

CREATE TABLE `List` (
	`list_no`	NUMERIC	NOT NULL,
	`user_no`	NUMERIC	NOT NULL,
	`list_name`	VARCHAR(200)	NULL,
	`list_yn`	VARCHAR(1)	NOT NULL,
	`reg_dt`	DATE	NOT NULL,
	`reg_id`	VARCHAR(100)	NOT NULL,
	`reg_ip`	VARCHAR(100)	NOT NULL,
	`mod_dt`	DATE	NULL,
	`mod_id`	VARCHAR(100)	NULL,
	`mod_ip`	VARCHAR(100)	NULL,
	`del_yn`	VARCHAR(1)	NOT NULL
);

show tables
;
-- insert 문
insert into user values(1, 'test1', '1234', '홍길동', '20250101', 'M', now(), 'admin', '10.50.244.61', null, null, null, 'N')
;
insert into list values(1, 1, 'list test', 'N', now(), 'admin', '10.50.244.61', null, null, null, 'N')
;
-- select 문
select * from user
;
select * from list
;
show tables
;
-- insert 문
insert into user values(1, 'test1', '1234', '홍길동', '20250101', 'M', now(), 'admin', '10.50.244.61', null, null, null, 'N')
;
insert into list values(1, 1, 'list test', 'N', now(), 'admin', '10.50.244.61', null, null, null, 'N')
;
-- select 문
select * from user
;
select * from list
;
