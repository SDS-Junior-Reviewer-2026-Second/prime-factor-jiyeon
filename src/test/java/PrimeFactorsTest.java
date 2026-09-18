import org.example.primeFactors.PrimeFactors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsTest {

	private PrimeFactors primeFactors;

	@BeforeEach
	void setUp() {
		primeFactors = new PrimeFactors();
	}


	@Test
	public void testPrimefactorOf1() {
		assertEquals(Arrays.asList(), primeFactors.of(1));
	}

	@Test
	void testPrimeFactorOf2() {
		assertEquals(Arrays.asList(2), primeFactors.of(2));
	}

	@Test
	void testPrimeFactorOf3() {
		assertEquals(Arrays.asList(3), primeFactors.of(3));
	}

	@Test
	void testPrimeFactorOf4() {
		assertEquals(Arrays.asList(2,2), primeFactors.of(4));
	}

}
