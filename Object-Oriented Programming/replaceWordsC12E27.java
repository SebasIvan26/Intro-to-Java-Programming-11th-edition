/*Sebas*/
/**
 * Chapter 12 Exercise 27:
 *
 *      (Replace words)
 *      Suppose you have a lot of files in a directory that contain words Exercisei_j,
 *      where i and j are digits. Write a program that pads a 0 before i if i is a
 *      single digit and 0 before j if j is a single digit. For example, the word Exercise2_1
 *      in a file will be replaced by Exercise02_01. In Java, when you pass the symbol *
 *      from the command line, it refers to all files in the directory (see Supplement III.V).
 *      Use the following command to run your program.
 *
 * 
 */
import java.io.*;
import java.net.*;
import java.util.*;

class Exercise_27 {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Invalid Arguments.");
			System.out.println("Usage: java Chapter_12.Exercise_27");
			System.exit(1);
		}
		for (String s : args) {

			if (s.matches("Exercise[\\d]_[\\d].*")) {
				StringBuilder sb = new StringBuilder(s);
				sb.insert(s.indexOf('_') - 1, "0");
				sb.insert(s.indexOf('_') + 2, "0");
				new File(s).renameTo(new File(sb.toString()));
			}
		}

	}

}