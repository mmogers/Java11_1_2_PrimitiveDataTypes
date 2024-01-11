/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Declare and Initialize Variables
Sub-Topic: Initialization of primitive data type variables - including default values
*/

public class FooBar {
    public static void main(String[] args) {

        int p;  // p is an uninitialized local variable here

        boolean myBoolean = true;

        // If/Else statement satisfies compiler's full initialization check
        if (myBoolean) {
            p = 1;
        } else {
            p = 2;
        }

        System.out.println("p is " + p);  // p is now fully initialized

        int q;  // q is an uninitialized local variable here
        // If statement with static boolean value satisfies compiler's full initialization check
        if (true) {
            q = 1;
        }
        System.out.println("q is " + q);  // q is now fully initialized

        // switch statement with a default block satisfies compiler's full initialization check

        int testInt = 5;  // test variable for switch statement.
        int r;  // r is an uninitialized local variable here
        switch (testInt) {
            case 0:
            case 1:
            case 2:
                r = 1;
                break;
            case 3:
            case 4:
            case 5:
                r = 2;
                break;
            default:
                r = 3;
            /*default: // r is not initialized, compliler error
                r = 3;*/
        }
        System.out.println("r is " + r);   // r is now fully initialized

        // do while statement  satisfies compiler's full initialization check
        int s, t = 0;  // s is an uninitialized local variable here
        do {
            s = t++;
        } while (t < 1);
        System.out.println("s is " + s);   // s is now fully initialized

        // while statement  satisfies compiler's full initialization check only if condition is staticly known
        int u, v = 0;  // u is an uninitialized local variable here
        while (true) { //condition statically known
     // while (v<1) { // not initialized
            u = v++;
            break;

        }
        System.out.println("u is " + u);


    }
}