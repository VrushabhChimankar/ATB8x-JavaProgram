package sept_ex_20092024;

public class Lab_026 {

    public static void main(String[] args) {

        //Ternary operator
        //Syntax : condition ? expression if true : exp if false
        byte a = (10>20) ? 10 : 20; //expression is false thats why printing 20
        System.out.println(a);

        byte vrushabh = 4;
        byte pintu = 6;
        byte max_salary = (vrushabh>pintu) ? vrushabh : pintu; //pintu salary is grater than vrushabh
        System.out.println(max_salary);

    }
}
