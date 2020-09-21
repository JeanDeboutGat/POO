
import static org.junit.Assert.*;

import org.junit.Test;
import pfc.strategy.PaperStrategy;
import pfc.Shape;
public class PaperStrategyTest{

	@Test
	public void ShapeISPaper() {

    PaperStrategy paperShape= new PaperStrategy();
    assertSame( Shape.PAPER,paperShape.getShape());
	}

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(PaperStrategyTest.class);
    }


}
