import java.util.*;

public class Course {
	String title, time, room;
	Faculty lecturer;
	Student regist[]; 
	Vector vregist;
	Course() {
		regist = new Student[15]; 
		vregist = new Vector();
	}
	Course(String nam, Faculty prof, String tim, String rum) {
		this();
		title = nam; time = tim; room = rum;
		lecturer = prof;
		prof.openCourse(this);
	}
	String getTitle() { return title; }
	Faculty getLecturer() { return lecturer; }
	String getTP() { return time + " #" + room; }
	int numRegist() { return vregist.size(); }
	void register(Student st) { vregist.add(st); }
	void dropme(Student st) { vregist.removeElement(st); }
	void listRegisters(){
		for(int i = 0; i<vregist.size(); i++){
		Student st = (Student) vregist.elementAt(i);
		System.out.print(st.getName());
		System.out.print("  ");
		for(int j=1; j<17; j++)System.out.print("  .");
		System.out.println("");
		if((i+1)%6==0){
			System.out.print("\n");
			for(int j=1; j<16; j++) System.out.print(" -- ");
		}
		}
		
		
		System.out.println("");
		
		}
	
	void info() {
		System.out.println(title + "담당교수 : " + lecturer.getName() + ", 시간 : " + time + ", 강의실 : " + room);
	}
}
