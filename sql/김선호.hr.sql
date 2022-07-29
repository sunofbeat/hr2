drop user hr2 cascade;

create user hr2 identified by hr2 default tablespace users;

grant connect, resource to hr2;

create table hr2.workers(
    worker_id number(2),
    worker_name varchar2(10),
    reg_date date);
     
alter table hr2.workers
    add constraint worker_userid_pk primary key(worker_id);

create sequence hr2.worker_workerid_seq
	 start with 1  
   	 increment by 1 
   	 maxvalue 99   
   	 nocache   
   	 nocycle;