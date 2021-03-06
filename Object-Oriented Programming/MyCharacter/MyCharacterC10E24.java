/*Sebas*/
import java.util.*;

/**
 * Chapter 10 Exercise 24:
 *
 *     (Implement the Character class)
 *     The Character class is provided in the Java library.
 *     Provide your own implementation for this class.
 *     Name the new class MyCharacter.
 *
 * 
 */
public class MyCharacterC10E24 {


	public static void main(String[] args) {
		MyCharacter ch = new MyCharacter('L');
		System.out.println("ch = " + ch.getChar());
		System.out.println("Is a letter: " + ch.isLetter());
		System.out.println("Is a digit: " + ch.isDigit());
		System.out.println("L == L ?" + ch.equals(new MyCharacter('L')));
	}
}