----------------------------------Indexes in mysql-----------------------------------------------------
 
create table student(stud_id int,firstname varchar(25),lastname varchar(20),class varchar(10),age int);

insert into student values(1,"Preeti","Singh","Fy",32);
select stud_id,firstname,lastname from student where class="Fy";
EXPLAIN Select stud_id,firstname,lastname from student where age=32;

Create INDEX class On student(class);
create Index lastname on student(lastname);

show Indexes from student;


--------------------------------------------Devops concepts---------------------------------------------
https://orangematter.solarwinds.com/2022/03/21/what-is-devops/
