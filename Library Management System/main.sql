create table book (
   bookid      varchar2(10),
   title       varchar2(30),
   author      varchar2(20),
   category    varchar2(10),
   isavaliable boolean,
   constraint pk_book_id primary key ( bookid )
);
CREATE TABLE LOAN(
 LOANID VARCHAR2(),
 USERID                                             NUMBER(38)
 BOOKID                                             NUMBER(38)
 BORROWDATE                                         DATE
 RETURNDATE                                         DATE
);z