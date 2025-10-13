package student;

public class Major {
    private static int nextId = 1;
    private static int maxStudentsInMajor=50;
    private static int maxMajors=10;
    private static final Major[] existingMajors = new Major[maxMajors];
    private static int majorCount=0;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major(){
        this.id=nextId++;
        studentCount=0;
        students= new Student[maxStudentsInMajor];
    }

    public Major(String code, String name) {
        this();
        this.code=code;
        this.name=name;

    }
    // Method to add a student
    public void addStudent(Student s){
        students[studentCount]=s;
        studentCount++;
    }

    public static Major getOrCreate(String code, String name) {

        // search existing majors by code
        for (int i=0;i<majorCount;i++){
            Major major=existingMajors[i];
            if (major!=null && major.getCode()!=null && major.getCode().equals(code)){
                return major;
            }
        }
        Major major = new Major(code, name);
        existingMajors[majorCount] = major;
        majorCount++;
        return major;
    }
    // Getters
    public int getId(){return this.id;}
    public String getCode(){return this.code;}
    public String getName(){return this.name;}
    public Student[] getStudents(){return this.students;}
    //setters
    public void setId(int id){this.id=id;}
    public void setCode(String code){this.code=code;}
    public void setName(String name){this.name=name;}
    public void setStudents(Student[] students){this.students=students;}
    public void setStudentCount(int studentCount){this.studentCount=studentCount;}
    // Display all students in the major
    public void displayStudents() {
        System.out.println("The list of students in the "+this.name+" major is:");
        for(int i=0;i<studentCount;i++){
            System.out.println((i+1)+". "+students[i].getId()+" "+students[i].getFullNameFormatted());
        }
    }
    @Override
    public String toString(){
        return "{Major: Id:"+id+", Name:"+name+", Number of Students:"+studentCount+" }";
    }

    public Student findStudentByCNE(String cne){
        if(cne==null)return null;
        int i=0;
        boolean found=false;
        int studentsIndex=-1;
        while(found==false && i<studentCount){
            if(students[i].getCne()!=null && students[i].getCne()==cne){
                found=true;
                studentsIndex=i;
            }
            i++;
        }
        if(found){return students[studentsIndex];}
        else{return null;}
    }

    public int getStudentCount(){return this.studentCount;}

    public boolean removeStudent(String cne){
        if(cne==null) return false;
        Student student=findStudentByCNE(cne);
        if(student!=null){
            Student[] newStudents=new Student[maxStudentsInMajor];
            int i=0;
            int j=0;
            while(i<studentCount){
                if(students[i]!=student){
                    newStudents[j]=students[i];
                    j++;i++;
                }
                else{
                i++;
                }
            }
            students=newStudents;
            studentCount--;
            return true;
        }
        else{
            return false;
        }
    }
    public void getOccupancyRate(){
        double percentage=(studentCount/50.0)*100;
        System.out.printf("%s capacity: %d students\n",name,maxStudentsInMajor);
        System.out.printf("Current enrollment: %d students\n",studentCount);
        System.out.printf("Occupancy rate = %.1f %%\n",percentage);
    }
    public String getStudentListAsString(){
        StringBuilder result=new StringBuilder("The list of students in the ");
        result.append(name);
        result.append(" major is:\n");
        for(int i=0;i<studentCount;i++){
            result.append((i+1));
            result.append(". ");
            result.append(students[i].getId());
            result.append(" ");
            result.append(students[i].getFullNameFormatted());
            result.append("\n");
        }
        return result.toString();
    }
}
