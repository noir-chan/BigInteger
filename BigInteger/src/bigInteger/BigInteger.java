/*Jennifer Palazzolo
 * Assignment00
 * Due Date: 01/30/2018
 * Computer Programming II 2045C/001/Spring2018
 * Citations:
 * Calculates: running BigInteger in eclipse
 */
package bigInteger;

import java.math.BigInteger;

public class BigInteger {
	BigInteger bi = new BigInteger();
	
	public boolean isPrime(BigInteger number) {
		boolean result = true;
		if (number == 2) result = true;
		for (int i = 3; i <= number/2; i += 2) {
			if (number % i == 0) {result = false}
		}
		return result;
	}
}
