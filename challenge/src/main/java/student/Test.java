package student;

public class Test {
    public static void main(String[] args) {
        Major cs = Major.getOrCreate("23","Computer Science");
        Major medecine = Major.getOrCreate("24","Medecine");
        Major physics= Major.getOrCreate("25","Physics");
        Major electricEngineering = Major.getOrCreate("26","Electrical Engineering");
        //Student(String nom, String prenom, String telephone, String email, String cne) {
        Student s1=new Student("Doe","John","123456789","john.doe@email.com","CNE1");
        Student s2=new Student("Smith","Jane","987654321","jane.smith@email.com","CNE2",cs);
        Student s3=new Student("Johnson","Bob","555666777","bob.johnson@email.com","CNE3",medecine);
        Student s4=new Student("Williams","Alice","444333222","alice.williams@email.com","CNE4",physics);
        Student s5=new Student("Brown","Charlie","111222333","charlie.brown@email.com", "CNE5",electricEngineering);
        Student s6=new Student("Joestar","Johnny","1214541254","john.doe@email.com","CNE1");
        // Display computer science students
        cs.displayStudents();

        // display medecine students;
        medecine.displayStudents();

        //search student by cne 
        Student studentSearchedInCs=cs.findStudentByCNE("CNE2");
        System.out.println("==Search Student By CNE 1==");
        System.out.println(studentSearchedInCs!=null ? studentSearchedInCs : "Student not found");

        Student studentSearchedInMed=medecine.findStudentByCNE("CNE2");
        System.out.println("==Search Student By CNE 2==");
        System.out.println(studentSearchedInMed!=null ? studentSearchedInMed : "Student not found");

        //removing a student

        System.out.println("==Cs major before removing a student==");
        cs.displayStudents();
        cs.removeStudent("CNE2");
        System.out.println("==Cs major after removing a student==");
        cs.displayStudents();

        //display occupied capacity

        System.out.println("==Occupied capacity of CS==");
        cs.getOccupancyRate();

        //students list as string
        String studentListAsString=cs.getStudentListAsString();
        System.out.println(studentListAsString);
        
    }
}

