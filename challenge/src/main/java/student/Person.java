package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;
    public Person() {
        this.id = nextId++;
    }

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.secondName=secondName;
        this.phone=telephone;
        this.email=email;
    }

    //getters
    public int getId(){return this.id;};
    public String getFirstName(){return this.firstName;};
    public String getSecondName(){return this.secondName;};
    public String getPhone(){return this.phone;};
    public String getEmail(){return this.email;};
    //setters
    public void setId(int id){this.id=id;};
    public void setFname(String Fname){this.firstName=Fname;}
    public void setLname(String Sname){this.secondName=Sname;}
    public void setPhone(String phone){this.phone=phone;};
    public void setEmail(String email){this.email=email;};

    @Override
    public String toString(){
        return "{Person: First Name : "+firstName+", Last Name : "+secondName+", Phone : "+phone+", Email : "+email+" }";
    }
}

