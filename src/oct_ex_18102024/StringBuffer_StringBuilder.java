package oct_ex_18102024;

public class StringBuffer_StringBuilder {
    public static void main(String[] args) {

        //String buffer are mutable in nature and thread safety
        StringBuffer stringBuffer = new StringBuffer("Vrushabh");
        stringBuffer.append("Chimankar");
        System.out.println(stringBuffer);

        //String builder are aslo mutable in nature but not thread safety
        StringBuilder stringBuilder = new StringBuilder("Vrushabh");
        stringBuilder.append("Chimankar");
        System.out.println(stringBuilder);
    }
}
