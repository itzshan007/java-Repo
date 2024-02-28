package z_Learn_java;

public class DataType {

    /*
     * Java Have Two Main Type
     * Primetive
     * Reference Data type
     */

    // byte,short,int,long,float,double,char,boolean all 8 are primitive datatypes
    // Array,Classes,Enum,Interfaces are references datatypes

    public static void main(String[] args) {
        byte b = 112;
        short s = 213;
        int i = 87676612;
        long l = 989080878908l;
        float f = 1.2f;
        double d = 99889.212;
        char c = 'a';
        boolean bool = true;
        // char have also increment "a" change "b"
        c++;

        // Number see esaly use _ in java
        int num = 10_000_000; // output 10000000
        System.err.println(num);
        System.out.println("char value : " + c);
        System.out.println("byte : " + b + " short : " + s + " int : " + " long : " + " flaot : " + f + " double : " + d
                + " boolean : " + bool);
        b = Byte.SIZE;
        s = Short.SIZE;
        i = Integer.SIZE;
        l = Long.SIZE;
        f = Float.SIZE;
        d = Double.SIZE;
        c = Character.SIZE;
        System.out.println("Size of Char : " + c + "\nSize of byte : " + b + " Size of short : " + s
                + " Size of  int : " + i + " Size of long : " + l + " Size of flaot : " + f + " Size of double : " + d);

        b = Byte.MAX_VALUE;
        s = Short.MAX_VALUE;
        i = Integer.MAX_VALUE;
        l = Long.MAX_VALUE;
        f = Float.MAX_VALUE;
        d = Double.MAX_VALUE;
        c = Character.MAX_VALUE;
        System.out.println("<----------------------------------->\n Max of Char : " + c + "\n Max of byte : " + b
                + " Max of short : " + s + " Max of  int : " + i + " Max of long : " + l + " Max of flaot : " + f
                + " Max of double : " + d);

        // References data type
        int[] arr = {1,2,3,6,8,9};
        String name = "Java world";
        DataType obj = new DataType();
        

    }

}
