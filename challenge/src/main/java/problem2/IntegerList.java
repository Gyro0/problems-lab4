package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int size;
    int numberOfInt;
//-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        this.size=size;
        this.numberOfInt=0;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++){
            list[i] = (int)(Math.random() * 100) + 1;}
        numberOfInt=list.length;
        
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize(){
        int[] newList= new int[2*size];
        for(int i=0;i<numberOfInt;i++){
            newList[i]=this.list[i];
        }
        this.list=newList;
        this.size=size*2;

    }
    public void addElement(int newVal){
        if(numberOfInt==size){
            this.increaseSize();
        }
        list[numberOfInt]=newVal;
        numberOfInt++;
    }
    public void removeFirst(int newVal){
        boolean found=false;
        int i=0;
        while(found==false){
            if(i==list.length && found==false){
                System.out.println("int not found in the list");
                break;
            }
            if(list[i]==newVal){
                found=true;
                break;
            }
            i++;
        }
        for(int j=i;j<list.length-1;j++){
            list[j]=list[j+1];
        }
        list[list.length-1]=0;
        numberOfInt--;
    }
    public void removeAll(int newVal){
        int i=0;
        while(i<numberOfInt){
            if(list[i]==newVal){
                for(int j=i;j<numberOfInt-1;j++){
                    list[j]=list[j+1];
                }
                list[numberOfInt-1]=0;
                numberOfInt--;
            }
            else{
                i++;
            }
        }
    }
}