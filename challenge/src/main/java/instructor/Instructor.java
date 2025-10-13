package instructor;
import student.Person;

public class Instructor extends Person{
    private String employeeNumber;
    private Subject subject;
   // public Person(String firstName, String secondName, String telephone, String email) {
    public Instructor(){super();}
    public Instructor(String firstName, String secondName, String telephone, String email,String employeeNumber){
        super(firstName,secondName,telephone,email);
        this.employeeNumber=employeeNumber;
    }
    public String getEmployeeNumber(){return this.employeeNumber;}
    public Subject getSubject(){return this.subject;}



    public String cleanEmployeeNumber(){
        StringBuilder result=new StringBuilder();
        for(char c:this.employeeNumber.toCharArray()){
            if(c!=' '){
                result.append(c);
            }
        }
        return result.toString();
    }

    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",this.employeeNumber,this.secondName,this.firstName);
    }

    public String toCard(){
        StringBuilder result=new StringBuilder();
        result.append("Instructor\n");
        result.append("----------\n");
        result.append("Employee #: ").append(this.employeeNumber).append("\n");
        result.append("Name :").append(this.secondName).append(", ").append(this.firstName).append("\n");
        result.append("Email :").append(this.email).append("\n");
        result.append("Phone :").append(this.phone).append("\n");
        return result.toString();
    }
    public String displayName(){
        StringBuilder result = new StringBuilder();
        if (this.secondName!=null) {
            result.append(this.secondName.toUpperCase());
        }
        if (this.firstName!=null) {
            if (result.length()>0){result.append(" ");}
            result.append(this.firstName);
        }
        return result.length()>0?result.toString():"No name is found";
    }
}
