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
    	profv[0] = new Faculty("�豳��", 48, "�λ�� ����", 5000000, "��������");
    	profv[1] = new Faculty("�ű���", 43, "�λ�� �ؿ�뱸", 4000000, "��������");
    	profv[2] = new Faculty("Ȳ����", 54, "�λ�� �ϱ�", 5000000, "��������");
    	profv[3] = new Faculty("������", 53, "�λ�� ����", 4000000, "��������");
    	profv[4] = new Faculty("����", 38, "�λ�� ����", 3000000, "��������");
    	jigwon = new Staff("�ڰ���", 42, 4000000, "���к���");
    	jigwon.setDepartment("������");
    	
    	ppv[npp++] = profv[0];
    	ppv[npp++] = profv[1];
    	ppv[npp++] = profv[2];
    	ppv[npp++] = profv[3];
    	ppv[npp++] = profv[4];
    	ppv[npp++] = jigwon;
    }

    void report() {	// ������ �Ұ�, �������, �����⼮��, ���� �ð�ǥ
    	print_people(); //see below
    	print_�������();
    	for(int i=0; i<crsv.length; i++){
    	print_�⼮��(crsv[i]);}
    	for(int i=0; i<stv.length; i++){
    	print_�л��ð�ǥ(stv[i]);}
    	// +++
    }

    void run_school() {	//- 3 steps - 
    	recruit_�л�();
    	open_����();
    	register_��������();
    	
    	// ++++
    	
    }

    void recruit_�л�() {	// (1)'
        String namev[] = {"������", "�����", "�����", "�����", "�ݿ���","�����", "�����", "������", "���Ѽ�", "������","����","���","�����","������","ȣ����"};
        int agev[] = {21, 24, 22, 19, 21, 21, 21, 21, 23, 21,25,24,23,21,20};
        
        stv = new Student[namev.length]; //�л���?
        for(int i = 0; i < namev.length; i++) {
        	stv[i] = new Student(namev[i], agev[i], 2, 200912345+i, "IT���������");
        	ppv[npp++] = stv[i];
        }
    }

    void open_����() {
    	crsv = new Course[5]; //�ΰ��� ����
    	crsv[0] = new Course("Java ", profv[0], "Mon 7-8, Wed 7-8", "1325");
    	crsv[1] = new Course("Graphics ", profv[1], "Wed 7-8, Thu 7-8", "1325");
    	crsv[2] = new Course("c���α׷��� ", profv[2], "Fri 7-8, Thu 2-3", "1321");
    	crsv[3] = new Course("�������� ", profv[3], "Thu 3-4, Fri 1-2", "1323");
    	crsv[4] = new Course("�̻���� ", profv[4], "Wed 2-3, Thu 7-8", "1307");
    }

    void register_��������() {
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
    	

    	System.out.println("������û:"+(oo_list.length + cg_list.length)+"��-����.");
    }

    void print_people() {
        for(int i = 0; i < npp; i++){
            System.out.println("<" + (i + 1) + ">---------------------------");
            ppv[i].info();
        }
    }

    void print_�������() {
    	System.out.println("\n- ������� -");
    	for(int i = 0; i < crsv.length; i++) crsv[i].info();
    }

    void print_�⼮��(Course cs) {
	System.out.println("--------------------------------------------------------");
    
    System.out.println("���� : " +cs.getTitle() + "(" + cs.getTP()+")"+"��米�� : " +cs.lecturer.getName());
    System.out.print("    ");
    for(int n = 1; n<=16; n++) System.out.printf("%3d",n);
    System.out.println("");
    cs.listRegisters();
    }

    void print_�л��ð�ǥ(Student st) {
    	System.out.println("\n<< ��������/�ð�ǥ >>");
    	System.out.println("�̸�:"+st.getName());
    	for(int i=0; i<st.nCourses; i++){
    	Course c = st.getCourse(i);
    	System.out.println(c.getTitle()+" ("+c.getTP()+")by "+c.lecturer.getName());
    }
    }
}

