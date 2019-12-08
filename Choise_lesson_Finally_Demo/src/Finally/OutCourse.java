package Finally;

public class OutCourse {
	public String[] outCourse() {
		Teacher li=new Teacher("001","李","男","数学");
		Teacher niu=new Teacher("002","牛","女","物理");
		Teacher wang=new Teacher("003","王","男","生物");
		Teacher chen=new Teacher("004","陈","女","化学");
		Teacher xue=new Teacher("005","雪","男","英语");
		Course cou1=new Course("1","数学","第一教室","8:00",li);
		Course cou2=new Course("2","物理","第二教室","9:00",niu);
		Course cou3=new Course("3","生物","第三教室","10:00",wang);
		Course cou4=new Course("4","化学","第四教室","11:00",chen);
		Course cou5=new Course("5","英语","第无教室","12:00",xue);
		String [] Courses= new String[20];
		Courses[0]=cou1.toString();
		Courses[1]=cou2.toString();
		Courses[2]=cou3.toString();
		Courses[3]=cou4.toString();
		Courses[4]=cou5.toString();
		Object_in_out file=new Object_in_out();
		for(int i=0;i<file.readFile("course").split("。").length;i++) {
			Courses[i+5]=file.readFile("course").split("。")[i]+"。";
		}
		return Courses;
		}
}
