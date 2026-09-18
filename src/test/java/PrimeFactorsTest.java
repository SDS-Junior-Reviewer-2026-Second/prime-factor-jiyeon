import org.example.primeFactors.PrimeFactors;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsTest {

	@Test
	public void testPrimefactor0f1() {
		PrimeFactors primefactors = new PrimeFactors();
		assertEquals(Arrays.asList(), primefactors.of(1));
	}

	@Test
	void testPrimeFactorOf2() {
		PrimeFactors primefactors = new PrimeFactors();
		assertEquals(Arrays.asList(2), primefactors.of(2));
	}

}
