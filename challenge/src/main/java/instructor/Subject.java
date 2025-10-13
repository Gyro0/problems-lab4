package instructor;

public class Subject {
    private Instructor instructor;
    private int id;
    private String code;
    private String title;

    public String normalizedCode(){
        StringBuilder result=new StringBuilder();
        for(char c:this.code.toCharArray()){
            if(c>='a' && c<='z'){
                result.append((char)(c - 'a' + 'A'));
            }
            else{
                result.append(c);
            }
        }
        return result.toString();
    }
    public String properTitle(){
        StringBuilder result=new StringBuilder();
        char[] titleArray=this.title.toCharArray();
        for(int i=0;i<titleArray.length;i++){
            if(i==0 || titleArray[i-1]==' '){
                result.append((titleArray[i]>='a' && titleArray[i]<='z')? ((char)(titleArray[i]-'a'+'A')):titleArray[i]);
            }
            else{
                result.append(titleArray[i]);
            }
        }
        return result.toString();
    }
    public boolean isIntroCourse(){
        if((title!=null && title.toLowerCase().contains("intro")) || (code!=null && code.toLowerCase().startsWith("INTRO-"))){
            return true;
        }
        else{
            return false;
        }
    }
    public String syllabusLine(){
        StringBuilder result = new StringBuilder();
        result.append(code).append(" - ").append(title);
        if (instructor!=null) {
            result.append(" (Instructor: ").append(instructor.getSecondName()).append(", ").append(instructor.getFirstName()).append(")");
        }
        return result.toString();
    }

}

