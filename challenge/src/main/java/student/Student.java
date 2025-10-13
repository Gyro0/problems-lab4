package student;

public class Student extends Person {
    private String cne;
    private Major major;
    public Student(){
        super();
    }
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom,nom,telephone,email);
        this.cne=cne;
        this.major=major;
        if (major!=null) {
            major.addStudent(this);
        }
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom,prenom,telephone,email,cne, Major.getOrCreate("23","Computer Science"));
    }

    // Getters
    public String getCne(){return this.cne;}
    public Major getMajor(){return this.major;}

    // Setters
    public void setCne(String cne){this.cne=cne;}
    public void setMajor(Major major){this.major=major;}

    @Override
    public String toString(){
        return this.id+" "+this.getFullNameFormatted();
    }

    public String getFullNameFormatted(){
        return String.format("%s, %s",this.secondName.toUpperCase(),this.firstName);
    }
}

