create table reply(

	rno int primary key auto_increment,
    rcontent varchar(1000),
    rdate datetime default now(),
    rindex int,
    bno int ,
    mno int,
	foreign key (bno) references board(bno) on delete cascade,
    foreign key (mno) references member(mno)
    )
    /* foreign key 제약조건 
    /* board table 의 bno(pk) 삭제되면 reply table의 bno(fk) 레코드도 같이 없데이트 & 삭제 */
    /* on update : pk 레코드가 수정되면 fk 레코드도 같이 수정 설정 */
	/* on delete : pk 레코드가삭제되면fk레코드도같이삭제설정*/
