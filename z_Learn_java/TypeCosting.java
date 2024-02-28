package z_Learn_java;

public class TypeCosting {

    /*
     * This is type Convertion in java
     * implicit small type convert to assined bigger type
     * but lorge value assined in small byte explicitly convet the data
     */

    public static void main(String[] args) {

    // implicit :
        byte b = 126;
        int i = b;
        System.err.println("Byte value : "+i);
    // explicit : 
        int a = 2901;
    //  byte c = a; this is getting the error
        byte c = (byte)a;
        // This is work in (byte_max_value % a_value) --> c = remainder_value
        System.out.println("Int value : "+c);
        double d = 20981.878;
        float f = (float)d;
        System.out.println("Float value : "+f);
    

    }
}
