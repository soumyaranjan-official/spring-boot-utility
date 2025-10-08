package org.app.utility.spring.util;


public final class PrintUtil {

    private PrintUtil() {
    }

    /**
     * Print without newline (like System.out.print)
     */
    public static void print(Object message) {
        System.out.print(message);
    }

    /**
     * Print with newline (like System.out.println)
     */
    public static void println(Object message) {
        System.out.println(message);
    }


}
