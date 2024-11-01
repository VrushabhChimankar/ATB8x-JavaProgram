package CollectionFramework2;

import java.util.ArrayList;
import java.util.List;

public class Lab_List {

    public static void main(String[] args) {

       Students s1 = new Students("Vrushabh",1);
       Students s2 = new Students("Chimankar", 2);

        List<Students> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        System.out.println(myStudents);





    }

}

class Students{

    String name;
    Integer rollNo;

    public Students(String name, Integer rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public Integer getRollNo(){
        return rollNo;
   }

   public void setRollNo(Integer rollNo){
        this.rollNo = rollNo;
   }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}



