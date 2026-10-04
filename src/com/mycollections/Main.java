/**
 *  Java program to create, update, and delete HashSet.
 */

package com.mycollections;

import java.util.HashSet;
import java.util.Set;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create the instance of HashSet.
        Set<Byte> mySet = new HashSet<>();

        // Add values.
        mySet.add((byte) -128);
        mySet.add((byte) 127);
        mySet.add((byte) 12);
        mySet.add((byte) 17);
        mySet.add((byte) 27);
        mySet.add((byte) -129);

        // Print values of mySet.
        System.out.println(mySet); // Output: [17, 27, 12, -128, 127]

        // Remove.
        mySet.remove((byte)127);

        // Print values of mySet.
        System.out.println(mySet); // Output: [17, 27, 12, -128]

        // Remove.
        mySet.remove((byte)12);

        // Print values of mySet.
        System.out.println(mySet); // Output: [17, 27, -128]

    }
}