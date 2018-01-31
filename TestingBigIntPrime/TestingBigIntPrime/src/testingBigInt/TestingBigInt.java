/*Jennifer Palazzolo
 * Assignment03
 * Due Date: 01/30/2018
 * Computer Programming II 2045C/001/Spring2018
 * Citations:
 * Calculates: running BigInteger in eclipse
 */
package testingBigInt;
import java.math.BigInteger;
public class TestingBigInt {

	public static boolean isPrime(BigInteger number) {
		boolean result = true;
		if (number.longValue()== 2) {
			result = true;
			return result;
		}
		
		for (long i = 3; i <= number.longValue()/2; i += 2) {
			if (number.longValue() % i == 0) {result = false;}
		}
		
		
		return result;
	}


}
	

