/*Abby Thompson
 * Assignment03
 * Due Date: 01/30/2018
 * Computer Programming II 2045C/001/Spring2018
 * Citations:https://stackoverflow.com/questions/48514452/biginteger-testing-for-prime-loop-without-isprobableprime & https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html & the book
 * Calculates: running BigInteger in eclipse
 */
package testingBigInt;
import java.math.BigInteger;
public class Main {

	public static void main(String[] args) {
		BigInteger val = new BigInteger("7159");
		System.out.println("The Big Integer " + val + " is prime: " + TestingBigInt.isPrime(val) + ".");

	}

}
