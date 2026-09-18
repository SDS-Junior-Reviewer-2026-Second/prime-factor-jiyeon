import org.example.primeFactors.PrimeFactors;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsTest {

	@Test
	public void testPrimefactor0f1() {
		PrimeFactors primefactor = new PrimeFactors();
		assertEquals(Arrays.asList(), primefactor.of(1));
	}

}
