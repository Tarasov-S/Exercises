package thinkinginjava.chapter2.exercise12;

/*
 * Chapter 2. Exercise 12. Difficult - 2/10.
 *
 * Find the code for the second version of HelloDate.java, which is the simple comment documentation example.
 * Execute Javadoc on the file and view the results with your Web browser.
 */

import java.util.Date;

/**
 * The first Thinking in Java example program.
 * Displays a string and today's date.
 *
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */
public class HelloDate {

    /**
     * Entry point to class & application.
     *
     * @param args array of string arguments
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
}

/*
 * Run:
 *
 * $ javadoc -d ./doc HelloDate.java
 * Loading source file HelloDate.java...
 * Constructing Javadoc information...
 * Standard Doclet version 1.8.0_102
 * Building tree for all the packages and classes...
 * Generating .\doc\thinkinginjava\chapter2\exercise12\HelloDate.html...
 * HelloDate.java:23: error: bad HTML entity
 *      * Entry point to class & application.
 *                             ^
 * HelloDate.java:26: error: reference not found
 *      * @throws exceptions No exceptions thrown
 *        ^
 * Generating .\doc\thinkinginjava\chapter2\exercise12\package-frame.html...
 * Generating .\doc\thinkinginjava\chapter2\exercise12\package-summary.html...
 * Generating .\doc\thinkinginjava\chapter2\exercise12\package-tree.html...
 * Generating .\doc\constant-values.html...
 * Building index for all the packages and classes...
 * Generating .\doc\overview-tree.html...
 * Generating .\doc\index-all.html...
 * Generating .\doc\deprecated-list.html...
 * Building index for all classes...
 * Generating .\doc\allclasses-frame.html...
 * Generating .\doc\allclasses-noframe.html...
 * Generating .\doc\index.html...
 * Generating .\doc\help-doc.html...
 * 2 errors
 *
 * $
 *
 */
