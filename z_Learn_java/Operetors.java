package z_Learn_java;

public class Operetors {
    /*
     * Java Operetors -------->
     *
     * Arithmetic Operetor
     * Assingnment Operetor
     * Comparsion Operetor (or) Reletional Operetor
     * Logical Operetor
     * Unary Operetor
     * Bitwise Operetor
     * conditional Operetor
     */

    public void arithmticOperetors() {

        /*
         * addition,subtraction,multipulication,divison,modulus
         * + , - , * , / , %
         * modulus have getting the
         */

        System.out.println("Arithmetic Operetors ---> ");
        int num1 = 6;
        int num2 = 3;
        int result;
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result); // +
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result); // -
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result); // *
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result); // /
        result = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + result); // %

    }

    public void assignmentOperetors() {
        /*
         * This is assign The value in the variable
         * assignment,add and assign,subtract assign,multiplay and assign, divide and
         * assign , modulus and assign
         * = , +=, -= , *= , /= , %=
         */
        System.out.println("Assignment Operetors ---> ");
        int num = 8;
        num += 2;
        System.out.println("num value 8 operetion value 2  \n" + num + " += ");
        num -= 2;
        System.out.println(num + " -= ");
        num *= 2;
        System.out.println(num + " *= ");
        num /= 2;
        System.out.println(num + " /= ");
        num %= 2;
        System.out.println(num + " %= ");

    }

    public void comparisonOperetor() {

        /*
         * This is compar the two values
         * This is return the true are false
         * equal to ,not equal to ,less then , greate then , less then are equal to ,
         * greate then are equal to
         * == , != , < , > , <= , >=
         */

        System.out.println("Comparison Operetor ---> ");
        int num1 = 8;
        int num2 = 6;
        System.out.println(num1 + " == " + num2 + " ->> " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " ->> " + (num1 != num2));
        System.out.println(num1 + " < " + num2 + " ->> " + (num1 < num2));
        System.out.println(num1 + " > " + num2 + " ->> " + (num1 > num2));
        System.out.println(num1 + " <= " + num2 + " ->> " + (num1 <= num2));
        System.out.println(num1 + " >= " + num2 + " ->> " + (num1 >= num2));

    }

    public void logicalOperetor() {

        /*
         * This is logical operetor |or| conditional operetors values
         * Ex The number equal == 8 not equals != 9 the
         * && , || , !
         */
        System.out.println("Logical Operetor ---> ");
        int num = 7;
        System.out.println(" && --> " + (num >= 3 && num % 3 == 1));
        System.out.println(" || --> " + (num == 6 || num == 7));
        System.out.println(" !true --> " + (!true));
    }

    public static void main(String[] args) {

        Operetors obj = new Operetors();

        // obj.arithmticOperetors();
        // obj.assignmentOperetors();
        //obj.comparisonOperetor();
        //obj.logicalOperetor();

    }

}
