package Finally;

public class OutCourse {
	public String[] outCourse() {
		Teacher li=new Teacher("001","��","��","��ѧ");
		Teacher niu=new Teacher("002","ţ","Ů","����");
		Teacher wang=new Teacher("003","��","��","����");
		Teacher chen=new Teacher("004","��","Ů","��ѧ");
		Teacher xue=new Teacher("005","ѩ","��","Ӣ��");
		Course cou1=new Course("1","��ѧ","��һ����","8:00",li);
		Course cou2=new Course("2","����","�ڶ�����","9:00",niu);
		Course cou3=new Course("3","����","��������","10:00",wang);
		Course cou4=new Course("4","��ѧ","���Ľ���","11:00",chen);
		Course cou5=new Course("5","Ӣ��","���޽���","12:00",xue);
		String [] Courses= new String[20];
		Courses[0]=cou1.toString();
		Courses[1]=cou2.toString();
		Courses[2]=cou3.toString();
		Courses[3]=cou4.toString();
		Courses[4]=cou5.toString();
		Object_in_out file=new Object_in_out();
		for(int i=0;i<file.readFile("course").split("��").length;i++) {
			Courses[i+5]=file.readFile("course").split("��")[i]+"��";
		}
		return Courses;
		}
}
