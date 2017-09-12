package aom.rf.ch;

public class Mysql {
public static void main(String[] args) {
	int x = 6,y = 10,k=5;
	switch(x%y){
	case 0:k=x*y;break;
	case 6:k=x/y;break;
	case 12:k=k=x-y;break;
	default:k=x*y-x;
	System.out.println(k);
	}
	//用子查询查询挂科以及挂科两门以上的同学的平均分，用where或者from型都可以
//	select * from phone where id in (select max(id)from phone group by one_id);
//	select name,avg(score),sum(score<60) as gk from stu9 where name in (select name from (select name, sum(score<=60)as m from stu9 GROUP BY name HAVING m>=2)as t GROUP BY t.name) GROUP BY name;
//	select typename,one_id from table1 where one_id in(select one_id from phone GROUP BY one_id);
//	select * from table1 where EXISTS (select * from phone where table1.one_id = phone.one_id);
}
}
