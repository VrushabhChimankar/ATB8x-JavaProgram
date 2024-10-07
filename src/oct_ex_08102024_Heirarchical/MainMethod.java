package oct_ex_08102024_Heirarchical;

public class MainMethod {
    public static void main(String[] args) {

        BrotherOne b = new BrotherOne();
        b.Home();
        b.IamBrother();

        BrotherTwo b1 = new BrotherTwo();
        b1.Home();
        b1.IamBrotherTwo();

        Daughter d = new Daughter();
        d.Home();
        d.IamDaughter();



    }
}
