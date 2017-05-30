public class InheritanceDemo {
        int npp = 0;
        Person[] ppv;
        Student[] stv;
        Faculty[] profv;
        Staff  jigwon;

        Course crsv[]; 			//uncomment this

        //remove main 1
       
    public static void main(String[] args){
    	InheritanceDemo pcis = new InheritanceDemo();
    	pcis.recruit_employees();
    	// ++
    	pcis.run_school();
    	pcis.report();
    }

    InheritanceDemo() {
        ppv = new Person[100]; npp = 0;
    }

    void recruit_employees() {
    	profv = new Faculty[5];
    	profv[0] = new Faculty("김교수", 48, "부산시 남구", 5000000, "공과대학");
    	profv[1] = new Faculty("신교수", 43, "부산시 해운대구", 4000000, "공과대학");
    	profv[2] = new Faculty("황교수", 54, "부산시 북구", 5000000, "공과대학");
    	profv[3] = new Faculty("곽교수", 53, "부산시 동구", 4000000, "공과대학");
    	profv[4] = new Faculty("고교수", 38, "부산시 진구", 3000000, "공과대학");
    	jigwon = new Staff("박과장", 42, 4000000, "대학본부");
    	jigwon.setDepartment("서무과");
    	
    	ppv[npp++] = profv[0];
    	ppv[npp++] = profv[1];
    	ppv[npp++] = profv[2];
    	ppv[npp++] = profv[3];
    	ppv[npp++] = profv[4];
    	ppv[npp++] = jigwon;
    }

    void report() {	// 구성원 소개, 수강편람, 과목출석부, 개인 시간표
    	print_people(); //see below
    	print_수강편람();
    	for(int i=0; i<crsv.length; i++){
    	print_출석부(crsv[i]);}
    	for(int i=0; i<stv.length; i++){
    	print_학생시간표(stv[i]);}
    	// +++
    }

    void run_school() {	//- 3 steps - 
    	recruit_학생();
    	open_강좌();
    	register_수강과목();
    	
    	// ++++
    	
    }

    void recruit_학생() {	// (1)'
        String namev[] = {"곽동렬", "변경수", "김민지", "김재원", "반예진","김민주", "김고은", "이현송", "남한솔", "투석이","베컴","루니","에브라","박지성","호날두"};
        int agev[] = {21, 24, 22, 19, 21, 21, 21, 21, 23, 21,25,24,23,21,20};
        
        stv = new Student[namev.length]; //학생부?
        for(int i = 0; i < namev.length; i++) {
        	stv[i] = new Student(namev[i], agev[i], 2, 200912345+i, "IT융합응용공");
        	ppv[npp++] = stv[i];
        }
    }

    void open_강좌() {
    	crsv = new Course[5]; //두과목만 개설
    	crsv[0] = new Course("Java ", profv[0], "Mon 7-8, Wed 7-8", "1325");
    	crsv[1] = new Course("Graphics ", profv[1], "Wed 7-8, Thu 7-8", "1325");
    	crsv[2] = new Course("c프로그래밍 ", profv[2], "Fri 7-8, Thu 2-3", "1321");
    	crsv[3] = new Course("공업수학 ", profv[3], "Thu 3-4, Fri 1-2", "1323");
    	crsv[4] = new Course("이산수학 ", profv[4], "Wed 2-3, Thu 7-8", "1307");
    }

    void register_수강과목() {
    	Course oo=crsv[0];
    	Course cg = crsv[1];
    	Course xg = crsv[2];
    	
  
    	int oo_list[]={0,1,3,4,5,7};
    	int cg_list[]={2,3,5,6};
    	int xg_list[]={1,3,5,12,13};


    	for(int i=0; i<oo_list.length; i++)
    		stv[  oo_list[i] ].registerCourse(oo);
    	for(int i=0; i<cg_list.length; i++)
        	stv[  cg_list[i] ].registerCourse(cg);
    	for(int i=0; i<xg_list.length; i++)
        	stv[  xg_list[i] ].registerCourse(xg);
    	

    	System.out.println("수강신청:"+(oo_list.length + cg_list.length)+"명-성공.");
    }

    void print_people() {
        for(int i = 0; i < npp; i++){
            System.out.println("<" + (i + 1) + ">---------------------------");
            ppv[i].info();
        }
    }

    void print_수강편람() {
    	System.out.println("\n- 수강편람 -");
    	for(int i = 0; i < crsv.length; i++) crsv[i].info();
    }

    void print_출석부(Course cs) {
	System.out.println("--------------------------------------------------------");
    
    System.out.println("과목 : " +cs.getTitle() + "(" + cs.getTP()+")"+"담당교수 : " +cs.lecturer.getName());
    System.out.print("    ");
    for(int n = 1; n<=16; n++) System.out.printf("%3d",n);
    System.out.println("");
    cs.listRegisters();
    }

    void print_학생시간표(Student st) {
    	System.out.println("\n<< 수강과목/시간표 >>");
    	System.out.println("이름:"+st.getName());
    	for(int i=0; i<st.nCourses; i++){
    	Course c = st.getCourse(i);
    	System.out.println(c.getTitle()+" ("+c.getTP()+")by "+c.lecturer.getName());
    }
    }
}

