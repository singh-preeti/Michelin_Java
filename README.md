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
---------------------------------------------Devops use cases-------------------------------------------
https://www.querysurge.com/solutions/devops-for-data?utm_source=Google-Ads&utm_medium=ad&utm_campaign=DevOp-for-Data-article&gad_source=1&gclid=CjwKCAiA_aGuBhACEiwAly57MWwPHndsNveRfZ_pnUwLspFM97ZOsw3mhJUfrTX54gb3xalbT9s-QhoCO4EQAvD_BwE
