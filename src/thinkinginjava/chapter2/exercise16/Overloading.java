package thinkinginjava.chapter2.exercise16;

/*
 * Chapter 2. Exercise 16. Difficult - 1/10.
 *
 * In the Initialization & Cleanup chapter, locate the Overloading.java example and add Javadoc documentation.
 * Extract this comment documentation into an HTML file using Javadoc and view it with your Web browser.
 */

import static thinkinginjava.chapter2.exercise16.Print.print;

/**
 * Demonstrate method overloading.
 *
 * @author Sergei Tarasov
 * @version 1.0
 */
class Tree {

    private int height;

    /**
     * Overloaded constructor without parameters.
     * Sets the height of 0.
     */
    Tree() {
        print("Planting a seedling");
        height = 0;
    }

    /**
     * Overloaded constructor with parameter.
     * Sets the height of "initialHeight".
     *
     * @param initialHeight Sets the height of a new tree.
     */
    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating new Tree that is " +
                height + " feet tall");
    }

    /**
     * Overloaded method without parameters.
     * Displays the height of the tree.
     */
    void info() {
        print("Tree is " + height + " feet tall");
    }

    /**
     * Overloaded method with parameter.
     *
     * @param s is added to the beginning of the message.
     */
    void info(String s) {
        print(s + ": Tree is " + height + " feet tall");
    }
}

/**
 * Demonstrate overloading methods and constructors.
 *
 * @author Sergei Tarasov
 * @version 1.0
 */
public class Overloading {

    /**
     * Entry point to class and application.
     *
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
            print();
        }
        // Overloaded constructor:
        new Tree();
    }
}

/*
 * $ javadoc -package  -d ./doc *
 * Loading source file Overloading.java...
 * Loading source file Print.java...
 * Constructing Javadoc information...
 * Creating destination directory: "./doc\"
 * Standard Doclet version 1.8.0_102
 * Building tree for all the packages and classes...
 * Generating .\doc\thinkinginjava\chapter2\exercise16\Overloading.html...
 * Generating .\doc\thinkinginjava\chapter2\exercise16\Print.html...
 * Generating .\doc\thinkinginjava\chapter2\exercise16\Tree.html...
 * Generating .\doc\thinkinginjava\chapter2\exercise16\package-frame.html...
 * Generating .\doc\thinkinginjava\chapter2\exercise16\package-summary.html...
 * Generating .\doc\thinkinginjava\chapter2\exercise16\package-tree.html...
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
 *
 * $
 */
