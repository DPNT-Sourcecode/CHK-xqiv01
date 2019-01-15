package befaster.solutions.CHK;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private CheckoutSolution chOut;

    @Before
    public void setUp() {

    	chOut = new CheckoutSolution();
    }

    @Test
    public void compute_sum() {
        assertThat(chOut.checkout("XYZ"), equalTo(45));
    }
}


